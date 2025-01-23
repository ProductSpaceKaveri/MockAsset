ALTER TABLE "myfirstmodule$assets" ADD "barcode" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('f88f74db-27d3-4e27-b3ce-e580452b5e1b', '779a3495-3d68-48f6-b958-3b891d47d0e6', 'barcode', 'barcode', 30, 200, '', false);
ALTER TABLE "myfirstmodule$tasks_of_user" DROP COLUMN "priority";
DELETE FROM "mendixsystem$attribute"  WHERE "id" = '835751e3-ca60-4735-9b22-84f8441a72cd';
UPDATE "mendixsystem$version" SET "versionnumber" = '4.2', "lastsyncdate" = '20250110 11:50:56';
