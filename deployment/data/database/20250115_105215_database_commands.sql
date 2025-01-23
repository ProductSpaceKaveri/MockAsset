CREATE TABLE "tasks_module$dog" (
	"id" BIGINT NOT NULL,
	"message" VARCHAR_IGNORECASE(200) NULL,
	"status" VARCHAR_IGNORECASE(200) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", "entity_name", "table_name", "remote", "remote_primary_key") VALUES ('59d7bc38-be59-44e5-a17f-d2343d2bb64e', 'Tasks_Module.Dog', 'tasks_module$dog', false, false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('4462d4e3-4649-4c19-84a9-0219e61cbf3d', '59d7bc38-be59-44e5-a17f-d2343d2bb64e', 'message', 'message', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('288c4910-8356-4b41-835d-69b4f32b799f', '59d7bc38-be59-44e5-a17f-d2343d2bb64e', 'status', 'status', 30, 200, '', false);
UPDATE "mendixsystem$version" SET "versionnumber" = '4.2', "lastsyncdate" = '20250115 10:52:15';
