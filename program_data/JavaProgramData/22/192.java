package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int i = 1;
		int n;
		int t = 0;
		int p = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (System.in.read() != '\n')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			i++;
			n = i;
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n - j - 1;i++)
			{
				if (a[i] < a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[0] > a[i])
			{
				System.out.printf("%d\n",a[i]);
				p = 1;
				break;
			}
		}
		if (p == 0)
		{
			System.out.print("No\n");
		}
	}
}

