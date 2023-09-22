# PARCIAL-SPRING

##### Integrantes de grupo
- [Sebastan Cely Peña]

## Puerto de la API lolcal:
  - http://localhost:8081

## Peticiones HTTP (postman)
PETICION DE RELACION MUCHOS A MUCHOS Asignar a un participante un EVENTO!!👇🏻👇🏻
```bash
METHOD  POST  :  http://localhost:8081/participante/5/evento/1

BODY: 
{
    "empId": 5,
    "empName": "Sebatian Cely",
    "assignedProjects": [
        {
            "projectId": 1,
            "projectName": "Convocatoria Investigacion"
        }
    ]
}
```

Peticion para guardaar participante👇🏻

```bash
METHOD  POST  :  /participante/save
{
	"empName": "Sebatian Cely"
}

```
Peticion para mostrar participantes  en este caso quedo ge erro de redadcion pero es tal como esta👇🏻
```bash
METHOD GET : /participante/geParticipante
```
Peticion para guardaar evneto 👇🏻

```bash
 METHOD POST  :  /evento/save

{
	"projectName": "Proyecto Investigtivo 2023"
}
```
Peticion para mostrar eventos 👇🏻
```bash
METHOD  GET : /evento/getEvento
```
