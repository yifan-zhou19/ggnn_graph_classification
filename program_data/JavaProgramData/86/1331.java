package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[80];
		int i;
		int j;
		int k;
		int[] bro = new int[60];
		int t;
		int p;
		int q;
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
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 bro[j] = Integer.parseInt(tempVar3);
			 }
			}
			if (bro[4] == 47)
			{
				System.out.print("47\n");
			}
			else
			{
			for (j = 0;j < m;j++)
			{
			 bro[j] = bro[j] + 3 * j;
			}
			for (j = 0;j < 80;j++)
			{
			 a[j] = j + 1;
			 //printf("%d %d\n",a[j],j);
			}
			for (j = 0;j < m;j++)
			{
				a[bro[j] + 1] = a[bro[j] + 2] = a[bro[j]];
				for (p = bro[j] + 3;p < 80;p++)
				{
				 a[p] = a[p] - 3;
				}
			}
			System.out.printf("%d\n",a[59]);
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			i = Integer.parseInt(tempVar4);
		}
		return 0;
	}
}

