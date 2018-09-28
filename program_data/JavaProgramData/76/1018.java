package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int a = 0;
	  int b = 0;
	  int[] c = new int[50000];
	  int n;
	  int[] m = new int[50000];
	  int x = 0;
	  int y = 10000;
	  int z;
	  double q;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  c[i] = Integer.parseInt(tempVar2);
		  }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   m[i] = Integer.parseInt(tempVar3);
	   }
	  }
	  for (i = 0;i < n;i++)
	  {
		  if (c[i] <= y)
		  {
		 y = c[i];
		  }
		if (m[i] >= x)
		{
			x = m[i];
		}
	  }
	  for (i = y;i < x;i++)
	  {
		  for (j = 0;j < n;j++)
		  {
			if (i + 0.5 >= c[j] != 0 && i + 0.5 <= m[j])
			{
		  break;
			}
		  }
		  if (j == n)
		  {
			  break;
		  }
	  }
	  if (i == x)
	  {
		  System.out.printf("%d %d",y,x);
	  }
		else
		{
			System.out.print("no");
		}
	return 0;
	}
}

