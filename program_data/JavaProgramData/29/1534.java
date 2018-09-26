package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int x = 1;
		int y = 2;
		int z;
		int m;
		double r;
		double s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] sz = new int[m];
		for (int k = 0;k < m;k++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[k] = Integer.parseInt(tempVar2);
				}
		}
		for (int j = 0;j < m;j++)
		{
				for (int i = 1;i <= sz[j];i++)
				{
						r = 1.0 * y / x;
						z = x + y;
						x = y;
						y = z;
						s += r;
				}
				System.out.printf("%.3lf\n",s);
				s = 0;
				x = 1;
				y = 2;
		}
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while ((c = System.in.read()) != '\n' && c != EOF)
		{
			;
		}
		clearerr(stdin);
		System.in.read();
		return 0;
	}

}

