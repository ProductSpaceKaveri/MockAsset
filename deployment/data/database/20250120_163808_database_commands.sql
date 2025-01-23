ALTER TABLE "myfirstmodule$assets" ADD "dateofreciept" TIMESTAMP NULL;
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('92da071f-c860-4d64-8204-d5e8f32834d9', '779a3495-3d68-48f6-b958-3b891d47d0e6', 'DateOfReciept', 'dateofreciept', 20, 0, '', false);
UPDATE "mendixsystem$version" SET "versionnumber" = '4.2', "lastsyncdate" = '20250120 16:38:08';
