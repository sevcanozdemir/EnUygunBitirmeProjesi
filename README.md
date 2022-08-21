# EnUygunBitirmeProjesi

API Test Klasörü

GroceryStore ve PetStore adında 2 alt klasör oluşturulmuştur. 


1-GROCERY STORE

GroceryStore için aşağıdaki bilgiler kullanılarak testler gerçekleştirilmiştir.

Meyve ve sebze satan bir işletmenin api servis testlerini yazdığınız düşünün, -Elimizde bize
stok fiyat bilgisi dönen bir endpoint
GET /allGrocery
{
"data": [
{
"id": 1,
"name": "apple",
"price": 3,
"stock": 100
},
{
"id": 2,
"name": "grapes",
"price": 5,
"stock": 50
}
]
}
- İsme göre cevap dönen bir endpoint
GET /allGrocery/{name}
{
"data": [
{
"id": 1,
"name": "apple",
"price": 3,
"stock": 100
}
]
}


2- PETSTORE
https://petstore.swagger.io/ servisini kullanarak ;
1- /pet/findByStatus servisinin available, pending,sold parametresi ile testini yazın.
2- /pet/findByStatus responsundan dönen pet'lerin üçüncüsünün İdsi /pet/{petId} get servisine
pet id parametresinde göndererek testini yazın.
3- /pet/{petId} post, delete testlerini yazın.
NOT: Testler de verification lar açıkça belirtilmemiştir,


EnUygun Klasörü

Burada https://www.enuygun.com/ucak-bileti/ sayfasına giderek ilgili testler gerçekleştirilmiştir. Gerçekleştirilen testler aşağıdaki gibidir.

Testte parametrik olarak alıncak veriler
origin: nereden bilgisi
destination: nereye bilgisi
departureDay: gidiş tarihi bilgisi (bugünden itibaren kaç sonra olucak şekilde
alınacak. Örnek: 10)
returnDay: dönüş tarihi bilgisi (gidişten itibaren kaç gün sonra olucak şekilde
alıncak. Örnek: 5 )
provider: hangi provider’a ait uçuşun seçileceği
isDirect: boolean olarak alıncak. True ise direkt uçuşlar seçilecek. False ise
aktarmalı uçuşlar seçilecek.


1. Enuygun Flight ana sayfasına gidilir
url : https://www.enuygun.com/ucak-bileti/
2. Nereden input alanına Testte parametrik olarak alınan yurtiçi bir
şehir ismi girilir
3. Çıkan Sonuçlardan ilkine tıklanır
4. Nereye input alanına Testte parametrik olarak alınan yurtdışı bir
şehir ismi girilir.
5. Çıkan sonuçlardan ilki seçilir
6. Gidiş Tarihi input alanına tıklanır
7. Testten parametre olarak bugünden itibaren kaç gün sonra
gidilmek istendiği alınacak. Kaç gün sonra ise ona göre tarih
seçilecek.
Örnek: 10 gün sonra gidilecekse bugunün tarihi 0 olucak şekilde başlayıp 10 gün
sonraki tarihe tıklayacak.
8. Dönüş Tarihi input alanına tıklanır
9. Tessten parametre olarak gidişten kaç gün sonra dönülmek
istendindiği alınacak. Kaç gün sonra ise ona göre tarih seçilecek
Örnek: dönüş tarihi 5 gün sonra ise gidiş tarihi 0 olucak şekilde 5 gün sonraki tarih
seçilecek
10. Ucuz Bilet bul butonuna tıklanır
11. Verilen parameterlere uygun gidiş ve dönüş uçuşları bulunur.
Bu uçuşlar aynı paket içinde olmak zorunda
12. Gidiş uçuşu seçilir
13. Dönüş uçuşu seçilir
14. Seç butonuna tıklanır



Provider bilgisi nerden alınır?
her uçuşu sarmalayan bir div’in içinde data-booking-provider diye bir attribute vardır.
provider bilgisi bunun içinde saklanmaktadır.

Paketli Uçuş Nedir?
Paketli uçuşlarda her paket için gidiş ve dönüşlerde belli uçuşlar vardır ve tek fiyattır.
Gidiş ve dönüş aynı paketten olmak zorundadır. 1. paketten gidiş uçuşu seçildiği zaman
dönüş uçuşu sadece 1. paketten seçilebilir.
