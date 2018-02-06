int val = 0;

void setup() {
  // put your setup code here, to run once:
  pinMode(13,OUTPUT);
  pinMode(12,OUTPUT);
  pinMode(11,OUTPUT);
  pinMode(10,OUTPUT);

  pinMode(7,INPUT);
  pinMode(6,INPUT);
  pinMode(5,INPUT);
  pinMode(4,INPUT);

}

void loop() {
  // put your main code here, to run repeatedly:

  digitalWrite(13,!digitalRead(7));
  
  digitalWrite(12,!digitalRead(6));
  
  digitalWrite(11,!digitalRead(5));

  
  digitalWrite(10,!digitalRead(4));

  
  
  delay(1000);
  
}
