package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int p;
		String str = new String(new char[10001]);
		char a;
		char b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (m != 1)
		{
			if (m % 2 != 0)
			{
				n = m;
				m = n * 3 + 1;
				System.out.printf("%d*3+1=%d\n",n,m);
			}
			else
			{
				p = m;
				m = p / 2;
				System.out.printf("%d/2=%d\n",p,m);
			}
		}
		System.out.print("End");
	}

}

