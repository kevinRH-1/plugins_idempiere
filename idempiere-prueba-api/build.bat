@echo off

set DEBUG_MODE=

if "%1" == "debug" (
  set DEBUG_MODE=debug
)

cd org.idempiere.prueba.targetplatform
call .\plugin-builder.bat %DEBUG_MODE% ..\org.idempiere.prueba ..\org.idempiere.prueba.test
cd ..
