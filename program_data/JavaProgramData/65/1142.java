package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int[] sz1 = new int[201];
		int[] sz2 = new int[201];
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz1[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz2[i] = Integer.parseInt(tempVar3);
			}
		}
		i = 0;
		for (i;i <= n;i++)
		{
			if (sz1[i] == 0 && sz2[i] == 1)
			{
				a += 1;
			}
			if (sz1[i] == 1 && sz2[i] == 2)
			{
				a += 1;
			}
			if (sz1[i] == 2 && sz2[i] == 0)
			{
				a += 1;
			}
			if (sz2[i] == 0 && sz1[i] == 1)
			{
				b += 1;
			}
			if (sz2[i] == 1 && sz1[i] == 2)
			{
				b += 1;
			}
			if (sz2[i] == 2 && sz1[i] == 0)
			{
				b += 1;
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

