package fits.sample

import scala.collection.JavaConversions._

import org.specs._
import org.specs.runner.JUnit4

class BookSpecTest extends JUnit4(BookSpec)

object BookSpec extends Specification {

	"初期状態" should {
		val b = new Book()

		"title は null" in {
			b.getTitle() must beNull
		}

		"comments は null ではない" in {
			b.getComments() must notBeNull
		}

		"comments は空" in {
			b.getComments() must haveSize(0)
		}
	}

	"title を指定" should {
		val b = new Book()
		b.setTitle("テスト")

		"title が設定されている" in {
			b.getTitle() must beEqualTo("テスト")
		}
	}

	"Comment を追加" should {
		val b = new Book()
		b.getComments().add(new Comment())

		"Comment が追加されている" in {
			b.getComments() must haveSize(1)
		}

	}
}

