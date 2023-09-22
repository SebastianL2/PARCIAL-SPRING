# PARCIAL-SPRING

##### Integrantes de grupo
- [Sebastan Cely Peña]

## Puerto de la API lolcal:
  - http://localhost:8081

## Peticiones HTTP (postman)
PETICION DE RELACION MUCHOS A MUCHOS Asignar a un participante un EVENTO!!👇🏻👇🏻
```bash
METHOD  POST  : http://localhost:8081/participante/{idParticipante}/evento/{idEvento]
EJ: http://localhost:8081/participante/5/evento/1

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
De esa forma quedan asignados los projectos a los cuales asistiran - yasea eventos organizados (seminario, congreso)
y al hacer la consulta de los participantes saldran sus projecto asignados a los que asistiran
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
Persistencia En la nube Con supa base
[https://github.com/SebastianL2/PARCIAL-SPRING/blob/main/cood.PNG](https://github.com/SebastianL2/PARCIAL-SPRING/blob/main/cood.PNG)https://github.com/SebastianL2/PARCIAL-SPRING/blob/main/cood.PNG

