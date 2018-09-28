package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  while (true)
	  {
		int n;
		int m;
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
		if (n == 0 && m == 0)
		{
		  break;
		}
		else
		{
		  //int m1;
		  int i;
		  int j = 0;
		  int sum = 0;
		  int[] a = new int[n];
		  for (i = 0;i < n;i++)
		  {
			a[i] = 1;
		  }
		  for (i = 0;1;i++)
		  {
			while (i > n - 1)
			{
			  i = i % n;
			}
			sum = sum + a[i];
		   // m1=m;
			//while(m1>(n-j))
		   // {
		   //   m1%=(n-j);
		   // }
			if (m == sum)
			{
			  a[i] = 0;
			  j++;
			  sum = 0;
			}
			if (j == n - 1)
			{
			  break;
			}
		  }
		  for (i = 0;i < n;i++)
		  {
			if (a[i] > 0)
			{
			  System.out.printf("%d\n",i + 1);
			  break;
			}
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(a);
		}
	  }
		return 0;
	}
}

