package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i = 0;
		int j;
		int k;
		int t;
		int[] a = new int[300];
		char c;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i++] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c == '\n')
			{
				break;
			}
		}
		if (i == 1)
		{
			System.out.print("No\n");
			return 0;
		}
		for (j = 0;j < i - 1;j++)
		{
			for (k = 0;k < i - j - 1;k++)
			{
				if (a[k] < a[k + 1])
				{
					m = a[k];
					a[k] = a[k + 1];
					a[k + 1] = m;
				}
			}
		}
		for (j = 0;j < i - 1;j++)
		{
			t = 0;
			if (a[j] > a[j + 1])
			{
				t = 1;
				System.out.printf("%d",a[j + 1]);
				break;
			}
		}
		if (t == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}

}

