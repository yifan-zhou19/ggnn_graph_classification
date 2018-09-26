package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int[] b = new int[100];
		int[] c = new int[100];
		int i;
		int j;
		int k;
		int m;
		int n;
		n = a.length();
		for (i = 0;i <= n;i++)
		{
			b[i] = a.charAt(i) - '0';
		}
		if (n <= 2)
		{
			if (n == 1)
			{
				System.out.printf("%c\n%d",'0',b[0]);
			}
			if (n == 2)
			{
				k = b[0] * 10 + b[1];
				System.out.printf("%d\n%d",k / 13,k % 13);
			}
		}
		else
		{
		c[0] = (b[0] * 10 + b[1]) / 13;
		b[1] = (b[0] * 10 + b[1]) % 13;
		if (c[0] != 0)
		{
			System.out.printf("%d",c[0]);
		}
		for (i = 1;i < n - 1;i++)
		{
			c[i] = (b[i] * 10 + b[i + 1]) / 13;
			b[i + 1] = (b[i] * 10 + b[i + 1]) % 13;
			System.out.printf("%d",c[i]);
		}
		System.out.print("\n");
		System.out.printf("%d",b[n - 1]);
		}

	}
}

