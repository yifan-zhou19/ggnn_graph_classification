package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int a;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (i = 6;i <= n;i = i + 2)
			{
				a = 0;
			   for (k = 2;k <= Math.sqrt(i - 3);k++)
			   {
				  if ((i - 3) % k == 0)
				  {
					  break;
				  }
			   }
				  if (k > Math.sqrt(i - 3))
				  {
					  System.out.printf("%d=3+%d\n",i,i - 3);
				  }
				  else
				  {
					  for (j = 5;j <= i - 5;j++)
					  {
					  for (k = 2;k <= Math.sqrt(j);k++)
					  {
						  if (j % k == 0)
						  {
							  break;
						  }
					  }
						  if (k > Math.sqrt(j))
						  {
						for (l = 2;l <= Math.sqrt(i - j);l++)
						{
						 if ((i - j) % l == 0)
						 {
							 break;
						 }
						}
						 if (l > Math.sqrt(i - j))
						 {
							 a++;
							System.out.printf("%d=%d+%d\n",i,j,i - j);
						 }

						  }
					if (a == 1)
					{
						break;
					}
					  }
				  }
			}
	}
}

