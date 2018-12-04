//1.Verifique solo numero par
def isPar (num: Int): Boolean={
    if(num % 2 == 0){
      return true
    }
  return false
}
println(isPar(14))
println(isPar(5))

//2.Buscar numeros pares en una lista
def isPar2 (numeros: List[Int]): String={
    for (l <- numeros){
      if (l % 2 == 0) {
        println(s"$l es numero par")
      }
      else{
        println(s"$l es numero impar")
      }
    }
    return "fin"
}
//3 Afortunado numero 7
val lista2 = List(7,3,4,5,6,7)
def sumatoria7 (n7 : List[Int]): Int ={
  var sumatoria = 0
  for (num <- n7){
    if(num == 7){
      sumatoria += num*2
    }
    else
    {
      sumatoria += num
    }
  }
  return sumatoria
}
//4 Equilibrar
val lista3 = List(7,2,1,2,1,7)
def equilibrar (equilibrirar: List[Int]): Boolean={
  val (a,b) = equilibrirar.splitAt(equilibrirar.length/2)
  if (a.sum == b.sum)
  {
  return true
  }
  else return false
}


//5 Verificar Palindromo
def palindromo (palabra: String): Boolean={
    if (palabra == palabra.reverse) {
      return true
    }
  return false
}
val pal1 : String = "oso"
val pal2 : String = "anna"
val pal3 : String = "samuel"

palindromo(pal1)
