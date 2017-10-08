 import java.awt.FlowLayout
builder = new groovy.swing.SwingBuilder() langs = ["Groovy", "Ruby", "Python", "Pnuts"]
gui = builder.frame(size: [290, 100], title: 'Swinging with Groovy!') {
panel(layout: new FlowLayout()) { panel(layout: new FlowLayout()) {
            for (lang in langs) {
                checkBox(text: lang)
} }
button(text: 'Groovy Button', actionPerformed: { {System.exit(0)})
 } }
gui.show()