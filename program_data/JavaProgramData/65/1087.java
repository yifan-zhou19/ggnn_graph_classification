package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int[] x = new int[200];
		int[] y = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(x[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(y[i]) = Integer.parseInt(tempVar3);
			}
			if (y[i] - x[i] == 1 || x[i] - y[i] == 2)
			{
				a++;
			}
			else if (x[i] - y[i] == 1 || y[i] - x[i] == 2)
			{
				b++;
			}
			else if (x[i] == y[i])
			{
				continue;
			}
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		else if (a > b)
		{
			System.out.print("A");
		}
		else if (a < b)
		{
			System.out.print("B");
		}

		return 0;
	}

}

