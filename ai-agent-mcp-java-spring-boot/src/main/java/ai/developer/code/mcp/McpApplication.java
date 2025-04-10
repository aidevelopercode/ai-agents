package ai.developer.code.mcp;

import org.springframework.ai.tool.ToolCallback;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.function.FunctionToolCallback;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class McpApplication {

	public static void main(String[] args) {
		SpringApplication.run(McpApplication.class, args);
	}


	@Bean
	public ToolCallbackProvider weatherTools(MyCommandMCPService myCommandMCPService) {
		return MethodToolCallbackProvider.builder().toolObjects(myCommandMCPService).build();
	}

	public record TextInput(String input) {
	}

	@Bean
	public ToolCallback toUpperCase() {
		return FunctionToolCallback.builder("name", (TextInput input) -> input.input().toUpperCase())
				.inputType(TextInput.class)
				.description("Say Hello World message to the user with the given name")
				.build();
	}
}
