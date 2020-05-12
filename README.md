
[![Build Status](https://travis-ci.com/TralahM/IOT-System.svg?branch=master)](https://travis-ci.com/TralahM/IOT-System)
[![License: MIT](https://img.shields.io/badge/License-MIT-red.svg)](https://opensource.org/licenses/MIT)
[![Organization](https://img.shields.io/badge/Org-TralahTek-blue.svg)](https://github.com/TralahTek)
[![HitCount](http://hits.dwyl.io/TralahM/IOT-System.svg)](http://dwyl.io/TralahM/IOT-System)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](https://github.com/TralahM/pull/)
[![GitHub pull-requests](https://img.shields.io/github/issues-pr/Naereen/StrapDown.js.svg)](https://gitHub.com/TralahM/IOT-System/pull/)
[![GitHub version](https://badge.fury.io/gh/Naereen%2FStrapDown.js.svg)](https://github.com/TralahM/IOT-System).
[![Made With](https://img.shields.io/badge/Language-Scala-red.svg)](https://github.com/TralahM)

# IOT-System.


[![TralahM](https://img.shields.io/badge/Engineer-TralahM-blue.svg?style=for-the-badge)](https://github.com/TralahM)
[![TralahM](https://img.shields.io/badge/Maintainer-TralahM-green.svg?style=for-the-badge)](https://github.com/TralahM)

# Documentation
Using Akka to build out part of an Internet of Things (IoT) system that reports data from sensor devices installed in customers’ homes. The example focuses on temperature readings. The target use case allows customers to log in and view the last reported temperature from different areas of their homes. You can imagine that such sensors could also collect relative humidity or other interesting data and an application would likely support reading and changing device configuration, maybe even alerting home owners when sensor state falls outside of a particular range.

In a real system, the application would be exposed to customers through a mobile app or browser. This guide concentrates only on the core logic for storing temperatures that would be called over a network protocol, such as HTTP. It also includes writing tests to help you get comfortable and proficient with testing actors.

The application consists of two main components:

- Device data collection: — maintains a local representation of the remote devices. Multiple sensor devices for a home are organized into one device group.

- User dashboard: — periodically collects data from the devices for a logged in user’s home and presents the results as a report.

The following diagram illustrates the example application architecture. Since we are interested in the state of each sensor device, we will model devices as actors. The running application will create as many instances of device actors and device groups as necessary.

![arch_boxes](arch_boxes_diagram.png)

This tutorial introduces and illustrates:

- The actor hierarchy and how it influences actor behavior
- How to choose the right granularity for actors
- How to define protocols as messages
- Typical conversational styles



# How to Install

## Building from Source for Developers

```Bash
git clone https://github.com/TralahM/IOT-System.git
cd IOT-System
```

# Contributing
[See the Contributing File](CONTRIBUTING.rst)


[See the Pull Request File](PULL_REQUEST_TEMPLATE.md)


# Support

# LICENCE

[Read the license here](LICENSE)


# Acknowledgements

[Find me on Twitter](https://twitter.com/TralahM)

[Find me on Kaggle](https://kaggle.com/TralahM)


