CREATE TABLE ACCOUNT (
  accountid serial NOT NULL,
  username character varying(64),
  passwd character varying(256),
  created timestamp with time zone,
  updated timestamp with time zone,
  updateby integer,
  CONSTRAINT pk_account PRIMARY KEY (accountid),
  CONSTRAINT uq_account_username UNIQUE (username)
);
ALTER TABLE ACCOUNT
  OWNER TO thjug;