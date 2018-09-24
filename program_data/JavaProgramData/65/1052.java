package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int ta;
		int tb;
		int[] a = new int[200];
		int[] b = new int[200];
		int[] x = new int[200];

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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}

		ta = 0;
		tb = 0;

		for (i = 0;i < n;i++)
		{
			x[i] = b[i] - a[i];
			if (x[i] == 1 || x[i] == -2)
			{
				ta++;
			}
			else if (x[i] == -1 || x[i] == 2)
			{
				tb++;
			}
		}

		if (ta < tb)
		{
			System.out.print("B\n");
		}
		else if (ta == tb)
		{
			System.out.print("Tie\n");
		}
		else
		{
			System.out.print("A\n");
		}

		return 0;
	}

}

