ALTER TABLE "myfirstmodule$subasset_assets" DROP CONSTRAINT "uniq_myfirstmodule$subasset_assets_myfirstmodule$subassetid";
DELETE FROM "mendixsystem$unique_constraint"  WHERE "name" = 'uniq_myfirstmodule$subasset_assets_myfirstmodule$subassetid' AND "column_id" = '39632e21-f99b-3ab9-be1f-221a3988e0c8';
UPDATE "mendixsystem$version" SET "versionnumber" = '4.2', "lastsyncdate" = '20250121 17:24:31';
