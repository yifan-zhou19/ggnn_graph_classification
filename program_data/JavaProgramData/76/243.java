package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[LEN];
		int n;
		int i;
		int j;
		int p;
		int q;
		int min;
		int max;
		int s = 0;
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
				p = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				q = Integer.parseInt(tempVar3);
			}
			for (j = p;j < q;j++)
			{
				a[j] = 1;
			}
		}
		for (i = 0;i < LEN;i++)
		{
			s += a[i];
		}
		for (i = 0;i < LEN;i++)
		{
			if (a[i] == 1)
			{
				min = i;
				break;
			}
		}
		for (i = min;i < LEN;i++)
		{
			if (a[i] == 0)
			{
				max = i - 1;
				break;
			}
		}
		if (max - min + 1 == s)
		{
			System.out.printf("%d %d\n",min,max + 1);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}


}

