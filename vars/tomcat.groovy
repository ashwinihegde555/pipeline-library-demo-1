def startTomcat(){
  echo "*************Starting tomcat******************"
  bat ' "F:/DEVOPS/apache-tomcat-8.5.58-windows-x64/apache-tomcat-8.5.58/bin/startup.bat" '
  echo "Tomcat Started"
  echo "**************Stopping tomcat*****************"
  bat ' "F:/DEVOPS/apache-tomcat-8.5.58-windows-x64/apache-tomcat-8.5.58/bin/shutdown.bat" '
  echo "Tomcat ended"
}
