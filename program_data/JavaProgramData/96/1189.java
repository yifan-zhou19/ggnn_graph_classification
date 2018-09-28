package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		int[] a = new int[100];
		int[] b = new int[100];
		int c;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		c = s.length();
		for (i = 0;i < c;i++)
		{
			a[i] = s.charAt(i) - '0';
		}
		for (i = 0;i < c - 1;i++)
		{
			b[i] = (a[i] * 10 + a[i + 1]) / 13;
			a[i + 1] = (a[i] * 10 + a[i + 1]) % 13;
		}
		if (c > 2)
		{
			if (b[0] != 0)
			{
				System.out.printf("%d",b[0]);
			}
			for (i = 1;i < c - 1;i++)
			{
				System.out.printf("%d",b[i]);
			}
			System.out.print("\n");
			System.out.printf("%d",a[c - 1]);
		}
		else
		{
			System.out.printf("%d",b[0]);
			System.out.print("\n");
			System.out.printf("%d",a[c - 1]);
		}

	}

}

