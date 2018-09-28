package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int m;
	  int i;
	  int j;
	  int x = 0;
	  int y;
	  int s;
	  int t;
	  int c;
	  int k = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  for (i = m;i <= n;i++)
	  {
			  c = i;
			  y = 1;
			  s = 0;
			  for (j = 2;j < c;j++)
			  {
					  if (c % j == 0)
					  {
								 y = 0;
								 break;
					  }
			  }
			  if (y == 1)
			  {
						while (c != 0)
						{
						   t = c % 10;
						   s = s * 10 + t;
						   c = c / 10;
						}
						if (i == s && k == 0)
						{
							   x = 1;
							   k = 1;
							   System.out.printf("%d",i);
							   continue;
						}
						if (i == s && k == 1)
						{
							   x = 1;
							   System.out.printf(",%d",i);
						}
			  }
	  }
	  if (x == 0)
	  {
		  System.out.print("no");
	  }
	}

}

