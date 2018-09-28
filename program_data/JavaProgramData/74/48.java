package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int f;
		int j;
		int k;
		int a;
		int b;
		int sum;
		int g = 0;
		int h = 0;
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
		 f = 0;
		 sum = 0;
	  for (j = 2;j < i;j++)
	  {
		  if (i % j == 0)
		  {
			  f = 1;
			  break;
		  }
	  }
	  if (f == 0)
	  {
		  for (k = i;k > 0;k = k / 10)
		  {
		   b = k % 10;
		sum = sum * 10 + b;
		  }
		if (sum == i && g == 1)
		{
			System.out.printf(",%d",i);
		}
		if (sum == i && g == 0)
		{
			System.out.printf("%d",i);
			h = 1;
			g = 1;
		}
	  }
	 }
	   if (h == 0)
	   {
		   System.out.print("no");
	   }
	}
}

