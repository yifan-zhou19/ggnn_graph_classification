package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int b;
		int i;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		scanf("\n");
		for (i = 0;i < b;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (d = b - 1;d > 0;d--)
		{
		 for (e = 1;e <= d;e++)
		 {
		 if (a[d - e] == a[d])
		 {
			a[d] = 0;
			break;
		 }
		 else
		 {
			 continue;
		 }
		 }
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < b;i++)
		{
			if (a[i] != 0)
			{
		System.out.printf(",%d",a[i]);
			}
		}
		System.out.print("\n");
	}
}

