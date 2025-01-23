ALTER TABLE "myfirstmodule$subasset" DROP COLUMN "assettype";
ALTER TABLE "myfirstmodule$subasset" ALTER COLUMN "assetid" RENAME TO "sub_assetid";
ALTER TABLE "myfirstmodule$subasset" ADD "location" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "myfirstmodule$subasset" ADD "user" VARCHAR_IGNORECASE(200) NULL;
DELETE FROM "mendixsystem$attribute"  WHERE "id" = '3b71b810-f761-4216-a265-baa18c202a19';
UPDATE "mendixsystem$attribute" SET "entity_id" = 'd4ee1628-6445-423e-b68b-499f82cbf74b', "attribute_name" = 'Sub_AssetId', "column_name" = 'sub_assetid', "type" = 30, "length" = 200, "default_value" = '', "is_auto_number" = false WHERE "id" = '6385e950-eeb5-4025-a9bd-fb3f69ceff13';
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('fba6153b-95b5-4686-a014-d3e5702cc3b1', 'd4ee1628-6445-423e-b68b-499f82cbf74b', 'Location', 'location', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('357c9f55-5865-4a9d-844f-118969b56cc9', 'd4ee1628-6445-423e-b68b-499f82cbf74b', 'User', 'user', 30, 200, '', false);
UPDATE "mendixsystem$version" SET "versionnumber" = '4.2', "lastsyncdate" = '20250108 11:36:25';
