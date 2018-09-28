package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n = new String(new char[100]);
		int[] b = new int[100];
		int[] a = new int[100];
		int i;
		int sa;
		int c;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar.charAt(0);
		}
		sa = n.length();
		for (i = 0;i < sa;i++)
		{
			a[i] = n.charAt(i) - '0';
		}
		c = a[0];
		for (i = 0;i < sa - 1;i++)
		{
			b[i] = (10 * c + a[i + 1]) / 13;
			c = (10 * c + a[i + 1]) % 13;
		}
		if (sa == 1)
		{
			System.out.printf("0\n%d",a[0]);
			k = 1;
		}
		if ((sa == 2) && (a[0] * 10 + a[1] < 13))
		{
			System.out.printf("0\n%d",10 * a[0] + a[1]);
			k = 1;
		}
		if (k == 0)
		{
		if (b[0] == 0)
		{
			for (i = 1;i < sa - 1;i++)
			{
				System.out.printf("%d",b[i]);
			}
			System.out.printf("\n%d",c);
		}
		else
		{
			for (i = 0;i < sa - 1;i++)
			{
				System.out.printf("%d",b[i]);
			}
			System.out.printf("\n%d",c);
		}
		}
		return 0;
	}

}

