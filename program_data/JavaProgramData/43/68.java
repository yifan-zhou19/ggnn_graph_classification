package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a = int x; //?????????
		  int m;
		  int i;
		  int k;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  for (i = 2;i < m / 2 + 1;i++)
		  {
							  if (a(i) == 1 && a(m - i) == 1)
							  {
							  System.out.printf("%d %d\n",i,m - i);
							  }
		  }
		  System.in.read();
		  System.in.read();
	}
	public static int a(int b)
	{
		int i;
		int c = 1;
		for (i = 2;i < b;i++)
		{
						if (b % i == 0)
						{
							  c = 0;
							  break;
						}
		}
		return (c);
	}
}

