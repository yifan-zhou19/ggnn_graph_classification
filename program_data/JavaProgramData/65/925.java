package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] z = new int[n];
		int[] x = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i] = Integer.parseInt(tempVar3);
			}
		}
		a = 0;
		b = 0;
		for (i = 0;i < n;i++)
		{
			if (z[i] == 0 && x[i] == 2)
			{
				b++;
			}
			else if (z[i] == 2 && x[i] == 0)
			{
				a++;
			}
			else if (z[i] < x[i])
			{
				a++;
			}
			else if (z[i] > x[i])
			{
				b++;
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
		else if (a == b)
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

