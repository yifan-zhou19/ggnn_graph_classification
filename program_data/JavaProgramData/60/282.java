package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[] a = new int[10000];
		  int i = 0;
		  int n;
		  int m;
		  int s;
		  int k;
		  int p = 2;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n <= 4)
		  {
		  System.out.print("empty");
		  }
		  else
		  {
		  for (m = 2;m <= n;m++)
		  {
			  for (p = 2;p < m;p++)
			  {
				   if (m % p == 0)
				   {
				   break;
				   }
			  }
			  if (p == m)
			  {
				  a[i] = m;
				   i++;
			  }
		  }

		 k = i - 1;
		 i = 0;
		  for (s = 0;s <= k;s++)
		  {
			  if (a[i + 1] - a[i] == 2)
			  {
				 System.out.printf("%d %d\n",a[i],a[i + 1]);
				 i++;
			  }
			   else
			   {
				  i++;
			   }
		  }
		  }
		  System.in.read();
		  System.in.read();
	}

}

