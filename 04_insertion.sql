INSERT INTO Category (Type) VALUES ('lodowka');
INSERT INTO Category (Type) VALUES ('pralka');
INSERT INTO Category (Type) VALUES ('telewizor');
INSERT INTO Category (Type) VALUES ('kuchenka');
INSERT INTO Category (Type) VALUES ('komputer');


INSERT INTO Item (ITEM_CAT_ID,Status,Description,Serial_number) VALUES ('2','sprawny','dobrze pierze','rwx-23');
INSERT INTO Item (ITEM_CAT_ID,Status,Description,Serial_number) VALUES ('3','zepsuty','zepsuty całkowicie','rwx-28');
INSERT INTO Item (ITEM_CAT_ID,Status,Description,Serial_number) VALUES ('1','zepsuty','zniszczony modul X','rwx-33');
INSERT INTO Item (ITEM_CAT_ID,Status,Description,Serial_number) VALUES ('4','sprawny','dziala dobrze','rwx-53');
INSERT INTO Item (ITEM_CAT_ID,Status,Description,Serial_number) VALUES ('4','zepsuty','procesor nie dziala','rmx-71');
INSERT INTO Item (ITEM_CAT_ID,Status,Description,Serial_number) VALUES ('3','sprawny','naprawiony wczoraj','avb-72');
INSERT INTO Item (ITEM_CAT_ID,Status,Description,Serial_number) VALUES ('2','zepsuty','do naprawy jutro','rxj-43');
INSERT INTO Item (ITEM_CAT_ID,Status,Description,Serial_number) VALUES ('1','zepsuty','nie da sie naprawic','rsd-34');
INSERT INTO Item (ITEM_CAT_ID,Status,Description,Serial_number) VALUES ('4','zepsuty','drobna usterka','fdg-732');
INSERT INTO Item (ITEM_CAT_ID,Status,Description,Serial_number) VALUES ('1','sprawny','naprawiony przedwczoraj','fdv-32');
INSERT INTO Item (ITEM_CAT_ID,Status,Description,Serial_number) VALUES ('2','sprawny','do oddania klientowi','dfg-22');
INSERT INTO Item (ITEM_CAT_ID,Status,Description,Serial_number) VALUES ('5','zepsuty','do wyrzucenia','awe-32');
INSERT INTO Item (ITEM_CAT_ID,Status,Description,Serial_number) VALUES ('2','sprawny','dobry sprzed','dfv-11');
INSERT INTO Item (ITEM_CAT_ID,Status,Description,Serial_number) VALUES ('2','zepsuty','usterka modułu jakiegośTam','tyt-33');
INSERT INTO Item (ITEM_CAT_ID,Status,Description,Serial_number) VALUES ('3','sprawny','naprawiony moduł XYZ','gfb-61');
INSERT INTO Item (ITEM_CAT_ID,Status,Description,Serial_number) VALUES ('3','zepsuty','do przekierowania','grt-57');






INSERT INTO Parameter (Description,Value,PAR_ITEM_ID) VALUES ('kolor','czerwony','2');
INSERT INTO Parameter (Description,Value,PAR_ITEM_ID) VALUES ('marka','XYZ','4');
INSERT INTO Parameter (Description,Value,PAR_ITEM_ID) VALUES ('rozmiar','L','2');
INSERT INTO Parameter (Description,Value,PAR_ITEM_ID) VALUES ('marka','Może i drogo, ale za to byle jak','5');
INSERT INTO Parameter (Description,Value,PAR_ITEM_ID) VALUES ('kolor','karminowo-czerwony','6');
INSERT INTO Parameter (Description,Value,PAR_ITEM_ID) VALUES ('czy psuł się poprzednio','nie','4');
INSERT INTO Parameter (Description,Value,PAR_ITEM_ID) VALUES ('marka','jeszcze inna','6');





INSERT INTO role (role) VALUES ('ADMIN');