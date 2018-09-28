package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int i;
		int c;
		int d;
		int e;
		int n;
		int k;
		e = 0;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (k = 0;k < n - 1;k++)
		{

			for (i = n - 1;i > k;i--)
			{
			   if (a[i] < a[i - 1])
			   {
				  c = a[i - 1];
				  a[i - 1] = a[i];
				  a[i] = c;
				  d = b[i - 1];
				  b[i - 1] = b[i];
				  b[i] = d;
			   }
			}
		}
		for (i = 0;i < n - 1;i++)
		{

			if (a[i + 1] <= b[i])
			{
				if (b[i + 1] <= b[i])
				{
					a[i + 1] = a[i];
					b[i + 1] = b[i];
				}
				else
				{
					a[i + 1] = a[i];
					b[i + 1] = b[i + 1];
				}

			}
			else
			{
				e++;
			}
		}
		if (e != 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",a[n - 1],b[n - 1]);
		}


		return 0;
	}


}

