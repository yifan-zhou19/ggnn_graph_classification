package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[20000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",a[0]);
		if (n >= 2)
		{
			if (a[1] != a[0])
			{
			System.out.printf(" %d",a[1]);
			}
			 for (i = 2;i < n;i++)
			 {
			   if (a[i] != a[0])
			   {
				   for (j = 0;j < i - 1;j++)
				   {
				   if (a[j] != a[i])
				   {
					continue;
				   }
				   else
				   {
					break;
				   }
				   }
				   if (a[j] != a[i])
				   {
				System.out.printf(" %d",a[i]);
				   }
			   }
			   else
			   {
				continue;
			   }
			 }
		}
	}

}

