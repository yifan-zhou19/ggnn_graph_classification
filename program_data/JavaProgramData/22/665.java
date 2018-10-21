package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int i;
		int n = 0;
		int j;
		int k;
		char c;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n++] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c != ',')
			{
				break;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			int t;
			k = i;
			for (j = i + 1;j < n;j++)
			{
				if (a[j] > a[k])
				{
					k = j;
				}
			}
			t = a[i];
			a[i] = a[k];
			a[k] = t;
		}
		i = 0;
		while (i < n && a[i] == a[0])
		{
			i++;
		}
		if (i == n)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",a[i]);
		}
		return 0;
	}
}

