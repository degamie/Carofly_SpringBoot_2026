CREATE TABLE PLAYER(
    playerid:VARCHAR(20),
    playerName:VARCHAR(255),
    logintime:TIMESTAMP("HH:MM:SS"),
    score:INTEGER(50),
    logindate:DATE(230),
    logoutdate:DATE(230)
);
INSERT INTO TABLE Player where values("1001","Sarthak Mittal","19:10:28","100","21-04-2026","22-04-2026");
INSERT INTO TABLE Player where values("1002","Dishi Mittal","19:11:28","100","21-04-2026","22-04-2026");
INSERT INTO TABLE Player where values("1003","Nain Mittal","19:11:28","100","21-04-2026","22-04-2026");
INSERT INTO TABLE Player where values("1004","Pradeep Kumar Mittal","19:11:28","100","21-04-2026","22-04-2026");
select * from Player ;
desc table Player;

