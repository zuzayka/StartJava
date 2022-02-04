-- ключ psql -d jaegers -U postgres -f /var/lib/postgres/init_db.sql
-- PostgreSQL database dump
--

-- Dumped from database version 13.4
-- Dumped by pg_dump version 13.4

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

--
-- Name: jaegers; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.jaegers (
    id integer NOT NULL,
    modelname text,
    mark text,
    height real,
    weight integer,
    status text,
    origin text,
    launch date,
    kaijukill integer
);


ALTER TABLE public.jaegers OWNER TO postgres;

--
-- Data for Name: jaegers; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.jaegers (id, modelname, mark, height, weight, status, origin, launch, kaijukill) FROM stdin;
1	Saber Athena	Mark-7	76.91	1628	destroyed	Japan	2033-12-20	1
2	Gipsy Avenger	Mark-6	81.77	2004	destroyed	Pan Pacific Defense Corps	2034-01-12	1
3	Guardian Bravo	Mark-6	73.21	1975	active	Japan	2033-12-15	1
4	Eden Asassin	Mark-2	58.35	1421	destroyed	Russia	2016-10-15	0
5	Striker Eureka	Mark-5	65.42	1796	destroyed	Pan Pacific Defense Corps	2019-11-02	5
6	Hydra Corinthian	Mark-4	66.83	1826	destroyed	USA	2018-06-20	1
7	Titan Redeemer	Mark-6	85.96	2215	destroyed	Pan Pacific Defense Corps	2034-04-04	2
8	Shaolin Rogue	Mark-3	57.29	1425	destroyed	China	2017-08-14	2
9	Chronos Berserker	Mark-5	52.74	1317	active	Australia	2019-05-01	0
10	Murder Witch	Mark-6	71.55	1816	destroyed	Australia	2032-10-28	0
\.


--
-- Name: jaegers jaegers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.jaegers
    ADD CONSTRAINT jaegers_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--
