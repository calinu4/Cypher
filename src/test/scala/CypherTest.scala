import org.scalatest.FlatSpec

class CypherTest extends FlatSpec {
  val c=new Cypher()

  "Decode Result for foobar" should "be ullyzi" in{
    assert(c.encodeDecode("foobar")==="ullyzi")
  }

  "Decode Result for wizard" should "be draziw" in{
    assert(c.encodeDecode("wizard")==="draziw")
  }

  "Decode Result for gsrh rh zm vcznkov lu gsv zgyzhs xrksvi" should "be this is an example of the atbash cipher" in{
    assert(c.encodeDecode("gsrh rh zm vcznkov lu gsv zgyzhs xrksvi")==="this is an example of the atbash cipher")
  }

  "Decode Result for wizard£90" should "be draziw£90" in{
    assert(c.encodeDecode("wizard£90")==="draziw£90")
  }
}