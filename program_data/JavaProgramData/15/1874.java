package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int j;
	int i;
	int a1;
	int a2;
	int b1;
	int b2;
	int t;
	int x;
	int[][] s = new int[100][100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (j = 0;j < n;j++)
	{
			 for (i = 0;i < n;i++)
			 {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   s[j][i] = Integer.parseInt(tempVar2);
			   }
			 }
	}
	for (x = 0,j = 0;j < n;j++)
	{
			for (i = 0;i < n;i++)
			{
				  if (s[j][i] == 0)
				  {
					a1 = j;
					x++;
					break;
				  }
			}
			if (x != 0)
			{
				break;
			}
	}
	   for (x = 0,j = (n - 1);j >= 0;j--)
	   {
			for (i = 0;i < n;i++)
			{
				if (s[j][i] == 0)
				{
					a2 = j;
					x++;
					break;
				}
			}
			if (x != 0)
			{
				break;
			}
	   }
	   for (x = 0,i = 0;i < n;i++)
	   {
			for (j = 0;j < n;j++)
			{
				if (s[j][i] == 0)
				{
					b1 = i;
					x++;
					break;
				}
			}
			if (x != 0)
			{
				break;
			}
	   }
	  for (x = 0,i = (n - 1);i >= 0;i--)
	  {
			for (j = 0;j < n;j++)
			{
				if (s[j][i] == 0)
				{
					b2 = i;
					x++;
					break;
				}
			}
			if (x != 0)
			{
				break;
			}
	  }
	   t = (a2 - a1 - 1) * (b2 - b1 - 1);
	  System.out.printf("%d\n",t);
		return 0;
	}
}

