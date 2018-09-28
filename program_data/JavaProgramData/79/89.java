package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[1000];
		int i;
		int j;
		int sum = 0;
		int num;
	  for (j = 0;j < 1000;j++)
	  {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead(" ");
		   if (tempVar2 != null)
		   {
			   m = Integer.parseInt(tempVar2);
		   }
		   num = n;
		   if (m == 0)
		   {
			 break;
		   }
		for (i = 0;i < 1000;i++)
		{
			 a[i] = 0;
		}
		if (m != 0)
		{
		   for (i = 0;i < n;i++)
		   {

			  if (a[i] == 0)
			  {
			  sum = sum + 1;
			  }
			  /*else
			  sum=sum+0;*/
			  if (sum == m)
			  {
				sum = 0;
				a[i] = 1;
				num = num - 1;
			  }
			  if (i == n - 1)
			  {
				i = -1;
			  }
			  if (num == 1)
			  {
				break;
			  }
		   }
		   for (i = 0;i < n;i++)
		   {
				if (a[i] == 0)
				{
			 System.out.printf("%d\n",i + 1);
				}
		   }
		}
		sum = 0; //sum??????

	  }
		 return 0;
	}
}

