package <missing>;

public class GlobalMembers
{
	public static int su(int n)
	{
		int j;
		for (j = 2;j < n;j++)
		{
		  if (n % j == 0)
		  {
		   break;
		  }
		}
		 if (j == n)
		 {
		  return (1);
		 }
		  else
		  {
		  return (0);
		  }
	}
	public static int Main()
	{
		int n;
		int m;
		int a;
		int[] b = new int[100];
		int i;
		int j;
		int k;
		int q = 0;
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
		  if ((su(i)) == 1)
		  {
			   a = i;
			  for (j = 0;;j++)
			  {
					 b[j] = a % 10;
				a = a / 10;
				  if (a == 0)
				  {
				   break;
				  }
			  }
			   for (k = 0;k < j;k++)
			   {
				 if (b[k] != b[j - k])
				 {
					 break;
				 }
			   }
				 if (k == j)
				 {
					 if (q != 0)
					 {
					 System.out.print(",");
					 }
					q++;
				  System.out.printf("%d",i);
				 }
		  }
		}
		   if (q == 0)
		   {
			 System.out.print("no");
		   }
		   System.in.read();
		   System.in.read();
	}

}

