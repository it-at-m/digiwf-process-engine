* Add project shields. Use [shields.io](https://shields.io/)

<div id="top"></div>

<!-- PROJECT SHIELDS -->

<!-- END OF PROJECT SHIELDS -->

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="#">
    <img src="/images/logo.png" alt="Logo" height="200">
  </a>

<h3 align="center">DigiWF <i>Process Engine</i></h3>

  <p align="center">
    <i>This project host the camunda engine for the digital workflow plattform</i>
    <br /><a href="https://github.com/it-at-m/digiwf-process-engine/issues">Report Bug</a>
    ·
    <a href="https://github.com/it-at-m/digiwf-process-engine/issues">Request Feature</a>
  </p>
</div>

<!-- ABOUT THE PROJECT -->

## About The Project

This is a component in the DigiWF Core stack. It use the camunda engine as execution tool for the BPMN processes.
<p align="right">(<a href="#top">back to top</a>)</p>

### Built With

The documentation project is built with technologies we use in our projects:

* Spring Boot
* Camunda
* TASKANA-Listener

<p align="right">(<a href="#top">back to top</a>)</p>

## Set up

Build the project in your idea or via cmd line:   
``./mvnw clean install``

Start via mvn:  
``./mvnw spring-boot:run``

You should now see in your browser the camunda login.   
Use the URL ``http://localhost:8080``  

If you need to change some settings. Look in the ``application.yml`` file under ``src/main/resources``

<p align="right">(<a href="#top">back to top</a>)</p>

## Documentation

To set up the demo process engine. Create a list of environment variables and fill them with the necessary data.  
A list of them and with example data you can find here:
```
CAMUNDA_DB_HOST=localhost
CAMUNDA_DB_PORT=5432
CAMUNDA_DB_NAME=digiwf-process-engine
CAMUNDA_DB_USER=postgres
CAMUNDA_DB_PASSWORD=password
CAMUNDA_ADMIN_USERNAME=demo
CAMUNDA_ADMIN_PASSWORD=demo
CAMUNDA_ADMIN_FIRSTNAME=Demo
CAMUNDA_ADMIN_LASTNAME=Demo
```

You can create this variables in a `.env` file. For *nix users add before every line `export` and add a space. For windows user add a `set ` for every line.  
*nix user can then do `source .env` to load the environment variables.
<p align="right">(<a href="#top">back to top</a>)</p>

<!-- CONTRIBUTING -->

## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any
contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please open an issue with the tag "enhancement", fork the repo and
create a pull request. You can also simply open an issue with the tag "enhancement". Don't forget to give the project a
star! Thanks again!

1. Open an issue with the tag "enhancement"
2. Fork the Project
3. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
4. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
5. Push to the Branch (`git push origin feature/AmazingFeature`)
6. Open a Pull Request

More about this in the [CODE_OF_CONDUCT](/CODE_OF_CONDUCT.md) file.

<p align="right">(<a href="#top">back to top</a>)</p>


<!-- LICENSE -->

## License

Distributed under the MIT License. See `LICENSE` file for more information.

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- CONTACT -->

## Contact

it@m - opensource@muenchendigital.io

[join our slack channel](https://join.slack.com/t/digiwf/shared_invite/zt-14jxazj1j-jq0WNtXp7S7HAwJA7tKgpw)

<p align="right">(<a href="#top">back to top</a>)</p>


<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
