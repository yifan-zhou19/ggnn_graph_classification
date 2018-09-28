package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int total;
		total = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == 0 && b == 0)
			{
			}
			else if (a == 0 && b == 1)
			{
				total++;
			}
			else if (a == 0 && b == 2)
			{
				total--;
			}
			else if (a == 1 && b == 0)
			{
				total--;
			}
			else if (a == 1 && b == 1)
			{
			}
			else if (a == 1 && b == 2)
			{
				total++;
			}
			else if (a == 2 && b == 0)
			{
				total++;
			}
			else if (a == 2 && b == 1)
			{
				total--;
			}
			else if (a == 2 && b == 2)
			{
			}
		}
		if (total == 0)
		{
			System.out.print("Tie");
		}
		else if (total < 0)
		{
			System.out.print("B");
		}
		else
		{
			System.out.print("A");
		}
		return 0;
	}

}

