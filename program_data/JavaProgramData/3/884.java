package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int f = 0;
		int s = 0;
		int[] a = new int[10000];
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
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (f == 0)
			{
			 for (j = 0;j < i;j++)
			 {
				if (a[i] + a[j] == k)
				{
					System.out.print("yes\n");
					f = 1;
					s = 1;
					break;
				}
			 }
			}
		}
		if (s == 0)
		{
			System.out.print("no\n");
		}
		return 0;
	}
}

