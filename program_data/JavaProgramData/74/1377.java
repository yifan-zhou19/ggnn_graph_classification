package <missing>;

public class GlobalMembers
{
	public static int sushu(int k)
	{
		int i;
		int t = 1;
	  for (i = 2;i < k / 2;i++)
	  {
		  if (k % i == 0)
		  {
			  t = 0;
		  }
	  }
	 return (t);
	}
	public static int hws(int m)
	{
		int t = m;
		int n = 0;
		while (m != 0)
		{
			n = n * 10 + m % 10;
			m = m / 10;
		}
		if (t == n)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
	  int m;
	  int n;
	  int i;
	  int k = 0;
	  int[] a = new int[100];
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
		  if ((sushu(i) == 1) && (hws(i) == 1))
		  {
			  a[k] = i;
			  k++;
		  }
	  }
	  if (k == 0)
	  {
		  System.out.print("no");
	  }
	  else
	  {
		  for (i = 0;i < k;i++)
		  {
			  System.out.printf("%d",a[i]);
			  if (i != (k - 1))
			  {
				  System.out.print(",");
			  }
		  }
	  }
	}

}

