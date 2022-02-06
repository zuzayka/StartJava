-- ключ psql -d jaegers -U postgres -f '/home/miux/Java/src/com/startjava/lesson_5/create_db.sql'

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
