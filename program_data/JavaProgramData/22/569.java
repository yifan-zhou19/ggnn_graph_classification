package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[300]);
		c = new Scanner(System.in).nextLine();
		int[] a = new int[300];
		int n = 0;
		int i = 0;
		int k = 0;
		for (i = 0;i < 300;i++)
		{
			a[i] = 0;
		}
		i = 0;
		while (c.charAt(i) != 0)
		{
			if (c.charAt(i) != ',')
			{
				a[n] = a[n] * 10 + c.charAt(i) - '0';
			}
			else
			{
				n++;
			}
			i++;
		}
	//	puts(c);
	/*	for(i=0;i<=n;i++)
			printf("%d,",a[i]);*/
			for (i = 0;i <= n;i++)
			{
				if (a[i] > k)
				{
					k = a[i];
				}
			}
			for (i = 0;i <= n;i++)
			{
				if (a[i] == k)
				{
					a[i] = 0;
				}
			}
			k = 0;
			for (i = 0;i <= n;i++)
			{
				if (a[i] != 0)
				{
					break;
				}
			}
			if (i > n)
			{
				System.out.print("No");
			}
			else
			{
			for (i = 0;i <= n;i++)
			{
				if (a[i] > k)
				{
					k = a[i];
				}
			}
			System.out.printf("%d",k);
			}
	}
}
