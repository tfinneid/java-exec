
# Java-Exec playpen

For now this page it just for notes to gather some thoughts on what to consider for inclusion in the project.

The idea comes from when the Scala contributors list called for thoughts and ideas on Scalas process 
wrapper package, which was considered for update. The ensuing discussion, suggestions, ideas and investigations, 
has led to consider wether the whole Process design in the JDK is a bit lacking. The features for OS integration seems
not very powerful. That is something that perhaps should be improved.

## Contributions

Any ideas, thoughts or suggestions are whole-heartedly welcome, as more brainpower is allways a good thing.   

# Main Issues

These issues are the most pressing matters to attend to.

The focus is on covering basic functionality and provide a holistic and clean design.

* Coherent API for Process (which includes ProcessBuilder)
* Clean and simple input and output stream management (without the need for excess fixture code)
* Idiomatic treatment of stdin/out/err redirection
* Extensible stdin/out/err design with helper streams for source and sinks

# Possible other issues to consider

These issues are more advanced or they broadens the scope of the project.

* A more complete OS integration regarding process creation and management
* Two way sharing of environment (between the java program in the jvm and the host os)
  * Allowing host commands to update process environment
* Using host OS settings to control the java programs process attributes, both at startup and during execution
  * Decide initial environment
  * Control and adjust memory settings
  * Control and adjust file settings
  * Control and adjust kernel settings for process
* Design for management of Parent/Child processes, Daemon process creation, Orphan processes, cleanup and exit
* Utilise OS resources as helper resources for Process features