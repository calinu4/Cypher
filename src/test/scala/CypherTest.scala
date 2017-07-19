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

  "Decode Result for wizard90" should "be draziw90" in{
    assert(c.encodeDecode("wizard90")==="draziw90")
  }

  "Decode Result for hello" should "be svool" in{
    assert(c.encodeDecode("hello")==="svool")
  }

  "Encode Result for first" should "be urihg" in{
    assert(c.encodeDecode("first")==="urihg")
  }
  "Encode Result for good luck" should "be tllw ofxp" in{
    assert(c.encodeDecode("good luck")==="tllw ofxp")
  }
  "Encode Result for new life" should "mvd oruv" in{
    assert(c.encodeDecode("new life")==="mvd oruv")
  }
  "Encode Result for happy" should "be szkkb" in{
    assert(c.encodeDecode("happy")==="szkkb")
  }
}