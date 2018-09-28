package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int[] b = new int[100000];
		int i;
		int n;
		int j;
		int k;
		int t = 0;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;;i++)
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
			if (a[i] == 0 && b[i] == 0)
			{
				break;
			}
			t = t + 1;
		}
		for (i = 0;i < t;i++)
		{
			k = 0,x = 0;
			for (j = 0;j < t;j++)
			{
				if (b[j] == b[i])
				{
				k = k + 1;
				}
				if (a[j] == b[i])
				{
				x = 1;
				}
			}
			if (k == n - 1 && x == 0)
			{
			System.out.printf("%d",b[i]);
			break;
			}
		}
		 if (i == t && k != n - 1)
		 {
			System.out.print("NOT FOUND");
		 }

	}
}

