package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int m1;
	int m2;
	int a;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 6;i <= n;i += 2)
	{
	System.out.printf("%d=",i);
	for (j = 3;j < i;j += 2)
	{
			int x = 0;
			for (m1 = 3;m1 <= Math.sqrt(j);m1 += 2)
			{
			if (j % m1 == 0)
			{
				x = 1;
			}
			}
			if (x != 0)
			{
				continue;
			}
			else
			{
				  a = i - j;
				  int y = 0;
				  for (m2 = 3;m2 <= Math.sqrt(a);m2 += 2)
				  {
				  if (a % m2 == 0)
				  {
					  y = 1;
				  }
				  }
				  if (y != 0)
				  {
					  continue;
				  }
				  else
				  {
					  System.out.printf("%d+%d\n",j,a);
				  }
				  break;

			}

	}

	}
	}
}

