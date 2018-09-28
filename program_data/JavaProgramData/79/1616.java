package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int gg;
		for (gg = 0;;gg++)
		{
		int n;
		int k = 0;
		int i;
		int m;
		int j;
		int[] a = new int[301];
		int kick = 0;

		for (i = 1;i <= 301;i++)
		{
			a[i] = 1;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (m == 0)
		{
		break;
		}
		if (n == 1)
		{
			System.out.print("1\n");
		}
		else
		{
		for (j = 0;;j++)
		{
			for (i = 1;i <= n;i++)
			{
				if (a[i] == 1)
				{
					k += 1;
					if (k == m)
					{
						a[i] = 0;
						kick += 1;
						k = 0;
						if (kick == n - 1)
						{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							goto loop;
						}
					}
				}
			}

		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		loop:
		for (i = 1;i <= n;i++)
		{
			if (a[i] == 1)
			{
				System.out.printf("%d\n",i);
			}
		}
		}
		}


	}
}

