package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n;
		a = 1;
		b = 2;
		c = 3;
		if (n == 1)
		{
			System.out.printf("%s","End");
		}
		else
		{
		 while (n > 1)
		 {
			if (n % 2 == 0)
			{
				m = n / 2;
				System.out.printf("%d%c%d%c%d\n",n,'/',b,'=',m);
				n = m;
			}
			else
			{
				m = n * 3 + 1;
				System.out.printf("%d%c%d%c%d%c%d\n",n,'*',c,'+',a,'=',m);
				n = m;
			}
		 }
		System.out.printf("%s","End");
		}
		return 0;
	}


}

