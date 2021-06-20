def call(name){
  if("${name}" == "abhishek")
    log.info "Hello ${name}"
  else
    log.warning "Hello ${name}"
  sleep 2
  echo "End of Script"
}
