-- ключ psql -d jaegers -U postgres -f /var/lib/postgres/init_db.sql

CREATE TABLE public.Jaegers (
    id integer NOT NULL,
    modelName text,
    mark text,
    height real,
    weight integer,
    status text,
    origin text,
    launch date,
    kaijuKill integer
);
