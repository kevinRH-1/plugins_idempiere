@echo off

set DEBUG_MODE=

if "%1" == "debug" (
  set DEBUG_MODE=debug
)

cd org.plugin.prueba.targetplatform
call .\plugin-builder.bat %DEBUG_MODE% ..\org.plugin.prueba ..\org.plugin.prueba.test
cd ..
