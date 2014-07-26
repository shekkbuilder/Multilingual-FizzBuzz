FOR I = 1 TO 100
   IF I MOD 15 = 0 THEN
      PRINT "FizzBuzz"
   ELSE IF I MOD 3 = 0 THEN
      PRINT "Fizz"
   ELSE IF I MOD 5 = 0 THEN
      PRINT "Buzz"
   ELSE
      PRINT I
   END IF
NEXT I
