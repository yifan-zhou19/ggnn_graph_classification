package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
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
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.print("\n");
		 for (j = n - 1;j >= 0;j--)
		 {
			System.out.printf("%d",a[j]);
			if (j != 0)
			{
				System.out.print(" ");
			}
		 }
		return 0;
	}
}

