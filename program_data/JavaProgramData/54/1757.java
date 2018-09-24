//*****************************************
//* ???????? **
//* ?????? 1300012741 **
//* ???2013.10.16 **
//*****************************************


int share = new int(int, int, int, int);

int main()
{
	int numMonkey;
	int numThrowed;
	int numRest = 1;
	int numApples;

	numMonkey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	numThrowed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	while ((numApples = share(numMonkey, numMonkey, numThrowed, numRest)) == 0)
	{
		numRest++;
	}

	System.out.print(numApples);
	System.out.print("\n");

	return 0;
}

int share(int originNumMonkey, int numMonkey, int numThrowed, int numRest)
{
	if (numMonkey == 1)
	{
		return numRest * originNumMonkey + numThrowed;
	}
	else if ((originNumMonkey * numRest + numThrowed) % (originNumMonkey - 1))
	{
		return 0;
	}
	else
	{
		return share(originNumMonkey, numMonkey - 1, numThrowed, (originNumMonkey * numRest + numThrowed) / (originNumMonkey - 1));
	}
}

