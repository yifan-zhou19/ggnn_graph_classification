package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		int v;
		int w;
		i = 6;
		do
		{
		  for (j = 3;j <= i / 2;j += 2)
		  {
		   if (Math.sqrt(j) < 3)
		   {
			   w = 1;
		   }
		   else
		   {
			 for (k = 3;k <= Math.sqrt(j);k += 2)
			 {
			   if (j % k == 0)
			   {
				   w = 0;
				   break;
			   }
			   else
			   {
				   w = 1;
			   }
			 }
		   }
		   if (Math.sqrt(i - j) < 3)
		   {
			   v = 1;
		   }
		   else
		   {
			  for (k = 3;k <= Math.sqrt(i - j);k += 2)
			  {
				if ((i - j) % k == 0)
				{
					v = 0;
					break;
				}
				else
				{
					v = 1;
				}
			  }
		   }
		   if (w == 1 && v == 1)
		   {
			   System.out.printf("%d=%d+%d\n",i,j,i - j);
		   i = i + 2;
		   break;
		   }
		  }
		}while (i <= n);
	return 0;
	}

}

