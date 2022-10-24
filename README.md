# SoftwareOblig3
Mathias Dale Ratdal

Forklaring på fremgangsmåte:
Brukte dokumentasjonen for å lese meg opp og forstå hvordan Action-syntaksen fungerer, 
men mesteparten av tiden ble brukt mot å bugfikse feilene som kom opp, slikt som "permission denied" og "403 error".

Som den er nå, vil gradle.yml kjøre for hver push og pull mot master-branch.
Den har bare én jobb, som først er å kjøre i ubuntu, og deretter sette opp Java/JDK 17 med den gitte distribusjonen.
Deretter vil den bygge prosjekte i gradle igjennom kommandoen "./gradlew build".
Når gradle blir bygd, vil den gå igjennom alle testene vi lagde.
Om testene kjører slikt som vi forventet, er alt bra. Om ikke, vil hele workflow-en gi beskjed om hvilke tester som feilet.
