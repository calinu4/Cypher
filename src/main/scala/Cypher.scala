
object Cypher {
val cypher=Map('a'->'z','b'->'y','c'->'x','d'->'w','e'->'v','f'->'u','g'->'t','h'->'s','i'->'r','j'->'q','k'->'p','l'->'o','m'->'n','n'->'m','o'->'l','p'->'k','q'->'j','r'->'i','s'->'h','t'->'g','u'->'f','v'->'e','w'->'d','x'->'c','y'->'b','z'->'a')


  def main(args: Array[String]): Unit = {

    println(cypher)
   println(Cypher.encodeDecode("foobar"))
    println(Cypher.encodeDecode("wizard"))
    println(Cypher.encodeDecode("gsrh rh zm vcznkov lu gsv zgyzhs xrksvi"))
  }

  def encodeDecode(input:String):String={
     input.map(c=>cypher.getOrElse(c,c))
  }
}
