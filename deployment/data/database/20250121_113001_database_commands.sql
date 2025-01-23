CREATE TABLE "tasks_module$login" (
	"id" BIGINT NOT NULL,
	"username" VARCHAR_IGNORECASE(200) NULL,
	"password" VARCHAR_IGNORECASE(200) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", "entity_name", "table_name", "remote", "remote_primary_key") VALUES ('18714c21-2aa3-4263-b9b1-eccae4c8cbcc', 'Tasks_Module.Login', 'tasks_module$login', false, false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('fb450adc-d661-42bf-a520-01884e2ca870', '18714c21-2aa3-4263-b9b1-eccae4c8cbcc', 'username', 'username', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('7493456c-aa4a-495b-9844-a7b8bd84dfe6', '18714c21-2aa3-4263-b9b1-eccae4c8cbcc', 'password', 'password', 30, 200, '', false);
UPDATE "mendixsystem$version" SET "versionnumber" = '4.2', "lastsyncdate" = '20250121 11:30:01';
