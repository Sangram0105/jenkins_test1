# Use a base image with Java installed
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /app

# Copy the Java source code to the container
COPY JavaProj.java /app/

# Compile the Java code
RUN javac JavaProj.java

# Set the entry point for the container
CMD ["java", "JavaProj"]