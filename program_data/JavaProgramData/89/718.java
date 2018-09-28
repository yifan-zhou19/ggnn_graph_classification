package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int i;
		int j;
		int k;
		int p = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (true)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
			if (i == 0 && j == 0)
			{
				break;
			}
			else
			{
			a[i]++;
			b[j]++;
			}

		}
		for (k = 0;k < n;k++)
		{
			if (a[k] == 0 && b[k] == n - 1)
			{
				System.out.printf("%d",k);
				p++;
				break;
			}

		}
		if (p == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;

	}
}

