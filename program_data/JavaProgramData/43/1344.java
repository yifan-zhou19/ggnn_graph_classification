package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int i;
	  int j;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  for (i = 3;i <= m / 2;i++)
	  {
	  for (j = 2;j < i;j++)
	  {
	  if (i % j == 0)
	  {
		  break;
	  }
	  }

	  if (j < i)
	  {
		  continue;
	  }
		for (k = 2;k < m - i;k++)
		{

			if ((m - i) % k == 0)
			{
				break;
			}
		}

	  if (k < (m - i))
	  {
		  continue;
	  }
	  System.out.printf("%d %d\n",i,m - i);
	  }
	  return 0;
	}
}

