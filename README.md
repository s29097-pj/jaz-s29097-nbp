# jaz-s29097-nbp

Stwórz nowy projekt o nazwie `jaz-s29097-nbp`, który będzie aplikacją springową.
Niech posiada on wystawione oraz udokumentowane Rest API.
Celem aplikacji jest wyświetlanie użytkownikowi obliczonego średniego kursu waluty biorąc pod uwagę dane z przedziału YYY-MM-DD do YYYY-MM-DD.
Wykorzystaj do tego api NBP `http://api.nbp.pl/`. 

Każdorazowe wykonanie zapytania ma zapisać w bazie danych następujące informacje:
- id (automatycznie przypisywanie);
- walutę dla, jakiej zostało wykonane zapytanie;
- datę rozpoczynającą przedział;
- datę kończącą przedział;
- jaki został wyliczony kurs;
- data oraz godzina zapytania.
  
Aplikacja ma mieć wystawiony jeden endpoint GET. Sposób przyjęcia przedziału dat oraz waluty jest dowolny.
Wszystkie kody błędów, które może zwrócić NBP muszą być odpowiednio obsłużone.
