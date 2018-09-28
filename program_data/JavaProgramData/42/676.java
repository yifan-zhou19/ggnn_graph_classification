package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100000];
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0; i < n;)
		{
			if (a[i] != k)
			{
				break;
			}
			i++;
		}
		System.out.printf("%ld", a[i]);
		for (i = i + 1; i < n; i++)
		{
			if (a[i] == k)
			{
				continue;
			}
			System.out.printf(" %ld", a[i]);
		}
		System.out.print("\n");
	}
}

