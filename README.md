<!-- Improved compatibility of back to top link: See: https://github.com/othneildrew/Best-README-Template/pull/73 -->
<a id="readme-top"></a>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![License][license-shield]][license-url]


<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/yzhedwin/ptspoc">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">PTS Proof of Concept</h3>

  <p align="center">
    Do Read Me
    <br />
    <a href="https://github.com/yzhedwin/ptspoc"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/yzhedwin/ptspoc">View Demo</a>
    &middot;
    <a href="https://github.com/yzhedwin/ptspoc">Report Bug</a>
    &middot;
    <a href="https://github.com/yzhedwin/ptspoc">Request Feature</a>
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

[![Product Name Screen Shot][product-screenshot]](https://example.com)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built With

This section should list any major frameworks/libraries used to bootstrap your project. Leave any add-ons/plugins for the acknowledgements section. Here are a few examples.

* [![Node][Node.js]][node-url]
* [![Spring Boot][SpringBoot]][SpringBoot-url]
* [![Java][Java]][Java-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

This is an example of how you may give instructions on setting up your project locally.
To get a local copy up and running follow these simple example steps.

### Prerequisites

- Java 21
- Gradle >=8.5
  
### Installation

_Below is an example of how you can instruct your audience on installing and setting up your app. This template doesn't rely on any external dependencies or services._

1. Clone the repo
   ```sh
   git clone https://github.com/github_username/ptspoc.git
   ```
2. Edit .gitmodules accordingly and Clone submodules
   ```sh
   git submodule sync
   git submodule update --init --recursive
   ```
3. Build the project with Gradle
    ```
    ./gradlew clean build
    ```

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
## Usage
You may start the application with the follow command after successful build

```
export SPRING_PROFILES_ACTIVE=client  # or server
./gradlew :mmi:bootRun
```

_For more examples, please refer to the [Documentation](https://example.com)_

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ROADMAP -->
## Roadmap

- [x] Add API for WebSocket and REST
- [x] Integrate App to API
- [x] Add emulator servers
- [ ] Integrate actual endpoint and entities
- [ ] Complete README
      
See the [open issues](https://github.com/othneildrew/Best-README-Template/issues) for a full list of proposed features (and known issues).

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Top contributors:


<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- LICENSE -->
## License

Distributed under the Unlicense License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

Use this space to list resources you find helpful and would like to give credit to. I've included a few of my favorites to kick things off!

* [Best ReadME Template](https://github.com/othneildrew/Best-README-Template/blob/main/README.md)
* [Img Shields](https://shields.io)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/yzhedwin/ptspoc.svg?style=for-the-badge
[contributors-url]: https://github.com/yzhedwin/ptspoc/graphs/contributors
[forks-shield]: https://img.shields.io/github/contributors/yzhedwin/ptspoc.svg?style=for-the-badge
[forks-url]: https://github.com/yzhedwin/ptspoc/network/members
[stars-shield]: https://img.shields.io/github/stars/yzhedwin/ptspoc.svg?style=for-the-badge
[stars-url]: https://github.com/yzhedwin/ptspoc/stargazers
[issues-shield]: https://img.shields.io/github/issues/yzhedwin/ptspoc.svg?style=for-the-badge
[issues-url]: https://github.com/yzhedwin/ptspoc/issues
[license-shield]: https://img.shields.io/github/license/yzhedwin/ptspoc.svg?style=for-the-badge
[license-url]: https://github.com/yzhedwin/ptspoc/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[product-screenshot]: images/screenshot.png

[node-url]: https://nodejs.org/
[Node.js]: https://img.shields.io/badge/Node.js-6DA55F?logo=node.js&logoColor=white
[SpringBoot]: https://img.shields.io/badge/Spring%20Boot-6DB33F?logo=springboot&logoColor=fff
[SpringBoot-url]: https://spring.io/projects/spring-boot
[Java]: https://img.shields.io/badge/Java-%23ED8B00.svg?logo=openjdk&logoColor=white
[Java-url]: https://openjdk.org/
