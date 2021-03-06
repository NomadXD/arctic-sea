# Arctic Sea [![Build Status](https://travis-ci.org/52North/arctic-sea.svg)](https://travis-ci.org/52North/arctic-sea) [![Maven Central](https://img.shields.io/maven-central/v/org.n52.arctic-sea/arctic-sea.svg)](https://search.maven.org/search?q=g:org.n52.arctic-sea) [![Join the chat at https://gitter.im/52North/arctic-sea](https://badges.gitter.im/52North/arctic-sea.svg)](https://gitter.im/52North/arctic-sea) [![Total alerts](https://img.shields.io/lgtm/alerts/g/52North/arctic-sea.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/52North/arctic-sea/alerts/) [![Language grade: Java](https://img.shields.io/lgtm/grade/java/g/52North/arctic-sea.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/52North/arctic-sea/context:java)

## Description

### 52°North's backbone for OGC services, clients and middleware

**52°North's Arctic Sea is a framework for developing OGC services, clients and middleware sharing concepts for encoding and decoding of different formats and encodings, workflows and configuration.**

The Arctic Sea is a stack of projects (all named after islands that are more or less in the arctic sea) that eases the development of OGC related services such as the 52°North implementation of the OGC [SOS][52n-sos] and [WPS][52n-wps] as well as clients and middleware. It compromises the following modules.

![Overview][overview]

#### Iceland [![Maven Central](https://img.shields.io/maven-central/v/org.n52.arctic-sea/iceland.svg)](https://search.maven.org/search?q=g:org.n52.arctic-sea%20and%20a:iceland*%20and%20p:jar)

Iceland is a service framework that enables the development of OGC RPC based services. It features bindings for KVP, POX, SOAP, as well as JSON-based bindings, and facilitates the rapid development of modular services that are easily configured using Faroe. Svalbard is used for request parsing and response generation.

#### Svalbard [![Maven Central](https://img.shields.io/maven-central/v/org.n52.arctic-sea/svalbard.svg)](https://search.maven.org/search?q=g:org.n52.arctic-sea%20and%20a:svalbard*%20and%20p:jar)

Svalbard consists of various decoders and encoders for OGC models like [SensorML][sensorml], [O&M][om] and [SWE Common][swe-common], service interfaces like [SOS][sos] and [WPS][wps] and a framework for developing these. This enables the creation of decoupled and reusable encoders and decoders for various encodings (like XML, JSON or NetCDF). The object models that are used can be found in 52°North Shetland and are shared across 52°North components.

#### Faroe [![Maven Central](https://img.shields.io/maven-central/v/org.n52.arctic-sea/faroe.svg)](https://search.maven.org/search?q=g:org.n52.arctic-sea%20and%20a:faroe*%20and%20p:jar)

Faroe is a configuration API currently featuring a JSON and a SQLite backend. It enables the injection and automatic configuration of settings of various types in classes, including a Spring `BeanPostprocessor`.

#### Shetland [![Maven Central](https://img.shields.io/maven-central/v/org.n52.arctic-sea/shetland.svg)](https://search.maven.org/search?q=g:org.n52.arctic-sea%20and%20a:shetland*%20and%20p:jar)

Shetland compromises classes for OGC models like [SensorML][sensorml], [O&M][om] and [SWE Common][swe-common] and various service requests and responses. These are shared across different service implementations.

#### Jan Mayen [![Maven Central](https://img.shields.io/maven-central/v/org.n52.arctic-sea/janmayen.svg)](https://search.maven.org/search?q=g:org.n52.arctic-sea%20and%20a:janmayen*%20and%20p:jar)

Jan Mayen contains various utility classes shared across Arctic Sea.

## License

All components are licensed under the [Apache License 2.0][apache-2.0].

## Changelog

... can be found on the [release page][releases].

## Quick Start

All projects are available on Maven Central.

```xml
<properties>
  <version.arctic-sea>7.2.0</version.arctic-sea>
</properties>
<dependencies>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>faroe</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>faroe-annotations</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>faroe-json</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>faroe-utils</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>iceland</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>iceland-statistics</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>iceland-statistics-generator</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>iceland-statistics-geolocation</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>iceland-statistics-kibana</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>janmayen</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>shetland</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>shetland-rdf</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>svalbard</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>svalbard-exi</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>svalbard-json</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>svalbard-json-common</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>svalbard-odata</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>svalbard-xmlbeans</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>svalbard-xmlstream</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId></artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
</dependencies>
```

For convenience the [52°North Maven parent][maven-parents] can be used:

```xml
<parent>
    <groupId>org.n52</groupId>
    <artifactId>parent</artifactId>
    <version>15</version>
</parent>
```

Development versions can be optained from the Sonatype OSS snapshot repository:

```xml
<repositories>
  <repository>
    <id>sonatype-nexus-snapshots</id>
    <url>https://oss.sonatype.org/content/repositories/snapshots</url>
    <snapshots>
      <enabled>true</enabled>
    </snapshots>
  </repository>
</repositories>
<properties>
  <version.arctic-sea>7.3.0-SNAPSHOT</version.arctic-sea>
</properties>
```

For details on how to use the components, consult their respective documentation.

## Contact

If you encounter any issues with the software or if you would like to see certain functionality added, let us know:

* Christian Autermann (c.autermann@52north.org)
* Carsten Hollmann (c.hollmann@52north.org)

## Support

You can get support in the [community mailing list and forums][mailing-lists].

## Contribute

Are you interested in contributing to the 52°North Arctic Sea and you would like to pull your changes to the 52N repository to have them available to all?

In that case we need your official permission and for this purpose we have a so-called contributors license agreement (CLA) in place. With this agreement you grant us the rights to use and publish your code under an open source license.

A link to the contributors license agreement and further explanations are available [here][licensing].


## Credits

The development of the 52°North Faroe implementation was supported by several organizations and projects. Among other we would like to thank the following organizations and project

| Project/Logo    | Description    |
| :-------------: | :------------- |
| [![NeXOS][nexos-logo]][nexos] | The development of this version of 52°North Arctic Sea was supported by the [European FP7][fp7] research project [NeXOS][nexos] (co-funded by the European Commission under the grant agreement n°614102) |
| [![BMBF][bmbf-geotechnologien-logo]][bmbf][![COLABIS][colabis-logo]][colabis] | The development of this version 52°North Arctic Sea was supported by the [German Federal Ministry of Education and Research][bmbf] research project [COLABIS][colabis] (co-funded by the German Federal Ministry of Education and Research, programme Geotechnologien, under grant agreement no. 03G0852A) |
| [![SeaDataCloud][seadatacloud-logo]][seadatacloud] | The development of this version of 52°North Arctic Sea was supported by the [Horizon 2020][h2020] research project [SeaDataCloud][seadatacloud] (co-funded by the European Commission under the grant agreement n°730960) |
| [![ODIP II][odip-ii-logo]][odip] | The development of this version of 52°North Arctic Sea was supported by the [Horizon 2020][h2020] research project [ODIP II][odip] (co-funded by the European Commission under the grant agreement n°654310) |
| [![ConnectinGEO][connectingeo-logo]][connectingeo] | The development of this version of 52°North Arctic Sea was supported by the [Horizon 2020][h2020] research project [ConnectinGEO][connectingeo] (co-funded by the European Commission under the grant agreement n°641538) |
| [![GeoViQua][geoviqua-logo]][geoviqua] | The development of this version of 52°North Arctic Sea was supported by the [European FP7][fp7] research project [GeoViQua][geoviqua] (co-funded by the European Commission under the grant agreement n°265178) |
| [![BMVI][bmvi-logo]][bmvi][![mFund][mfund-logo]][mfund][![WaCoDis][wacodis-logo]][wacodis] | The development of this version of 52°North Arctic Sea was supported by the [German Federal Ministry of of Transport and Digital Infrastructure][bmvi] research project [WaCoDis][wacodis] (co-funded by the German Federal Ministry of Transport and Digital Infrastructure, programme mFund) |
| [![BMBF][bmbf-logo]][bmbf][![FONA][fona-logo]][fona][![MuDak-WRM][mudak-wrm-logo]][colabis] | The development of this version of 52°North Arctic Sea was supported by the [German Federal Ministry of Education and Research][bmbf] research project [MuDak-WRM][mudak-wrm] (co-funded by the German Federal Ministry of Education and Research, programme [FONA][fona]) |
| [![BRIDGES][bridges-logo]][bridges]| The development of this version of the 52°North Arctic Sea was supported by the [Horizon 2020][h2020] research project [BRIDGES][bridges] (co-funded by the European Commission under the grant agreement n°635359)

[52n-sos]: https://github.com/52North/SOS
[52n-wps]: https://github.com/52North/javaPS
[apache-2.0]: https://spdx.org/licenses/Apache-2.0.html
[bmbf-geotechnologien-logo]: https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/bmbf-geotechnologien-logo.png
[bmbf-logo]: https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/bmbf-logo.png
[bmbf]: https://www.bmbf.de/
[bmvi-logo]: https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/bmvi-logo.png
[bmvi]: https://www.bmvi.de/
[bridges-logo]: https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/bridges-logo.jpg
[bridges]: http://www.bridges-h2020.eu/
[colabis-logo]: https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/colabis-logo.png
[colabis]: https://colabis.de/
[connectingeo-logo]: https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/connectingeo-logo.png
[connectingeo]: http://www.connectingeo.net/
[fona-logo]: https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/fona-logo.png
[fona]: https://www.fona.de/
[fp7]: https://ec.europa.eu/research/fp7/index_en.cfm
[geoviqua-logo]: https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/geoviqua-logo.png
[geoviqua]: http://www.geoviqua.org/
[h2020]: https://ec.europa.eu/programmes/horizon2020/
[licensing]: https://52north.org/software/licensing/guidelines/
[mailing-lists]: https://52north.org/discuss/#mailing-lists
[maven-parents]: https://github.com/52North/maven-parents
[mfund-logo]: https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/mfund-logo.jpg
[mfund]: https://www.bmvi.de/DE/Themen/Digitales/mFund/Ueberblick/ueberblick.html
[mudak-wrm-logo]: https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/mudak-wrm-logo.png
[mudak-wrm]: http://www.mudak-wrm.kit.edu/
[nexos-logo]: https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/nexos-logo.png
[nexos]: http://www.nexosproject.eu/
[odip-ii-logo]: https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/odip-ii-logo.png
[odip]: http://www.odip.org/
[om]: http://www.opengeospatial.org/standards/om
[overview]: https://github.com/52North/arctic-sea/raw/master/etc/overview.png
[releases]: https://github.com/52North/arctic-sea/releases
[seadatacloud-logo]: https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/seadatacloud-logo.png
[seadatacloud]: https://www.seadatanet.org/About-us/SeaDataCloud/
[sensorml]: http://www.opengeospatial.org/standards/sensorml
[sos]: http://www.opengeospatial.org/standards/sos
[swe-common]: http://www.opengeospatial.org/standards/swecommon
[wacodis-logo]: https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/wacodis-logo.png
[wacodis]: http://wacodis.fbg-hsbo.de/
[wps]: http://www.opengeospatial.org/standards/wps
