package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int k;
		int i;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		if (n == 1 && a[0] != k)
		{

			System.out.printf("%d",a[0]);
			return 0;
		}
		for (i = 0;i < n;i++)
		{
			while (a[i] == k)
			{
				   int j = i;
				   for (j = i;j < n;j++)
				   {
					   if (a[j] != k)
					   {
						   a[i] = a[j];
						   a[j] = k;
						   break;
					   }
				   }
				   break;
			}

		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != k && a[i + 1] != k)
			{
				System.out.printf("%d ",a[i]);
			}
			else if (a[i] != k && a[i + 1] == k)
			{
				System.out.printf("%d",a[i]);
			}
			else if (a[i] == k)

			{
				break;
			}
		}
		return 0;
	}

}

