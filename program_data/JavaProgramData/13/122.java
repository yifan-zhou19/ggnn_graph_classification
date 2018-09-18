package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		int count1;
		int i;
		int j;
		int k;
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
		for (j = 0;j < n;j++)
		{
						count1 = 0;
				for (k = 0;k < j;k++)
				{
				   if (a[j] == a[k])
				   {
				   count1 = 1;
				   break;
				   }
				}
				if (count1 == 0)
				{
						   if (j == 0)
						   {
						   System.out.printf("%d",a[0]);
						   }
						   else
						   {
						   System.out.printf(" %d",a[j]);
						   }
				}

		}
		System.in.read();
		 System.in.read();
		  System.in.read();
		   System.in.read();
			System.in.read();
			 System.in.read();
			  System.in.read();
		return 0;
	}


}

