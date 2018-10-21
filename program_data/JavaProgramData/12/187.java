package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[15];
		int i = 1;
		int j;
		int k;
		int[] p;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (a[0] != -1)
		{
			for (i = 1;;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			if (a[i] == 0)
			{
				break;
			}
			}
			p = a;
			for (j = 0;j < i;j++)
			{
			  for (k = 0;k < i;k++)
			  {
				if (p[j] == p[k] * 2)
				{
					count++;
				}
			  }
			}
			System.out.printf("%d\n",count);
			count = 0;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[0] = Integer.parseInt(tempVar3);
			}
		}
		return 0;
	}
}

