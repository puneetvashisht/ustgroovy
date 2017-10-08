def ant = new AntBuilder() 
ant.echo("hello") // lets just call one task
// create a block of Ant using the builder pattern
ant.sequential {
myDir = "target/AntTest/"
mkdir(dir: myDir) 
copy(todir: myDir) {
    fileset(dir: "src/test") 
        { include(name: "**/*.groovy")
    } 
}
    echo("done")
}

println ant;