import java.io.File

fun main() {
    //regular expression for adverbs
    val adverb = "[а-я]*[нкр][о][ ]".toRegex()
    //regular expression for adjectives
    val adjective = "[а-я]*[аиюы][й][ ]".toRegex()
    // regular expression for verbs
    val verb = "[а-я]*[ть][ ]".toRegex()

    val contents = readFileAsTextUsingInputStream("/Users/areduss/Projects/Reader/text.txt")

    println(contents)
    println("Наречия: ${adverb.findAll(contents).count()}")
    println("Прилагательные: ${adjective.findAll(contents).count()}")
       println("Глаголы: ${verb.findAll(contents).count()}")

}


fun readFileAsTextUsingInputStream(fileName: String) = File(fileName).inputStream().readBytes().toString(Charsets.UTF_8)