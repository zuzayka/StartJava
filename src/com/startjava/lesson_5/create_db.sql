-- ключ psql -d jaegers -U postgres -f /var/lib/postgres/init_db.sql
SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

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

ALTER TABLE public.Jaegers OWNER TO postgres;
