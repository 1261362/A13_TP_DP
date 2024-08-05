```mermaid 
classDiagram
direction BT
class AgressiveBehaviour {
  + AgressiveBehaviour() 
  + moveCommand() void
}
class DefensiveBehaviour {
  + DefensiveBehaviour() 
  + moveCommand() void
}
class IBehaviour {
<<Interface>>
  + moveCommand() void
}
class Main {
  + Main() 
  + main(String[]) void
}
class NormalBehaviour {
  + NormalBehaviour() 
  + moveCommand() void
}
class Robot {
  + Robot(String, IBehaviour) 
  + Robot(Robot) 
  + Robot() 
  + Robot(String) 
  - IBehaviour behaviour
  - String name
  + getBehaviour() IBehaviour
  + setBehaviour(IBehaviour) void
  + move() void
}

AgressiveBehaviour  ..>  IBehaviour 
DefensiveBehaviour  ..>  IBehaviour 
NormalBehaviour  ..>  IBehaviour
```