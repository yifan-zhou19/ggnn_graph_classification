package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int count = 0;
		int[] pt = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++,pt++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pt = Integer.parseInt(tempVar2);
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			if (count == 0)
			{
				System.out.printf("%d",a[i]);
				count++;
			}
			else
			{
				System.out.printf(" %d",a[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

