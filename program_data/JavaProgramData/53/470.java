package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[301];
		int i;
		int h;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			for (h = 1;h < i;h++)
			{
				if (a[i] == a[h])
				{
					i--;
					n--;
					break;
				}
			}
		}
		System.out.printf("%d",a[1]);
		for (i = 2;i <= n;i++)
		{
			System.out.printf(",%d",a[i]);
		}
		System.out.print("\n");
	}
}

