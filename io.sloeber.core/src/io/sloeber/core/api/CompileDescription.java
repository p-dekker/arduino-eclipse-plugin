package io.sloeber.core.api;

import java.util.HashMap;
import java.util.Map;

import io.sloeber.core.common.Common;
import io.sloeber.core.common.Const;
import io.sloeber.core.txt.KeyValueTree;
import io.sloeber.core.txt.TxtFile;

public class CompileDescription {

    private boolean myWarningLevel = true;
	private boolean myAlternativeSizeCommand = false;
    private boolean myEnableParallelBuild = false;
	private String my_CPP_CompileOptions = new String();
	private String my_C_CompileOptions = new String();
	private String my_C_andCPP_CompileOptions = new String();
	private String my_Assembly_CompileOptions = new String();
	private String my_Archive_CompileOptions = new String();
	private String my_Link_CompileOptions = new String();
	private String my_All_CompileOptions = new String();



	private static final String ENV_KEY_WARNING_LEVEL_OFF = "A.compiler.warning_flags"; //$NON-NLS-1$
	private static final String ENV_KEY_WARNING_LEVEL_ON = "${A.compiler.warning_flags_all}"; //$NON-NLS-1$
	private static final String ENV_KEY_JANTJE_ADDITIONAL_COMPILE_OPTIONS = Const.ENV_KEY_JANTJE_START
			+ "extra.compile"; //$NON-NLS-1$
	private static final String ENV_KEY_JANTJE_ADDITIONAL_C_COMPILE_OPTIONS = Const.ENV_KEY_JANTJE_START
			+ "extra.c.compile"; //$NON-NLS-1$
	private static final String ENV_KEY_JANTJE_ADDITIONAL_CPP_COMPILE_OPTIONS = Const.ENV_KEY_JANTJE_START
			+ "extra.cpp.compile"; //$NON-NLS-1$
	private static final String ENV_KEY_JANTJE_WARNING_LEVEL = Const.ENV_KEY_JANTJE_START + "warning_level"; //$NON-NLS-1$
	private static final String ENV_KEY_JANTJE_SIZE_COMMAND = Const.ERASE_START + "alt_size_command"; //$NON-NLS-1$
	private static final String ENV_KEY_JANTJE_SIZE_SWITCH = Const.ENV_KEY_JANTJE_START + "size.switch"; //$NON-NLS-1$
	private static final String ENV_KEY_JANTJE_ASSEMBLY_COMPILE_OPTIONS = Const.ENV_KEY_JANTJE_START + "extra.assembly"; //$NON-NLS-1$
	private static final String ENV_KEY_JANTJE_ARCHIVE_COMPILE_OPTIONS = Const.ENV_KEY_JANTJE_START + "extra.archive"; //$NON-NLS-1$
	private static final String ENV_KEY_JANTJE_LINK_COMPILE_OPTIONS = Const.ENV_KEY_JANTJE_START + "extra.link"; //$NON-NLS-1$
	private static final String ENV_KEY_JANTJE_ALL_COMPILE_OPTIONS = Const.ENV_KEY_JANTJE_START + "extra.all"; //$NON-NLS-1$

    // /**
    // * gets the compile options stored in this configuration description. if the
    // * configuration description is null the default compile options are returned.
    // *
    // * @param confDesc null for default or the configuration description you want
    // * the compile options for
    // */
    // public CompileDescription(ICConfigurationDescription confDesc) {
    // if (confDesc != null) {
    //
    // IEnvironmentVariableManager envManager =
    // CCorePlugin.getDefault().getBuildEnvironmentManager();
    // IContributedEnvironment contribEnv = envManager.getContributedEnvironment();
    // IEnvironmentVariable var =
    // contribEnv.getVariable(ENV_KEY_JANTJE_WARNING_LEVEL, confDesc);
    // if (var != null)
    // this.myWarningLevel = Boolean.valueOf(var.getValue());
    // var = contribEnv.getVariable(ENV_KEY_JANTJE_SIZE_SWITCH, confDesc);
    // if (var != null)
    // this.myAlternativeSizeCommand =
    // var.getValue().contains(ENV_KEY_JANTJE_SIZE_COMMAND);
    // var = contribEnv.getVariable(ENV_KEY_JANTJE_ADDITIONAL_COMPILE_OPTIONS,
    // confDesc);
    // if (var != null)
    // this.my_C_andCPP_CompileOptions = var.getValue();
    // var = contribEnv.getVariable(ENV_KEY_JANTJE_ADDITIONAL_C_COMPILE_OPTIONS,
    // confDesc);
    // if (var != null)
    // this.my_C_CompileOptions = var.getValue();
    // var = contribEnv.getVariable(ENV_KEY_JANTJE_ADDITIONAL_CPP_COMPILE_OPTIONS,
    // confDesc);
    // if (var != null)
    // this.my_CPP_CompileOptions = var.getValue();
    // var = contribEnv.getVariable(ENV_KEY_JANTJE_ASSEMBLY_COMPILE_OPTIONS,
    // confDesc);
    // if (var != null)
    // this.my_Assembly_CompileOptions = var.getValue();
    // var = contribEnv.getVariable(ENV_KEY_JANTJE_ARCHIVE_COMPILE_OPTIONS,
    // confDesc);
    // if (var != null)
    // this.my_Archive_CompileOptions = var.getValue();
    // var = contribEnv.getVariable(ENV_KEY_JANTJE_LINK_COMPILE_OPTIONS, confDesc);
    // if (var != null)
    // this.my_Link_CompileOptions = var.getValue();
    // var = contribEnv.getVariable(ENV_KEY_JANTJE_ALL_COMPILE_OPTIONS, confDesc);
    // if (var != null)
    // this.my_All_CompileOptions = var.getValue();
    //
    // }
    // }

    public boolean isWarningLevel() {
        return this.myWarningLevel;
	}

	public void setWarningLevel(boolean myWarningLevel) {
        this.myWarningLevel = myWarningLevel;
	}

	public boolean isParallelBuildEnabled() {
		return myEnableParallelBuild;
	}

	public void setEnableParallelBuild(boolean parrallelBuild) {
		this.myEnableParallelBuild = parrallelBuild;
	}

	public boolean isAlternativeSizeCommand() {
		return this.myAlternativeSizeCommand;
	}

	public void setAlternativeSizeCommand(boolean alternativeSizeCommand) {
		this.myAlternativeSizeCommand = alternativeSizeCommand;
	}

	public String get_CPP_CompileOptions() {
		return this.my_CPP_CompileOptions;
	}

	public void set_CPP_CompileOptions(String new_CPP_CompileOptions) {
		this.my_CPP_CompileOptions = new_CPP_CompileOptions;
	}

	public String get_C_CompileOptions() {
		return this.my_C_CompileOptions;
	}

	public void set_C_CompileOptions(String new_C_CompileOptions) {
		this.my_C_CompileOptions = new_C_CompileOptions;
	}

	public String get_C_andCPP_CompileOptions() {
		return this.my_C_andCPP_CompileOptions;
	}

	public void set_C_andCPP_CompileOptions(String new_C_andCPP_CompileOptions) {
		this.my_C_andCPP_CompileOptions = new_C_andCPP_CompileOptions;
	}

	public String get_Assembly_CompileOptions() {
		return this.my_Assembly_CompileOptions;
	}

	public void set_Assembly_CompileOptions(String my_Assembly_CompileOptions) {
		this.my_Assembly_CompileOptions = my_Assembly_CompileOptions;
	}

	public String get_Archive_CompileOptions() {
		return this.my_Archive_CompileOptions;
	}

	public void set_Archive_CompileOptions(String my_Archive_CompileOptions) {
		this.my_Archive_CompileOptions = my_Archive_CompileOptions;
	}

	public String get_Link_CompileOptions() {
		return this.my_Link_CompileOptions;
	}

	public void set_Link_CompileOptions(String my_Link_CompileOptions) {
		this.my_Link_CompileOptions = my_Link_CompileOptions;
	}

	public String get_All_CompileOptions() {
		return this.my_All_CompileOptions;
	}

	public void set_All_CompileOptions(String my_All_CompileOptions) {
		this.my_All_CompileOptions = my_All_CompileOptions;
	}

	/**
	 * save the compilation options in this configuration description.
	 *
	 * @param configuration must be a valid configuration description
	 */
    public Map<String, String> getEnvVars() {
        Map<String, String> ret = getEnvVarsConfig();

        ret.put(ENV_KEY_JANTJE_WARNING_LEVEL, Boolean.valueOf(myWarningLevel).toString());

		if (this.isWarningLevel()) {
            ret.put(ENV_KEY_WARNING_LEVEL_OFF, ENV_KEY_WARNING_LEVEL_ON);
		}
		if (this.myAlternativeSizeCommand) {
            ret.put(ENV_KEY_JANTJE_SIZE_SWITCH, Common.makeEnvironmentVar(ENV_KEY_JANTJE_SIZE_COMMAND));
		} else {
            ret.put(ENV_KEY_JANTJE_SIZE_SWITCH, Common.makeEnvironmentVar(Const.RECIPE_SIZE));
		}

        return ret;
	}

    /**
     * Given the compile options you currently have and the ones provided Is a
     * rebuild needed if you switch from one to another
     * 
     * @param curOptions
     * @return true if a rebuild is needed otherwise false
     */

    public boolean needsRebuild(CompileDescription curOptions) {
		// ignore myWarningLevel
		// ignore myAlternativeSizeCommand
		if (!this.my_CPP_CompileOptions.equals(curOptions.get_CPP_CompileOptions())) {
			return true;
		}
		if (!this.my_C_CompileOptions.equals(curOptions.get_C_CompileOptions())) {
			return true;
		}
		if (!this.my_C_andCPP_CompileOptions.equals(curOptions.get_C_andCPP_CompileOptions())) {
			return true;
		}
		if (!this.my_Assembly_CompileOptions.equals(curOptions.get_Assembly_CompileOptions())) {
			return true;
		}
		if (!this.my_Archive_CompileOptions.equals(curOptions.get_Archive_CompileOptions())) {
			return true;
		}
		if (!this.my_Link_CompileOptions.equals(curOptions.get_Link_CompileOptions())) {
			return true;
		}
		if (!this.my_All_CompileOptions.equals(curOptions.get_All_CompileOptions())) {
			return true;
		}

		return false;
	}

    public Map<String, String> getEnvVarsConfig() {
        Map<String, String> ret = new HashMap<>();
        ret.put(ENV_KEY_JANTJE_ADDITIONAL_COMPILE_OPTIONS, this.my_C_andCPP_CompileOptions);
        ret.put(ENV_KEY_JANTJE_ADDITIONAL_CPP_COMPILE_OPTIONS, this.my_CPP_CompileOptions);
        ret.put(ENV_KEY_JANTJE_ADDITIONAL_C_COMPILE_OPTIONS, this.my_C_CompileOptions);
        ret.put(ENV_KEY_JANTJE_ASSEMBLY_COMPILE_OPTIONS, this.my_Assembly_CompileOptions);
        ret.put(ENV_KEY_JANTJE_ARCHIVE_COMPILE_OPTIONS, this.my_Archive_CompileOptions);
        ret.put(ENV_KEY_JANTJE_LINK_COMPILE_OPTIONS, this.my_Link_CompileOptions);
        ret.put(ENV_KEY_JANTJE_ALL_COMPILE_OPTIONS, this.my_All_CompileOptions);
        return ret;
    }

    public CompileDescription(TxtFile configFile) {
        KeyValueTree tree = configFile.getData();
        my_C_andCPP_CompileOptions = tree.getValue(ENV_KEY_JANTJE_ADDITIONAL_COMPILE_OPTIONS);
        my_CPP_CompileOptions = tree.getValue(ENV_KEY_JANTJE_ADDITIONAL_CPP_COMPILE_OPTIONS);
        my_C_CompileOptions = tree.getValue(ENV_KEY_JANTJE_ADDITIONAL_C_COMPILE_OPTIONS);
        my_Assembly_CompileOptions = tree.getValue(ENV_KEY_JANTJE_ASSEMBLY_COMPILE_OPTIONS);
        my_Archive_CompileOptions = tree.getValue(ENV_KEY_JANTJE_ARCHIVE_COMPILE_OPTIONS);
        my_Link_CompileOptions = tree.getValue(ENV_KEY_JANTJE_LINK_COMPILE_OPTIONS);
        my_All_CompileOptions = tree.getValue(ENV_KEY_JANTJE_ALL_COMPILE_OPTIONS);

    }

    public CompileDescription() {
        // no need to do anything
        // this will create default compile options
        // note that the Parallel build option is implemented at the ui level
        // therefore this is not set here but in the ui before project creation
    }

    public boolean isEqual(CompileDescription other) {
        return (myWarningLevel == other.myWarningLevel) && (myAlternativeSizeCommand == other.myAlternativeSizeCommand)
                && (my_CPP_CompileOptions.equals(other.my_CPP_CompileOptions))
                && (my_C_CompileOptions.equals(other.my_C_CompileOptions))
                && (my_C_andCPP_CompileOptions.equals(other.my_C_andCPP_CompileOptions))
                && (my_Assembly_CompileOptions.equals(other.my_Assembly_CompileOptions))
                && (my_Archive_CompileOptions.equals(other.my_Archive_CompileOptions))
                && (my_Link_CompileOptions.equals(other.my_Link_CompileOptions))
                && (my_All_CompileOptions.equals(other.my_All_CompileOptions));

    }
}
