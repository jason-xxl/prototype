DROP TABLE IF EXISTS "group";
DROP TABLE IF EXISTS "entry";
DROP TABLE IF EXISTS "translation";

CREATE TABLE "group"
(
    "id"            SERIAL PRIMARY KEY NOT NULL,
    "code"          varchar            NOT NULL,
    "name"          varchar            NOT NULL,
    "desc"          varchar            NOT NULL,
    "custom_schema" jsonb              NOT NULL DEFAULT '{}'::jsonb,
    "custom_forms"  jsonb              NOT NULL DEFAULT '{}'::jsonb,
    "created_at"    timestamp          NOT NULL,
    "updated_at"    timestamp          NOT NULL
);

CREATE TABLE "entry"
(
    "id"            SERIAL PRIMARY KEY NOT NULL,
    "group_code"    varchar            NOT NULL,
    "code"          varchar            NOT NULL,
    "desc"          varchar            NOT NULL,
    "seq_id"        int                NOT NULL,
    "custom_fields" jsonb              NOT NULL DEFAULT '{}'::jsonb,
    "created_at"    timestamp          NOT NULL,
    "updated_at"    timestamp          NOT NULL
);

CREATE TABLE "translation"
(
    "id"         SERIAL PRIMARY KEY NOT NULL,
    "key"        varchar            NOT NULL,
    "locale"     varchar            NOT NULL,
    "value"      varchar            NOT NULL,
    "created_at" timestamp          NOT NULL,
    "updated_at" timestamp          NOT NULL
);

CREATE UNIQUE INDEX ON "group" ("code");

CREATE UNIQUE INDEX ON "entry" ("group_code", "code");

CREATE UNIQUE INDEX ON "translation" ("key", "locale");

ALTER TABLE "entry"
    ADD FOREIGN KEY ("group_code") REFERENCES "group" ("code");
