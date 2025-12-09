# Big Data Labs - Hadoop & HDFS

<details>
<summary><strong>Lab 0 : Installation d'un Cluster Hadoop avec Docker</strong></summary>

<br/>

## Lab 0 : Installation d'un Cluster Hadoop avec Docker

### Objectif du TP

- **Installer un cluster Hadoop avec Docker**
- **Se familiariser avec les commandes HDFS**

![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/2.png)

![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/3.png)

### Interfaces Web du Cluster

**NameNode web UI**: localhost:9870  
![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/4.png)

**Ressource Manager UI**: localhost:8088  
![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/5.png)

**MapReduce JobHistory Server**: localhost:19888  
![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/6.png)

![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/7.png)

![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/8.png)

![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/9.png)

![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/10.png)

![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/11.png)

![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/12.png)

</details>
<details>
<summary><strong>Lab 1 : Programmation avec l'API HDFS</strong></summary>

<br/>

## Lab 1 : Programmation avec l'API HDFS

### Objectifs du TP

- **S'initier à la programmation avec l'API HDFS**
- **Installer l'environnement de développement VScode/git/github**
- **Lire/Ecrire un fichier sur HDFS**

### I. Démarrer le Cluster Hadoop

![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/13.png)

### II. Programmation avec l'api HDFS

#### 1. HadoopFileStatus

![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/14.png)

![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/15.png)

#### 2. ReadHDFS

![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/16.png)

![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/17.png)

#### 3. HDFSWrite

![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/18.png)

</details>
<details>
<summary><strong>Lab 2 :  Programmation avec l’API MapReduce</strong></summary>

## Lab 2 : Programmation avec l’API MapReduce

### Objectifs du TP

- **S’initier à la programmation avec L’API mapreduce**
- **Implémenter l’exemple WordCount en Java**
- **Exécuter MapReduce en Python avec Hadoop Streaming**

### I. Programmation avec l’api MapReduce en Java

- **Lancement de la commande hadoop jar /shared_volume/WordCount.jar inputfile outputfolder**
  ![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/19.png)

![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/20.png)

- **Contenu du dossier output :**
  ![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/21.png)

![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/22.png)

- **Contenu du fichier part-r-00000**
  ![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/23.png)

- **Job History**
  ![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/24.png)

![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/25.png)

### II. Programmation avec l’api MapReduce en Python avec Hadoop Streaming

- **Implémenter l’exemple wordcount à base de mapreduce en python et de l’utilitaire hadoop streaming**
  ![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/26.png)

![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/27.png)

- **Contenu du dossier output :**
  ![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/28.png)

- **Job History**
  ![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/29.png)

![Big Data Labs](https://github.com/izzyxnac/BigDataLabs/blob/main/images/30.png)

</details>
<details open>
<summary><strong>Lab 4 : Apache kafka</strong></summary>

## Lab 4 : Apache kafka

### L’objectif de ce TP est de :

- **Installation d’apache kafka**
- **Première utilisation d’apache Kafka**
- **création d’une application word count kafka**

**Apache Kafka** est un système de messagerie distribué basé sur le pattern publish /subscribe. Il combine trois fonctionnalités :

- **Publier et s’abonner à des flux d'événements en important/exportant des données en continue depuis d'autres systèmes.**
- **Stocker des flux d'événements de manière durable et fiable aussi longtemps que vous le souhaitez.**
- **Traiter des flux d'événements au fur et à mesure qu'ils se produisent ou rétrospectivement**

**Zookeeper** est un service centralisé permettant de maintenir l'information de configuration, de nommage, de synchronisation et de services de groupe. Ces services sont utilisés par les applications distribuées en général, et par Kafka en particulier
