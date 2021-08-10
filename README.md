[![Contributors][contributors-shield]][contributors-url]
[![Issues][issues-shield]][issues-url]
[![Issues-closed][issues-closed-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

![Product Name Screen Shot](readme-resources/logo.jpg)

<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#overview">Overview</a>
      <ul>
        <li><a href="#about-the-project">About the project</a></li>
        <li><a href="#built-with">Built With</a></li>
        <li><a href="#screenshots">Screenshots</a></li>
      </ul>
    </li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgements">Acknowledgements</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->

## Overview

### About the project

The client-oriented E-Commerce project. Domain knowledge - periodical publications. The system has a list of
publications that grouped by topic.

A reader can subscribe to one or more publications. An User registers in the system and has a personal account, which
displays information about publications to which he is subscribed. An unregistered user cannot subscribe. The reader has
a personal account that he can replenish. Money are withdrawn from the account under time to subscribe to the
publication.

For a list of publications there are the possibilities:

- sorting publications by title, price, publication date;
- samples of publications on a particular genre or publisher;
- search for a publication by title.

Each of the publication has its own page with detailed information about it and rates to subscribe as well.

The system administrator has the rights to: adding, deleting and editing publications; blocking, unlocking the user. In
additional users with administrator rights can add new periods for subscriptions if no one from existed meets the
requirements.

Main technical requirements:

1. The design of the code must comply with the Java Code Convention.
2. Subject area information should be stored in a relational database.
3. The application must support work with the Cyrillic alphabet (be multilingual), including when storing information in
   the database:
   1. it must be possible to switch the interface language;
   2. there should be support for input, output and storage of information (in the database), recorded in different
      languages;
4. Implement protection against re-sending data to the server when refreshing the page (implement PRG).
5. The application must be implemented authentication and authorization, delimitation of access rights of system users
   to program components. Password encryption.
6. Introduce an event log into the project using the log4j2 library.
7. The code must be documented (all top-level classes, non-trivial methods and constructors).
8. The application should be covered by modular tests (minimum coverage 70%). Integration tests.
9. Implement the mechanism of pagination of data pages.
10. All input fields must be with data validation.
11. The application must respond correctly to errors and exceptions of various kinds (the end user should not see the
    stack trace on the client side).

![Product Name Screen Shot](readme-resources/erd.png)

### Built With

* [Spring Framework](https://spring.io/)
* [ORM Hibernate](https://hibernate.org/)
* [Apache Tomcat ®](http://tomcat.apache.org/)
* [Apache Maven](https://maven.apache.org/)
* [Thymeleaf](https://www.thymeleaf.org/)
* [Bootstrap](https://getbootstrap.com)
* [JQuery](https://jquery.com)

### Screenshots

<!-- ROADMAP -->

## Roadmap

See the [open issues](https://github.com/Swoq/newsstand-reborn/issues) for a list of proposed features (and known
issues).

<!-- CONTRIBUTING -->

## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any
contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<!-- LICENSE -->

## License

Distributed under the MIT License. See `LICENSE` for more information.



<!-- CONTACT -->

## Contact

Your Name - [Mykhailo Kratiuk](https://linkedin.com/in/othneildrew) - misha.kratyuk@gmail.com

Project Link: [https://github.com/Swoq/newsstand-reborn](https://github.com/Swoq/newsstand-reborn)



<!-- ACKNOWLEDGEMENTS -->

## Acknowledgements

* [Best Practises by John Thompson](https://www.udemy.com/user/john-thompson-2/)
* [JDL Studio](https://start.jhipster.tech/jdl-studio/)
* [Spring initializr](https://start.spring.io/)

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->

[contributors-shield]: https://img.shields.io/github/contributors/Swoq/newsstand-reborn?style=for-the-badge

[contributors-url]: https://github.com/Swoq/newsstand-reborn/graphs/contributors

[issues-shield]: https://img.shields.io/github/issues/Swoq/newsstand-reborn?style=for-the-badge

[issues-url]: https://github.com/Swoq/newsstand-reborn/issues

[issues-closed-shield]: https://img.shields.io/github/issues-closed/Swoq/newsstand-reborn?style=for-the-badge

[license-shield]: https://img.shields.io/github/license/Swoq/newsstand-reborn?style=for-the-badge

[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt

[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555

[linkedin-url]: https://www.linkedin.com/in/mykhaylo-kratyuk-9864211a7/

[product-screenshot]: images/screenshot.png
