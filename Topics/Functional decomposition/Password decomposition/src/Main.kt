const val TASK_PASSWORD_LENGTH = 5

fun validatePassword(password: String): Boolean {
    // write your code here
    if (password.length < TASK_PASSWORD_LENGTH) {
        println("Your password should be five or longer characters, please write a new password")
        return false
    }
    println("Good password")
    return true
}

// do not change the code below
fun main() {
    var validationResult = false
    while (!validationResult) {
        val password = readln()
        validationResult = validatePassword(password)
    }
}