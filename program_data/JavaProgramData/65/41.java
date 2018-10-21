package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int s;
		int j;
		a = 0;
		b = 0;
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
				s = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
			if ((s == 0 && j == 1) || (s == 1 && j == 2) || (s == 2 && j == 0))
			{
				a++;
			}
			else if ((j == 0 && s == 1) || (j == 1 && s == 2) || (j == 2 && s == 0))
			{
				b++;
			}
			else if ((s == 0 && j == 0) || (s == 1 && j == 1) || (s == 2 && j == 2))
			{
				a = a + 0;
				b = b + 0;
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		else if (a < b)
		{
			System.out.print("B");
		}
		else if (a = b)
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

