import java.util.*

fun main() {

    val N : Int// Number of items in the List
    val list : MutableList<String> = mutableListOf<String>()
    val scn = Scanner(System.`in`)
    print("How many items do you want to add to the list? : ")
    N = scn.nextInt()
    scn.nextLine()

    for (i in 0 until  N)
    {
        print("Item Number $i : ")
        list.add(scn.nextLine())
    }

    val filteredList = list.filter {
        it.contains("M" ) ||
        it.contains("m" ) ||
        it.contains("a" ) ||
        it.contains("A" )
    }

    println(filteredList.toString().uppercase(Locale.getDefault()))


}