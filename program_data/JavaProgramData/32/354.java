package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int l1;
		int l2;
		int i;
		int j;
		char[] begin1 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] begin2 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int compare = new int(int a, int b);
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
				begin1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				begin2 = tempVar3.charAt(0);
			}
			if (i != n - 1)
			{
				scanf("\n");
			}
			l1 = begin1.length();
			l2 = begin2.length();
			for (j = 0;j < compare(l1, l2);j++)
			{
				if (l1 >= l2)
				{
					a[j] = (int)begin1[j] - 48;
					if (j < l2)
					{
						b[j + l1 - l2] = (int)begin2[j] - 48;
					}
				}
				else
				{
					if (j < l1)
					{
						a[j + l2 - l1] = (int)begin1[j] - 48;
					}
					b[j] = (int)begin2[j] - 48;
				}
			}
			for (j = compare(l1, l2) - 1;j >= 0;j--)
			{
				if (a[j] - b[j] >= 0)
				{
					c[j] = a[j] - b[j];
				}
				else
				{
					c[j] = 10 + a[j] - b[j];
					a[j - 1] = a[j - 1] - 1;
				}
			}
			for (j = 0;j < compare(l1, l2);j++)
			{
				System.out.printf("%d", c[j]);
				c[j] = 0;
				begin1[j] = '\0';
				begin2[j] = '\0';
				a[j] = 0;
				b[j] = 0;
			}
			System.out.print("\n");

		}
		return 0;
	}
	public static int compare(int a, int b)
	{
		if (a >= b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}




}

