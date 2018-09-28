package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] know = new int[10000];
		int[] known = new int[10000];
		int i;
		int j;
		int n;
		int k = 0;
		int a;
		int b;
		int time;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		time = n * (n - 1);
		for (i = 0;i < n;i++)
		{
			know[i] = 0;
			known[i] = 0;
		}
		for (i = 0;i < time;i++)
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
			   break;
			}
			else
			{
			   know[a]++;
			   known[b]++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (know[i] == 0 && known[i] == (n - 1))
			{
				System.out.printf("%d\n",i);
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}

