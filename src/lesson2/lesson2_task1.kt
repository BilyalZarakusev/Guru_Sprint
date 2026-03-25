package lesson2

fun main(){
//    val AGE_OF_MAJORITY = 18
//    println("Введите ваш возраст: ")
    var AGE_USER = readln().toInt()
//    var USER_TRUE_FALSE: Boolean = AGE_USER >= AGE_OF_MAJORITY
//    println("Cовершеннолетие достигнуто: $USER_TRUE_FALSE")

    if(AGE_USER >= 18){
        println("Добро пожаловать")
    }
    else{
        println("Вход воспрещен подрастите еще")
    }
}