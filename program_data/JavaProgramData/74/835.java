package <missing>;

public class GlobalMembers
{
	  public static void Main()
	  {
		 int[] aim = new int[100];
		 int m;
		 int n;
		 int a;
		 int b;
		 int c;
		 int k;
		 int i;
		 int p;
		 int t;
		 int num;

		 num = 0;
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
		for (k = m;k <= n;k++)
		{
		  p = 0;
		  t = k / 2;
		  for (i = 2;i <= t;i++)
		  {
			  if (k % i == 0)
			  {
				  p = 1;
				  break;
			  }

		  }
		  if (p == 0)
		  {
			  b = 0;
			  c = k;
		   while (c != 0)
		   {
			   a = c % 10;
			   b = b * 10 + a;
			   c = c / 10;
		   }
		   if (b == k)
		   {
			   num = num + 1;
			   aim[num] = k;
		   }
		   else
		   {
			   continue;
		   }
		  }
		  else
		  {
			  continue;
		  }
		}
	if (num != 0)
	{
	 for (i = 1;i < num;i++)
	 {
		 System.out.printf("%d,",aim[i]);
	 }
		 System.out.printf("%d",aim[num]);
	}
	else
	{
		System.out.print("no");
	}
	  }

}

