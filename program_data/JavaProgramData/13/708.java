package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[20001];
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
		   if (a[j] >= 10 && a[j] <= 100)
		   {
		   for (i = j + 1;i < n;i++)
		   {
			  if (a[i] >= 10 && a[i] <= 100)
			  {
				  if (a[j] == a[i])
				  {
				  a[i] = 0;
				  }
			  }
		   }
		   }
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			if (a[i] != 0)
			{
			System.out.printf(" %d",a[i]);
			}
		}

		System.in.read();
		System.in.read();
		System.in.read();





	}

}

