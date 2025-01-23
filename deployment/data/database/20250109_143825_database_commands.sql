ALTER TABLE "myfirstmodule$tasks_of_user" ADD "duedate" TIMESTAMP NULL;
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('99a08ead-e2cf-45f1-990d-9fbbe3026aea', '8716ae20-07c4-4c31-a7c6-a8525c786f39', 'DueDate', 'duedate', 20, 0, '', false);
CREATE TABLE "myfirstmodule$entity" (
	"id" BIGINT NOT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", "entity_name", "table_name", "remote", "remote_primary_key") VALUES ('d539cbdd-23a1-43ae-8b7a-6bd4d598b5d8', 'MyFirstModule.Entity', 'myfirstmodule$entity', false, false);
UPDATE "mendixsystem$version" SET "versionnumber" = '4.2', "lastsyncdate" = '20250109 14:38:25';
