package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int m;
		 int n;
		 int i;
		 int j;
		 int s;
		 int[] a = new int[301];
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
		 if (m == 0 && n == 0)
		 {
			 break;
		 }
			   s = n;
		  for (i = 1;i <= n;i++)
		  {
			 a[i] = 0;
		  }
			 i = 0;
			 j = 0;
	while (i < n)
	{
		i++;
		 if (a[i] == 1)
		 {
			 if (i == n)
			 {
				i = 0;
			 }
		   continue;
		 }
	   j++;
	  if (j == m)
	  {
			a[i] = 1;
			s--;
			j = 0;
	  }
		  if (i == n)
		  {
			  i = 0;
		  }
			 if (s == 1)
			 {
				 break;
			 }
	}
		  for (i = 1;i <= n;i++)
		  {
			   if (a[i] == 0)
			   {
				   System.out.printf("%d\n",i);
			   }
		  }
		}
		 return 0;
	 }
}

