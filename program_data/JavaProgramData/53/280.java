package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			if (i < n - 1)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			else
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			  for (j = 0;j < i;j++)
			  {
				if (a[i] == a[j])
				{
					a[i] = 0;
					break;
				}
				else
				{
					continue;
				}
			  }
		}
		for (i = 0;i < n;i++)
		{
			 if (a[i] != 0)
			 {
				 for (j = i + 1;j < n;)
				 {
					 if (a[j] != 0)
					 {
						 System.out.printf("%d,",a[i]);
						 break;
					 }
					 else
					 {
						 j++;
					 }
					 if (j >= n)
					 {
						 System.out.printf("%d",a[i]);
					 }
				 }
			 }
		}
		if (a[n - 1] != 0)
		{
			System.out.printf("%d",a[n - 1]);
		}
	}
}

