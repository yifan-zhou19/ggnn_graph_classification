package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int fff = new int(int a[],int k);
		int i;
		int n;
		int[] a = new int[25];
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		sum = fff(a, 1);
		for (i = 2;i < n + 1;i++)
		{
						  if (sum < fff(a, i))
						  {
							  sum = fff(a, i);
						  }
		}
		System.out.printf("%d",sum);
	}
	public static int fff(int[] a, int k)
	{
			 int t = 0;
			 int i;
		 if (k == 0)
		 {
			 t = 0;
		 }
		 if (k == 1)
		 {
			 t = 1;
		 }
		 if (k > 1)
		 {
		  t = 1;
		 for (i = 1;i < k;i++)
		 {
				if (a[k - 1] <= a[i - 1])
				{
									 if ((fff(a, i) + 1) > t)
									 {
										 t = fff(a, i) + 1;
									 }
				}
		 }
		 }
		 return t;
	}
}

