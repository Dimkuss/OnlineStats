val seconds = 800
var minutes = ""

fun main() {
    agoToText()
}

    fun agoToText() {
        when (seconds) {
            in 0..60 -> print("был(а) только что")
            in 61..60 * 60 -> choiceMinutes()
            in (60 * 60) + 1..24 * 60 * 60 -> choiceHours()
            in (24 * 60 * 60) + 1..48 * 60 * 60 -> print("был(а) сегодня")
            in (48 * 60 * 60) + 1..72 * 60 * 60 -> print("был(а) вчера")
            else -> print("был(а) давно")
        }
    }
    fun choiceMinutes() {
        val m = (seconds / 60).toString().split("")

        when (true) {
            (m[m.size - 2] == "2" || m[m.size - 2] == "3" || m[m.size - 2] == "4" || m[m.size - 2] == "1") && m[m.size - 3] == "1" -> minutes =
                "был(а) ${seconds / 60} минут назад"
            m[m.size - 2] == "1" -> minutes = "был(а) ${seconds / 60} минуту назад"
            m[m.size - 2] == "2" || m[m.size - 2] == "3" || m[m.size - 2] == "4" -> minutes =
                "был(а) ${seconds / 60} минуты назад"
            (m[m.size - 2] == "2" || m[m.size - 2] == "3" || m[m.size - 2] == "4") && (m[m.size - 3] == "1") -> minutes =
                "был(а) ${seconds / 60} минуты назад"
            else -> minutes = "был(а) ${seconds / 60} минут назад"
        }
        print(minutes)
    }
    fun choiceHours() {
        val m = (seconds / 3600).toString().split("")

        when (true) {
            m[m.size - 2] == "1" && m[m.size - 3] == "1" -> minutes = "был(а) ${seconds / 3600} часов назад"
            m[m.size - 2] == "1" -> minutes = "был(а) ${seconds / 3600} час назад"
            m[m.size - 2] == "2" || m[m.size - 2] == "3" || m[m.size - 2] == "4" -> minutes =
                "был(а) ${seconds / 3600} часа назад"
            else -> minutes = "был(а) ${seconds / 3600} часов назад"
        }
        print(minutes)
    }
//    fun agoMin() = when (seconds) {
//        in 0..60 -> "Был(а) только что"
//        in 61..120 -> "Был(а) в сети 1 минуту назад"
//        in 121..60 * 5 -> "Был(а) в сети $minutes минуты назад"
//        in 60 * 5 + 1..60 * 21 -> "Был(а) в сети $minutes минут назад"
//        in 60 * 21 + 1..60 * 22 -> "Был(а) в сети $minutes минуту назад"
//        in 60 * 22 + 1..60 * 25 -> "Была в сети $minutes минуты назад"
//        in 60 * 25 + 1..60 * 31 -> "Была в сети $minutes минут назад"
//        in 60 * 31 + 1..60 * 32 -> "Была в сети $minutes минуту назад"
//        in 60 * 32 + 1..60 * 35 -> "Была в сети $minutes минуты назад"
//        in 60 * 35 + 1..60 * 41 -> "Была в сети $minutes минут назад"
//        in 60 * 41 + 1..60 * 42 -> "Была в сети $minutes минуту назад"
//        in 60 * 42 + 1..60 * 45 -> "Была в сети $minutes минуты назад"
//        in 60 * 45 + 1..60 * 51 -> "Была в сети $minutes минут назад"
//        in 60 * 51 + 1..60 * 52 -> "Была в сети $minutes минуту назад"
//        in 60 * 52 + 1..60 * 55 -> "Была в сети $minutes минуты назад"
//        in 60 * 55 + 1..60 * 59 -> "Была в сети $minutes минут назад"
//        else -> "Был(а) в сети час назад"
//    }
//
//    fun agoHour() = when (seconds) {
//        in 60*60..60*60+1 -> "Был(а) в сети $hours час назад"
//        in 2*60*60..4*60*60 -> "Был(а) в сети $hours часа назад"
//        in 4*60*60+1..20*60*60 -> "Был(а) в сети $hours часов назад"
//        in 20*60*60+1..21*60*60 -> "Был(а) в сети $hours час назад"
//        in 21*60*60+1..24*60*60 -> "Был(а) в сети $hours часа назад"
//        in 24 * 60 * 60 + 1..24 * 60 * 60 * 2 -> "Последний раз был(а) сегодня"
//        in 24 * 60 * 60 * 2 + 1..24 * 60 * 60 * 3 -> "Последний раз был(а) вчера"
//        else -> "Последний раз был(а) давно"
//    }
//    if (seconds in 0..60*59) println(agoMin()) else println(agoHour())
//



