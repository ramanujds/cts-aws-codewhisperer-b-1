provider "aws" {
  region  = "us-east-1"
  access_key = 
  secret_key = 
}

// Create an ec2 instance of type t2.micro and tag it with the name "ExampleAppServerInstance"

resource "aws_instance" "app_server" {
  ami           = "ami-0df435f331839b2d6"
  instance_type = "t2.micro"

  tags = {
    Name = "ExampleAppServerInstance"
  }
}



  
