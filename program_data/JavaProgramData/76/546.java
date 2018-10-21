package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int i;
		int j;
		int p;
		int[] a = new int[100];
		int[] b = new int[100];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
				x = a[j];
				a[j] = a[j + 1];
				a[j + 1] = x;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
		   for (j = 0;j < n - i - 1;j++)
		   {
			   if (b[j] > b[j + 1])
			   {
			   x = b[j];
			   b[j] = b[j + 1];
			   b[j + 1] = x;
			   }
		   }
		}
		p = 1;
		for (i = 0;i < n - 1;i++)
		{
			if (b[i] < a[i + 1])
			{
				p = 0;
			}
		}
		if (p == 1)
		{
			System.out.printf("%d %d",a[0],b[n - 1]);
		}
		else
		{
			System.out.print("no");
		}
		return 0;




	}

}

