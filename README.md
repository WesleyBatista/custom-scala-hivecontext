*Created, at first, to improve the developer/analysts experience on the Databricks Runtime, but there is no directly dependencies at all.*

# How to see it working

1. Download the package in the "releases" page;
2. Install and attach the downloaded package to a cluster on Databricks;
3. Create a Scala notebook on Databricks (you can use the community edition for free);
4. Make sure that the package was installed and attached;
5. Run the following code:
    ```scala
    import example.env._
    sqlContext.sayHi("hey Stranger!")
    ```