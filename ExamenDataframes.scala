//1
import org.apache.spark.sql.SparkSession
val spar = SparkSession.builder().getOrCreate()
//2
val df = spark.read.option("header", "true").option("inferSchema","true")csv("Netflix_2011_2016.csv")
//3
df.printSchema()
//4
df.show()
//5
df.head(5)
//6
df.describe()
//7

//8
df.filter("Price == High").show()
//10
df.describe().show()
//11a
df.filter("Close < 600").show()
