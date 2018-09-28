package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int f;
		int q;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '_', '\0', '\0', '\0'};
		char[][] c = new char[1000][1000];
		c[1] = new Scanner(System.in).nextLine();
		for (i = 1;i <= n;i++)
		{
						  c[i] = new Scanner(System.in).nextLine();
						  d = 0;
						  for (q = 0;;q++)
						  {
									   if (c[i][q] == ' ' || c[i][q] == '.' || c[i][q] == '@' || c[i][q] == ';' || c[i][q] == '-' || c[i][q] == '=' || c[i][q] == '+')
									   {
									   d = 5;
									   }
									   if (c[i][q] == '\0')
									   {
									   break;
									   }
						  }
						  if (d == 5)
						  {
								  System.out.print("0\n");
								  continue;
						  }
						  for (f = 0;f <= 26;f++)
						  {
											if (c[i][0] == a[f] || c[i][0] == (a[f] - 32))
											{
											System.out.print("1\n");
											d++;
											}
						  }
						  if (d == 0)
						  {
						  System.out.print("0\n");
						  }
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}

}

