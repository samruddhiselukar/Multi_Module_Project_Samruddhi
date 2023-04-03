package core

object PalindromeChecker {
  def isPalindrome(str: String): Boolean = {
    val cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()
    cleanStr == cleanStr.reverse
  }
}

