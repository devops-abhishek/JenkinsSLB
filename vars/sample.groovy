def call(name){
  if("${name}" == "abhishek")
    println("Hello ${name}")
    log.info "Hello ${name}"
  else
    println("Hi Human")
  sleep 2
  echo "End of Script"
}
