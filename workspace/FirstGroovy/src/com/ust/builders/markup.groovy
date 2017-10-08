import groovy.xml.*
def page = new MarkupBuilder()
page.html {
  head { title 'Hello' }
  body {
    ul {
    for (count in 1..10) {
        li "world $count"
    }
    }
  }
}

println page;