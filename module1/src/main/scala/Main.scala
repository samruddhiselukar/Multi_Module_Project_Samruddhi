package web

import core.PalindromeChecker

object Main {
  def main(args: Array[String]): Unit = {
    val str = "ababa"
    val isPalindrome = PalindromeChecker.isPalindrome(str)
    if (isPalindrome) {
      println(s"$str is a palindrome!")
    } else {
      println(s"$str is not a palindrome.")
    }
  }
}
