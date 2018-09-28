package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int j;
	 int k;
	 int flag1;
	 int flag2;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 6;i <= n;i++)
	 {
	  if (i % 2 == 0)
	  {
		for (j = 3;j <= (int)(i / 2);j++)
		{
		 flag1 = 0;
		 for (k = 2;k <= Math.sqrt(j);k++)
		 {
		  if (j % k == 0)
		  {
		  flag1 = 1;
		  break;
		  }
		 }
		 if (flag1 == 0)
		 {
			flag2 = 0;
			for (k = 2;k <= Math.sqrt(i - j);k++)
			{
			 if ((i - j) % k == 0)
			 {
			 flag2 = 1;
			 break;
			 }
			}
		 }
		  if (flag1 == 0 && flag2 == 0)
		  {
			  System.out.printf("%d=%d+%d\n",i,j,i - j);
			  break;
		  }
		}
	  }
	 }
	}


}

