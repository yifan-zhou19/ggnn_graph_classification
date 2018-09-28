package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] t = new int[100];
		int i;
		int j;
		int c = 1;
		int b = 1;
		int e;
		int l;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == 2 || a[i] == 1)
			{
				System.out.print("1\n");

			}
			else
			{
				c = 1;
				b = 1;
				for (j = 2;j < a[i];j++)
				{
					t[j] = c + b;
					l = j;
					e = b;
					b = c + b;
					c = e;
				}
				System.out.printf("%d\n",t[l]);
			}
		}
		return 0;
	}

}

