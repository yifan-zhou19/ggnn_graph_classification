package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int s = 0;
		int t;
		int j;
		char b;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			b = System.in.read();
			if (b != ',')
			{
				break;
			}
		}
		n = i;
		for (i = 1;i <= n;i++)
		{
			if (a[i] != a[0])
			{
				s = 1;
			break;
			}
		}
		if (s == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				for (j = n;j > i;j--)
				{
					if (a[j] > a[j - 1])
					{
						t = a[j];
						a[j] = a[j - 1];
						a[j - 1] = t;
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				if (a[i] != a[0])
				{
					System.out.printf("%d",a[i]);
				break;
				}
			}

		}
	}


}

