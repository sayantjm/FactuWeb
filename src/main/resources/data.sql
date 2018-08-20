--Inserting Clients
insert into client(id, name, CIF, address, cod_Postal, city, state, phone, mobile, Created_Date)
values (10001, 'YESOS Y ESCAYOLAS RUBIO S.L.', 'B57293367','POL. CA NA PALAVA, NAVE 19', 7819, 'JESUS','BALEARES','', '', sysdate);

--Inserting Freelances
insert into freelance(id, name, DNI, address, cod_Postal, city, state, phone, mobile, Created_Date)
values (20001, 'GERMAN PERALES FRANCO', '22442239T','CARRER ROLLET, Nº 16', 46293, 'ALCANTERA DE XUQUER','VALENCIA','', '', sysdate);
insert into freelance(id, name, DNI, address, cod_Postal, city, state, phone, mobile, Created_Date)
    values (20002, 'CARLOS PERALES FRANCO', '20852562A','CARRE DEL MAR, Nº 5', 46270, 'VILLANUEVA DE CASTELLÓN','VALENCIA','', '', sysdate);
