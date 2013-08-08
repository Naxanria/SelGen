package nl.naxanria.selgen;

import nl.naxanria.selgen.command.GenerateSelectionHillsCommand;
import no.runsafe.framework.RunsafePlugin;
import no.runsafe.framework.api.command.Command;

public class Plugin extends RunsafePlugin
{
	@Override
	protected void PluginSetup()
	{

		this.addComponent(GenerateHills.class);

		Command command = new Command("generate", "GenerateVanilla terrain", "selgen.generate");
		command.addSubCommand(this.getInstance(GenerateSelectionHillsCommand.class));

		this.addComponent(command);

	}
}
