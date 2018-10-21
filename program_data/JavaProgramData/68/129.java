package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	   int n;
	   int r;
	   int i;
	   int j;
	   int x;
	   int y;
	   int flag = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
		   for (i = 6;i <= n;i = i + 2)
		   {
			   flag = 0;
			   for (j = 2;j <= i / 2;j++)
			   {
				   int tag = 0;
				   for (r = 2;r <= Math.sqrt(j);r++)
				   {
					   if (j % r == 0)
					   {
						   tag = 1;
						   break;
					   }
				   }
				   if (tag == 1)
				   {
					   continue;
				   }
					for (r = 2;r <= Math.sqrt(i - j);r++)
					{
						if ((i - j) % r == 0)
						{
							 tag = 1;
							break;
						}
					}
					if (tag == 1)
					{
					   continue;
					}
					x = j;
					y = i - j;
					System.out.printf("%d=%d+%d\n",i,x,y);
					flag = 1;
					break;

			   }
			   if (flag == 1)
			   {
				   continue;
			   }
		   }
	}
}

