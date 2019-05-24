# apache-tikka-starter

A Project in which Apache Tikka is integrated with ElasticSearch + Kibana
# Apache Tikka
 - To Get The Document And File Data From filesystem
# Elasticsearch + Kibana
 - To Query and visualize the data

# Sample Screenshots
 - Images Module Dashboard
 ![alt](https://github.com/BilalAM/apache-tikka-starter/blob/master/src/main/resources/image%20module.png)

 - PDFs Module Dashboard
 ![alt](https://github.com/BilalAM/apache-tikka-starter/blob/master/src/main/resources/pdf%20module.png)

 # Usage

Method :

    Sender.send(document-type-mapper ,
                document-type ,
                path-of-documents-folder,
                index-name,
                type-name,
                extensions to index )


 1. **document-type-mapper**
          Type of mapper strategy to use (e.g WordMapper , ImageMapper)

 2. **document-type**
		 Type of document to index (e.g WordDocument , ImageDocument)

 3. **index-name**
		 Your elastic index name

 4. **type-name**
	     Your index type name

 5. **extensions to index**
		 Specific extensions to index (e.g if you are using WordMapper with WordDocument , then you have to write docs or odt or both or any number of extensions you want ( its an array of extensions ;) ) )



## Example Code Usage

    Sender.sendData(new WordMapper(),
                    new WordDocument(),
                   "/home/bilalam/Documents/",
                   "word-docs",
                   "odt", "doc", "docx");
                   

