package <missing>;

public class GlobalMembers
{
	public static int veget(int m)
	{
		int a;
		int i;
		a = 1;
		for (i = 2;i <= (int)Math.sqrt(m);i++)
		{
			if (m % i == 0)
			{
				a = 0;
				break;
			}
		}
		return (a);
	}
	public static int Main()
	{
	  int i;
	  int j;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 6;i <= n;i = i + 2)
	  {
		  for (j = 3;j <= i / 2;j++)
		  {
			  if (veget(j) == 1 && veget(i - j) == 1)
			  {
				  break;
			  }
		  }
		  System.out.printf("%d=%d+%d\n",i,j,i - j);
	  }

	}
}

