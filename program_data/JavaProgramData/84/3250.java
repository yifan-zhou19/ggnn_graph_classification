package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int b;
		int[] a = new int[100];
		int t;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = n;
		for (i = 0;i < b;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < b - 1;j++)
		{
			for (i = 0;i < b - 1 - j;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
		System.out.printf("%d\n",a[b - 1]);
		System.out.printf("%d\n",a[b - 2]);
	}

}

