# profiler-example
Shows how VisualVM works for a simple Java app which parses a directory full of products described in XML. Notice the pom.xml where a parameter is automatically configured to be passed in the execution of com.example.product.Product class. 

0. Launch VisualVM
1. cd productsample
2. mvn compile exec:java
3. Double clik on emerging Apache Maven process
4. Click on Sampler, check that entry com.sample.Product.main() appears
5. Press RETURN in execution of Java program, in its command prompt
6. Notice how most of the time is spent in readCatalogFromFolder method
7. Change the source code, change file com.sample.product.util.ProductCatalog, uncomment new version for method createParser() and comment the existing one
8. Check how performance results change in VisualVM
9. Explore whether you could do any other optimizations to make your code run faster. Notice, that obviously I/O operations are always the most expensive ones. 

Remember [VisualVM usage documentation](https://github.com/dipina/SpringBootBookRESTService/blob/main/profiling-app.md). There you have more details on how to launch a SpringBoot app rather than a simple plain old Java app as this one.