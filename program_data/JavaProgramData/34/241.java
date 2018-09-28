package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		char a = '=';
		char b = '/';
		char c = '*';
		char d = '+';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			while (n != 1)
			{
				if (n % 2 == 0)
				{
					m = n / 2;
					System.out.printf("%d%c%d%c%d\n",n,b,2,a,m);
					n = n / 2;
				}
				else
				{
					m = n * 3 + 1;
					System.out.printf("%d%c%d%c%d%c%d\n",n,c,3,d,1,a,m);
					n = n * 3 + 1;
				}
			}
			System.out.print("End");

			return (0);
	}
}

