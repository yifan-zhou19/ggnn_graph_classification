package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k = 0;
		int n;
		int s;
		int f;
		int[] a = new int[1000];
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
			if (k == 0)
			{
				System.out.printf("%d",a[0]);
				k = 1;
			}
			for (s = 0;s < i;s++)
			{
				if (a[i] == a[s])
				{
					f = 0;
					break;
				}
				else
				{
					f = 1;
				}

			}
			if (f == 1)
			{
				System.out.printf(",%d",a[i]);
			}
		}
		System.out.print("\n");
	}
}

