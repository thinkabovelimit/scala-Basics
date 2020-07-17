import _root_.com.me.project.database.Database
import com.me.project.database.Database
import com.fasterxml.jackson.dataformat.csv.CsvSchema
import com.fasterxml.jackson.dataformat.csv.CsvMapper
import com.fasterxml.jackson.databind.ObjectMapper
import java.io.File
object project2{
def csvFileToJson(filePath: String): String = {
  val inputCsvFile = new File("/home/admin123/scala/Sacramentorealestatetransactions.csv")

  // if the csv has header, use setUseHeader(true)
  val csvSchema = CsvSchema.builder().setUseHeader(true).build()
  val csvMapper = new CsvMapper()

  // java.util.Map[String, String] identifies they key values type in JSON
  val readAll = csvMapper
    .readerFor(classOf[java.util.Map[String, String]])
    .`with`(csvSchema)
    .readValues(inputCsvFile)
    .readAll()

  val mapper = new ObjectMapper()
}
}