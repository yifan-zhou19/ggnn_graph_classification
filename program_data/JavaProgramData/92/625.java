package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		int m;
		int i;
		int j;
		int t = 0;
		int sum = 0;
		int fast1;
		int slow1;
		int fast2;
		int slow2;
		int[] a = new int[1000];
		int[] b = new int[1000];
		for (m = 0;;m++)
		{
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  if (n != 0)
	  {
			for (i = 0;i < n;i++)
			{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
			}
		  for (i = 0;i < n;i++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  b[i] = Integer.parseInt(tempVar3);
			  }
		  }
			for (i = 0;i < n - 1;i++)
			{
				for (j = 0;j < n - 1 - i;j++)
				{
				if (a[j] < a[j + 1])
				{
					s = a[j];
					a[j] = a[j + 1];
					a[j + 1] = s;
				}
				}
			}
			for (i = 0;i < n - 1;i++)
			{
				for (j = 0;j < n - 1 - i;j++)
				{
				if (b[j] < b[j + 1])
				{
					s = b[j];
					b[j] = b[j + 1];
					b[j + 1] = s;
				}
				}
			}

		 fast1 = 0;
		 slow1 = n - 1;
		 fast2 = 0;
		 slow2 = n - 1;

		for (i = 0;i < n;i++)
		{
			if (a[fast1] == b[fast2])
			{
			   if (a[slow1] > b[slow2])
			   {
				   t++;
				   slow1--;
				   slow2--;
			   }
			   else if (a[slow1] < b[slow2])
			   {
				   t--;
				   slow1--;
				   fast2++;
			   }
			   else if (a[slow1] == b[slow2])
			   {
				   if (a[slow1] < b[fast2])
				   {
					   t--;
					   slow1--;
					   fast2++;
				   }
				   else if (a[slow1] == b[fast2])
				   {
					   break;
				   }
			   }
			}
			else if (a[fast1] > b[fast2])
			{
				t++;
				fast1++;
				fast2++;
			}
			else
			{
				t--;
				slow1--;
				fast2++;
			}
		}
	   sum = t * 200;
	   System.out.printf("%d\n",sum);
	   t = 0;
	   sum = 0;
	  }
	  if (n == 0)
	  {
		  break;
	  }
		}

	}

}

