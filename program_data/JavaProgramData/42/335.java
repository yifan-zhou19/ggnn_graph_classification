package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[100000];
		int n;
		int del;
		int rem;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i <= n - 1;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num[i] = Integer.parseInt(tempVar2);
		}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			del = Integer.parseInt(tempVar3);
		}
		rem = n;
		int g;
		for (g = n - 1;num[g] == del;g--)
		{
			rem -= 1;
		}
		int e;
		for (e = 0;e <= rem - 1;e++)
		{
			while (num[e] == del)
			{
				int t;
				for (t = e;t <= rem - 2;t++)
				{
					num[t] = num[t + 1];
				}
				rem -= 1;
			}
		}
		int m;
		for (m = 0;m <= rem - 1;m++)
		{
			System.out.printf("%d",num[m]);
			if (m <= rem - 2)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}


}

