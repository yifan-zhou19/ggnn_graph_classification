package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int check = new int(int x,int y);
		char[][] a = new char[5][10];
		String[] p = new String[5];
		String t;
		int n;
		int m;
		int i;

		for (i = 0;i < 5;i++)
		{
		a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < 5;i++)
		{
		p[i] = a[i];
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (check(n, m) != 0)
		{
		  t = p[n];
		  p[n] = p[m];
		  p[m] = t;

		for (i = 0;i < 5;i++)
		{
			System.out.printf("%s\n",p[i]);
		}
		}
		else
		{
			System.out.print("error\n");
		}
		return 0;
	}

	public static int check(int x,int y)
	{
		if (x > -1 && x < 5 && y>-1 && y < 5)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}


}

