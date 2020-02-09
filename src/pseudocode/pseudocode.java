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

MAIN()
USER INPUT/FEEDBACK LOOP:
	Instantiate Manager object
	DrawToScreen()
	Prompt for user input based on number next to .tostring() [see DrawToScreen()]
	Parse userinput into an int

	// If user picks one that is available
	if (managerObject.AvailabilityCheck([userinput - 1]))
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
		Print error message
		Let user prick again.
	}

     */

}
