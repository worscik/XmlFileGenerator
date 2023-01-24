docker build -t xml .
docker stop xml || true
docker rm xml || true
docker run -d -p 8080:8080 --name xml xml