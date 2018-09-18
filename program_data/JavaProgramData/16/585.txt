package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int U1;
	int U2;
	int U3;
	int U4;
	int U;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		i = Integer.parseInt(tempVar);
	}
	U1 = i / 1000;
	U2 = (i - 1000 * U1) / 100;
	U3 = (i - 1000 * U1 - 100 * U2) / 10;
	U4 = (i - 1000 * U1 - 100 * U2 - 10 * U3);
	if (U1 != 0)
	{
	System.out.printf("%d%d%d%d",U4,U3,U2,U1);
	}
	else
	{
		if (U2 != 0)
		{
		System.out.printf("%d%d%d",U4,U3,U2);
		}
		else
		{
			if (U3 != 0)
			{
			System.out.printf("%d%d",U4,U3);
			}
			else
			{
				if (U4 != 0)
				{
				System.out.printf("%d",U4);
				}
				else
				{
				System.out.print("0");
				}
			}
		}
	}
	return 0;
	}

}

