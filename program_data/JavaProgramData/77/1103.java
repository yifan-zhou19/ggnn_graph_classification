package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int[] a = new int[100];
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		n = str.length();
		for (i = 0;i <= n - 1;i++)
		{
			if (str.charAt(i) != str.charAt(0))
			{
				a[i] = 100 + i;
			}
			else
			{
				a[i] = i;
			}
		}
		for (i = 1;i <= n - 1;i++)
		{
			if (a[i - 1] < 100 && a[i]>100)
			{
				System.out.printf("%d %d\n",a[i - 1],a[i] - 100);
				for (j = i - 1;j <= n - 3;j++)
				{
					a[j] = a[j + 2];
				}
				i = 0;
			}
		}
	}

}

