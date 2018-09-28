package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int[] a = new int[1000];
		int i;
		int j;
		int b;
		int count = 0;
		b = n * (n - 1);
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i - 1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			 for (j = 1;j <= n;j++)
			 {
				  if (i != j)
				  {
					  if (a[i - 1] + a[j - 1] == k)
					  {
							  System.out.print("yes");
						   break;
					  }
					   else
					   {
						   count++;
					   }
				  }
			 }
			 if (a[i - 1] + a[j - 1] == k)
			 {
				 break;
			 }
		}
		if (count == b)
		{
			System.out.print("no");
		}
		return 0;
	}
}

