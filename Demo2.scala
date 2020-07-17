object Demo2{
    import scala.io.Source
    val filename="Sacramentorealestatetransactions.csv"

    for(line <- Source.fromFile(filename).getLines){
        println(line)
}
}