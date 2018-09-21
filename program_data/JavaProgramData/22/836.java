package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int b;
		int i = 0;
		int j;
		int t;
		int n;
		char c;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c == ',')
			{
				i++;
			}
			else
			{
				break;
			}
		}
		n = i + 1;
		if (n == 1)
		{
			System.out.print("No\n");
			return 0;
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - 1 - j;i++)
			{
				if (a[i] < a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
		if (a[0] == a[n - 1])
		{
			System.out.print("No\n");
			return 0;
		}
		for (i = 0;i < n;i++)
		{
			if (a[i + 1] < a[i])
			{
				System.out.printf("%d\n",a[i + 1]);
				break;
			}
		}
	}


}

