package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] sz1 = new int[200];
		int[] sz2 = new int[200];
		int a = 0;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz1[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz2[i] = Integer.parseInt(tempVar3);
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			sz1[n - 1] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			sz2[n - 1] = Integer.parseInt(tempVar5);
		}
		for (i = 0;i < n;i++)
		{
			if (sz1[i] == 0 && sz2[i] == 1)
			{
				a++;
			}
			if (sz1[i] == 1 && sz2[i] == 2)
			{
				a++;
			}
				if (sz1[i] == 2 && sz2[i] == 0)
				{
				a++;
				}
			if (sz1[i] == 1 && sz2[i] == 0)
			{
				b++;
			}
			if (sz1[i] == 2 && sz2[i] == 1)
			{
				b++;
			}
			if (sz1[i] == 0 && sz2[i] == 2)
			{
				b++;
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		if (a < b)
		{
			System.out.print("B");
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

