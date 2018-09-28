package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[200][3];
		int i;
		int A = 0;
		int B = 0;
		int t = 0;
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
				(a[i][0]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(a[i][1]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((a[i][0] == 0) && (a[i][1] == 1))
			{
				a[i][2] = 1;
				continue;
			}
			else if (a[i][0] == 0 && a[i][1] == 2)
			{
				a[i][2] = 2;
				continue;
			}
			else if (a[i][0] == 1 && a[i][1] == 0)
			{
				a[i][2] = 2;
				continue;
			}
			else if (a[i][0] == 1 && a[i][1] == 2)
			{
				a[i][2] = 1;
				continue;
			}
			else if (a[i][0] == 2 && a[i][1] == 1)
			{
				a[i][2] = 2;
				continue;
			}
			else if (a[i][0] == 2 && a[i][1] == 0)
			{
				a[i][2] = 1;
				continue;
			}
			else if (a[i][0] == a[i][1])
			{
				a[i][2] = 3;
				continue;
			}

		}
	for (i = 0;i < n;i++)
	{
		if (a[i][2] == 1)
		{
			A++;
			continue;
		}
		else if (a[i][2] == 2)
		{
			B++;
			continue;
		}
	}
	if (A > B)
	{
		System.out.print("A");
	}
	else if (A < B)
	{
		System.out.print("B");
	}
	else if (A == B)
	{
		System.out.print("Tie");
	}

	return 0;
	}

}

