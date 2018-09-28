package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int count = 0;
		int a;
		int b;
		for (i = 0; i < n; ++i)
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
			if (a == 0 && b == 1)
			{
				count++;
			}
			else if (a == 0 && b == 2)
			{
				count--;
			}
			else if (a == 1 && b == 0)
			{
				count--;
			}
			else if (a == 1 && b == 2)
			{
				count++;
			}
			else if (a == 2 && b == 0)
			{
				count++;
			}
			else if (a == 2 && b == 1)
			{
				count--;
			}
		}
		if (count > 0)
		{
			System.out.print("A\n");
		}
		else if (count < 0)
		{
			System.out.print("B\n");
		}
		else
		{
			System.out.print("Tie\n");
		}
		return 0;
	}

}

