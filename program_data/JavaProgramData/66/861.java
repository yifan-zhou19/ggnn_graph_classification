package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int a;
		int b;
		int c;
		int sum = 0;
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		sum = a - 1 + (a - 1) / 400 + (a - 1) / 4 - (a - 1) / 100;

		for (i = 1;i < b;i++)
		{

			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				sum += 3;
			}
			else if (i == 2)
			{
				if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0))
				{
					sum += 1;
				}
			}
			else
			{
				sum += 2;
			}
		}

		sum += c;

		sum = (sum - 1) % 7;

		if (sum == 0)
		{
			System.out.print("Mon.\n");
		}
		else if (sum == 1)
		{
			System.out.print("Tue.\n");
		}
		else if (sum == 2)
		{
			System.out.print("Wed.\n");
		}
		else if (sum == 3)
		{
			System.out.print("Thu.\n");
		}
		else if (sum == 4)
		{
			System.out.print("Fri.\n");
		}
		else if (sum == 5)
		{
			System.out.print("Sat.\n");
		}
		else if (sum == 6)
		{
			System.out.print("Sun.\n");
		}




		return 0;
	}


}

