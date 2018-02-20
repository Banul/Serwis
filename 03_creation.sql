CREATE TABLE public.Category
(
    ID integer NOT NULL DEFAULT nextval('category_ID_seq'::regclass),
    Type character varying(30) COLLATE pg_catalog.default,
    CONSTRAINT category_pkey PRIMARY KEY (ID)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.Category
    OWNER to postgres;
    
  

--------------------------

CREATE TABLE public.Item
(
    ID integer NOT NULL DEFAULT nextval('Item_ID_seq'::regclass),
    ITEM_CAT_ID integer NOT NULL,
    Status character varying(10) COLLATE pg_catalog.default,
	Description character varying(255) COLLATE pg_catalog.default,
    Serial_number character varying (255) COLLATE pg_catalog.default,	
    CONSTRAINT Item_pkey PRIMARY KEY (ID),
    CONSTRAINT ITEM_CAT_ID_FK FOREIGN KEY (ITEM_CAT_ID)
        REFERENCES public.Category (ID) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.Item
    OWNER to postgres;

-- Index: fki_ITEM_CAT_ID_FK

-- DROP INDEX public.fki_ITEM_CAT_ID_FK;

CREATE INDEX fki_ITEM_CAT_ID_FK
    ON public.Item USING btree
    (ITEM_CAT_ID)
    TABLESPACE pg_default;




------------------------------

CREATE TABLE public.Parameter
(
    ID integer NOT NULL DEFAULT nextval('Parameter_ID_seq'::regclass),
    Description text COLLATE pg_catalog.default,
    Value character varying(40) COLLATE pg_catalog.default,
    PAR_ITEM_ID integer NOT NULL,
    CONSTRAINT Parameter_pkey PRIMARY KEY (ID),
    CONSTRAINT PAR_ITEM_ID_FK FOREIGN KEY (PAR_ITEM_ID)
        REFERENCES public.Item (ID) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.Parameter
    OWNER to postgres;

-- Index: fki_PAR_ITEM_ID_FKy

-- DROP INDEX public.fki_PAR_ITEM_ID_FK;

CREATE INDEX fki_PAR_ITEM_ID_FK
    ON public.Parameter USING btree
    (PAR_ITEM_ID)
    TABLESPACE pg_default;
	
	
	
CREATE TABLE public.active_user
(
    ID integer NOT NULL DEFAULT nextval('user_ID_seq'::regclass),
    email character varying(30) COLLATE pg_catalog.default,
    first_name character varying(30) COLLATE pg_catalog.default,
    last_name character varying (30) COLLATE pg_catalog.default,
    password character varying (60) COLLATE pg_catalog.default,
	enabled integer,
    CONSTRAINT user_pkey PRIMARY KEY (ID)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.active_user
    OWNER to postgres;
	
	
CREATE TABLE public.Role
(
    ID integer NOT NULL DEFAULT nextval('role_ID_seq'::regclass),
    role character varying(30) COLLATE pg_catalog.default,
    CONSTRAINT role_pkey PRIMARY KEY (ID)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.Role
    OWNER to postgres;

	
	CREATE TABLE public.User_Role
(
    USERROLE_USER_ID integer NOT NULL,
    USERROLE_ROLE_ID integer NOT NULL,
    CONSTRAINT USR_USER_ID_FK FOREIGN KEY (USERROLE_USER_ID)
        REFERENCES public.active_user (ID) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT USR_ROLE_ID_FK FOREIGN KEY (USERROLE_ROLE_ID)
	REFERENCES public.Role (ID) MATCH SIMPLE
	ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.User_Role
    OWNER to postgres;


    
    