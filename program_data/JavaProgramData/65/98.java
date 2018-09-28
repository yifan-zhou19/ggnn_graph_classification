package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] r = new int[200];
		int[] e = new int[200];
		int i;
		int a = 0;
		int b = 0;
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
				r[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				e[i] = Integer.parseInt(tempVar3);
			}
			if ((r[i] == 0 && e[i] == 1) || (r[i] == 1 && e[i] == 2) || (r[i] == 2 && e[i] == 0))
			{
				a++;
			}
		else if ((e[i] == 0 && r[i] == 1) || (e[i] == 1 && r[i] == 2) || (e[i] == 2 && r[i] == 0))
		{
				b++;
		}
		}
		if (a > b)
		{
			System.out.print("A");
		};
		if (a < b)
		{
			System.out.print("B");
		};
		if (a == b)
		{
			System.out.print("Tie");
		};
		return 0;
	}
}

