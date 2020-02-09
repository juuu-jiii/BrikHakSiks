package pseudocode;

public class pseudocode {

    /*


CLASS WASHER
4 modes:
	const mins23
	const mins25
	const mins27
	const mins29

type = washer

public override void Operate()
{
	Ask user for mode selected
	Switch duration based on user input
	Set internal timer
	Flag as inUse
	Print confirmation message
}

public override void Report()
{
	Send message to RIT Housing
	Flag as !isFunctioning
	Print confirmation message
}

public override string ToString()
{
	if (isAvailable && isFunctioning)
	{
		print("{name} + AVAILABLE")
	}
	else if (!isAvailable && isFunctioning)
	{
		print("{name} + UNAVAILABLE + {timeLeft}")
	}
	else if (!isFunctioning)
	{
		print("{name} + OUT OF ORDER")
	}
}

CLASS DRYER
1 mode:
	const mins45

type = dryer

public override void Operate()
{
	Set internal timer
	Flag as inUse
	Print confirmation message
}

public override void Report()
{
	Send message to RIT Housing
	Flag as !isFunctioning
	Print confirmation message
}

CLASS MACHINE (ABSTRACT)
washer and dryer will inherit from this.
fields to include:
	bool isAvailable - true if machine is in use, false otherwise
	bool isFunctioning - true if machine is in working order, false otherwise
	int timeLeft - amount of time remaining until machine finishes its wash/dry
	string type - type of machine

properties to include:
	get for all,
	set for isAvailable, isFunctioning
default ctr intialises all fields above

methods:
public virtual void Operate();
public virtual void Report();

CLASS LAUNDRYMANAGER (MANAGER)
List of all Washer and Dryer objects

methods:
public bool AvailabilityCheck(Machine machineToCheck)
{
	if (machineToCheck.isAvailable && machineToCheck.inUse)
	{
		return true;
	}
	else
	{
		return false;
	}
}

public void DrawToScreen()
{
	Draws to screen the washers/dryers available (each has a number/letter assigned to it)
	<to do this, loop through the list and downcast as necessary>

	Checks status of each, and writes to screen accordingly, using foreach loop
	for (int i = 0; i < list.count; i++)
	{
		print("{i + 1} + element.tostring"} (is a downcast necessary?)
	}
}

public void MachineSelect()
{
	Loop through list

	Draws to screen the washers/dryers available (each has a number/letter assigned to it)

	Checks status of each, and writes to screen accordingly
	if (functioning && !inUse)
	{
		Show as AVAILABLE
	}
	else
	{
		Show as UNAVAILABLE
		if (!functioning)
		{
			Show as OUT OF ORDER
		}
		else if (inUse)
		{
			Show as IN USE
			Display remaining time
		}
	}

	Let user pick from the washers/dryers
	if user picks one that is AVAILABLE
	{
		Prompt user to check if machine is in working order
		if (yes)
		{
			Operate()
		}
		else
		{
			Report()
			Let user pick again.
		}
	}
	else
	{
		Print error message.
		Let user pick again.
	}
}

MAIN()
USER INPUT/FEEDBACK LOOP
DrawToScreen()
Prompt for user input based on number next to .tostring() [see DrawToScreen())
if (list[userinput


     */

}
