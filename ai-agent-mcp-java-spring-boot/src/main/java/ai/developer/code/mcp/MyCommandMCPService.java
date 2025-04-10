package ai.developer.code.mcp;

import org.springframework.stereotype.Service;

import org.springframework.ai.tool.annotation.Tool;

@Service
public class MyCommandMCPService {



    @Tool(description = "Say Hello World message to the user with the given name", name = "Say Hello World")
    public String helloWorld(String name) {


        return "Hello World from MCP : " + name + "!";
    }



}
