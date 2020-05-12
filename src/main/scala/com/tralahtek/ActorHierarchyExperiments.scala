import akka.actor.typed.ActorSystem
import akka.actor.typed.Behavior
import akka.actor.typed.PostStop
import akka.actor.typed.Signal
import akka.actor.typed.scaladsl.AbstractBehavior
import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.scaladsl.Behaviors

object PrintMyActorRefActor{
  def apply(): Behavior[String]=
    Behaviors.setup(context=> new PrintMyActorRefActor(context))
}
class PrintMyActorRefActor(context:ActorContext[String]) extends AbstractBehavior[String](context){
  override def onMessage(msg:String):Behavior[String]=
    msg match{
      case "printit"=>
        val secondRef=context.spawn(Behaviors.empty[String],"second-actor")
        println(s"Second: $secondRef")
        this
      case "stop"=>Behaviors.stopped
    }
  override def onSignal: PartialFunction[Signal, Behavior[String]]={
    case PostStop=>
      println("PrintMyActorRefActor Stopped")
      this
  }
}
object Main{
  def apply():Behavior[String]=
    Behaviors.setup(context=>new Main(context))
}
class Main(context: ActorContext[String]) extends AbstractBehavior[String](context){
  override def onMessage(msg:String):Behavior[String]=
    msg match{
      case "start"=>
        val firstRef=context.spawn(PrintMyActorRefActor(),"first-actor")
        println(s"First: $firstRef")
        firstRef ! "printit"
        this
      case "stop"=>Behaviors.stopped
    }
  override def onSignal: PartialFunction[Signal, Behavior[String]]={
    case PostStop=>
      println("testSystem Stopped")
      this
  }
}

object ActorHierarchyExperiments extends App{
  val testSystem=ActorSystem(Main(),"testSystem")
  testSystem ! "start"
  testSystem ! "stop"
}
