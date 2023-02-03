docker build -t smxmlcreator .
docker stop smxmlcreator || true
docker rm smxmlcreator || true
docker run -d -p 40006:8080 --name smxmlcreator smxmlcreator