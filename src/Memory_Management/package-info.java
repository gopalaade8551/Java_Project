package Memory_Management;
/*
What is memory management?
Understand different memory areas
   stack Area
   Metaspace/Permgen
   Heap Area
     String Pool
     
 Examples

Memory Area is also called as Run time Data Area


Native Area:the Area which is allocated by system to the java.
it is devided into three parts 
1.Heap Area
2.Stack Area
3.PermGen/Meta Space

1.Heap Area: It is used to store the objects and string literals,Arrays.String pool is used to store string literals
objects=Instance variables+methods
2.Stack Area:Local variables,Reference variables
3.PermGen:Class structure,entire static data includes static variables,static methods,static blocks.




1.In Stack area for every thread there is a stack.
2.stack contains stack frames,every frame contains the data of methods
*/