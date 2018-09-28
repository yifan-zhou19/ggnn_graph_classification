package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int m;
	  int j;
	  int x = 60;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++,x = 60)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (m == 0)
		{
			System.out.print("60\n");
			continue;
		}
		int[] p = new int[m];
		for (j = 0;j < m;j++)
		{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  p[j] = Integer.parseInt(tempVar3);
		  }
		}
		for (j = 0;j < m;j++)
		{
		  if (p[j] >= x)
		  {
			  System.out.printf("%d\n",x);
			  break;
		  }
		  if (p[j] < x && p[j] >= x - 3)
		  {
			  System.out.printf("%d\n",p[j]);
			  break;
		  }
		  if (p[j] < x - 3)
		  {
			  x -= 3;
		  }
		}
		if (j == m)
		{
			System.out.printf("%d\n",x);
		}
	  }
	  return 0;
	}

}

