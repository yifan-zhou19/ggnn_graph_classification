package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] b = new int[100];
		int c;
		int d;
		int i;
		int e;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0;a.charAt(i) != 0;i++)
		{
			b[i] = a.charAt(i) - '0';
		}
		c = 10 * b[0] + b[1];
		n = a.length();
		if (n == 1)
		{
			System.out.printf("0\n%d",b[0]);
		}
		else
		{
		if (n == 2)
		{
			System.out.printf("%d\n%d",c / 13,c % 13);
		}
		else
		{
		if (c < 13)
		{
			for (i = 2;i < n;i++)
			{
			c = 10 * c + b[i];
			e = c / 13;
			c = c % 13;
			System.out.printf("%d",e);
			}
		}
		else
		{
			 for (i = 2;i < n;i++)
			 {
			e = c / 13;
			c = c % 13;
			c = 10 * c + b[i];
			System.out.printf("%d",e);
			 }
		System.out.printf("%d",c / 13);
		}
		c = c % 13;
		System.out.printf("\n%d",c);
		}
		}
	}
}

