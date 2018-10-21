package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		  int m;
		  int k = 0;
		  int a = 0;
		  int b = 0;
		  int c = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 3;i <= n;i++)
		  {
			for (j = 2;j <= (Math.sqrt(i));j++)
			{
			if (i % j == 0)
			{
			k = k + 1;
			}
			}
			if (k == 0)
			{
			m = a;
			a = i;
			b = m;
			if (a - b == 2)
			{
			System.out.printf("%d %d\n",b,a);
			c = c + 1;
			}
			}
			k = 0;
		  }
		  if (c == 0)
		  {
		  System.out.print("empty\n");
		  }
	}
}

