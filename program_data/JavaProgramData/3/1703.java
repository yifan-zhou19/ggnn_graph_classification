package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[11000];
		int k;
		int i;
		int j;
		int n;
		int b;
		int l = 0;
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
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			//scanf("%d",a[i]);
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				b = a[i] + a[j];
				if (b == k)
				{
					l += 1;
				}
			}
		}
		if (l != 0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}

		return 0;
	}
}

