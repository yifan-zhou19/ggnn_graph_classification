package <missing>;

public class GlobalMembers
{
	public static int s(int a)
	{
		int i;
		int b = 0;
		for (i = 2;i < a;i++)
		{
			if (a % i == 0)
			{
				break;
			}
			if (i == (a - 1))
			{
			b = 1;
			}
		}
		return b;
	}
	public static int Main()
	{
		  int c;
		  int i;
		  int n;
		  int m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  c = Integer.parseInt(tempVar);
		  }
		  if (c < 5)
		  {
		  System.out.print("empty");
		  }
		  else
		  {
		  for (m = 4;m <= c;m++)
		  {
		  if (s(m) == 1 && s(m - 2) == 1)
		  {
		  System.out.printf("%d %d\n",m - 2,m);
		  }
		  }
		  }


	}
}

