package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int emp;
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

		for (i = n - 1;i > 0;i--)
		{
			for (j = i - 1;j >= 0;j--)
			{
				if (a[i] < a[j])
				{
					emp = a[j];
					a[j] = a[i];
					a[i] = emp;
					emp = b[j];
					b[j] = b[i];
					b[i] = emp;
				}
			}
		}

		for (i = 0;i < n - 1;i++)
		{
			if (b[i] < a[i + 1])
			{
				System.out.print("no");
				return 0;
			}
			else
			{
				if (b[i] < b[i + 1])
				{
					emp = a[i + 1];
					a[i + 1] = a[i];
					a[i] = a[i + 1];
				}
				else
				{
					emp = a[i + 1];
					a[i + 1] = a[i];
					a[i] = a[i + 1];
					emp = b[i + 1];
					b[i + 1] = b[i];
					b[i] = b[i + 1];
				}
			}
		}
		System.out.printf("%d %d",a[n - 1],b[n - 1]);
		return 0;
	}
}

