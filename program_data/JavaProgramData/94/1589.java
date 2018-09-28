package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] first = new int[500];
		int n;
		int i;
		int a;
		int b;
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
				(first[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0; i < n; i++)
		{
			if (first[i] % 2 == 0)
			{
				first[i] = 0;
			}
		}
		b = n;
		while (n > 1)
		{
			for (i = 0; i < n - 1; i++)
			{
				if (first[i] > first[i + 1])
				{
					a = first[i];
					first[i] = first[i + 1];
					first[i + 1] = a;
				}
			}
			n--;
		}
		for (i = 0; i < b; i++)
		{
			if (first[i] != 0)
			{
				System.out.printf("%d", first[i]);
				i++;
				break;
			}
		}
		while (i < b)
		{
			if (first[i] != 0)
			{
				System.out.printf(",%d", first[i]);
			}
			i++;
		}
		return 0;
	}
}

