package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int k;
	 int end1;
	 int end2;
	 int sum;
	 int m;
		int[] a = new int[1000];
		int[] b = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			sum = 0;
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
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n - i - 1;j++)
				{
					if (a[j] > a[j + 1])
					{
						m = a[j + 1];
						a[j + 1] = a[j];
						a[j] = m;
					}

				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n - i - 1;j++)
				{
					if (b[j] > b[j + 1])
					{
						m = b[j + 1];
						b[j + 1] = b[j];
						b[j] = m;
					}
					else
					{
					;
					}
				}
			}
		 for (i = j = n - 1, end1 = end2 = 0;j >= end2 != 0 && i >= end1;j--)
		 {
			 if (a[i] > b[j])
			 {
				 sum++;
				 i--;
			 }
			 else if (a[i] < b[j])
			 {
				 sum--;
				 end1++;
			 }
			 else
			 {
				 if (a[end1] > b[end2])
				 {
					 sum++;
					 end1++;
					 end2++;
					 j++;
				 }
				 else if (a[end1] < b[end2])
				 {
					 sum--;
					 end1++;
				 }
				 else
				 {
					 if (a[end1] == b[j])
					 {
						 end1++;
					 }
					  else
					  {
						 sum--;
						 end1++;
					  }
				 }
			 }
		 }
		 System.out.printf("%d\n",200 * sum);
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 n = Integer.parseInt(tempVar4);
		 }
		}


	}
}

