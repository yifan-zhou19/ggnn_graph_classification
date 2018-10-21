package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] x = new int[16];
	int i;
	int j;
	int g;
	int n;
	int m;
	for (j = 0;;j++)
	{
	  for (i = 0,n = 0;i < 16;i++)
	  {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x[i] = Integer.parseInt(tempVar);
		}
		if (x[i] == 0)
		{
			break;
		}
	  }
	  if (x[0] == -1)
	  {
		  break;
	  }
	  g = i;
	  for (i = 0; i < g; i++)
	  {
		  for (m = 0;m < g;m++)
		  {
		  if ((float)x[i] == x[m] * 2)
		  {
			  n++;
		  }
		  }
	  }
	  System.out.printf("%d\n", n);
	}
	}
}

