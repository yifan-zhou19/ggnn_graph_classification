package <missing>;

public class GlobalMembers
{
	public static void printnum(int[] a)
	{
		int i;
		for (i = a[0];i > 0; --i)
		{
			System.out.printf("%d", a[i]);
		}
		System.out.print("\n");
	}

	public static void getnum(int[] a)
	{
		int i;
		String str = new String(new char[100]);

		for (i = 0;i < 100;++i)
		{
			a[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		a[0] = str.length();
		for (i = a[0] - 1;i >= 0;--i)
		{
			a[a[0] - i] = str.charAt(i) - '0';
		}
	}

	public static void getdif(int[] c, int[] a, int[] b)
	{
		int i;

		if (a[0] > b[0])
		{
			c[0] = a[0];
		}
		else
		{
			c[0] = b[0];
		}

		c[1] = 0;
	  for (i = 1;i <= c[0];++i)
	  {
		if (c[i] + a[i] - b[i] < 0)
		{
			c[i + 1] = -1;
			c[i] += a[i] - b[i] + 10;
		}
		else
		{
			c[i + 1] = 0;
			c[i] += a[i] - b[i];
		}
	  }
		while (c[c[0]] == 0)
		{
			--c[0];
		}

	}

	public static void Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	   for (;n != 0;--n)
	   {
		   getnum(a);
			getnum(b);
			getdif(c, a, b);
		   printnum(c);
	   }
	}

}

