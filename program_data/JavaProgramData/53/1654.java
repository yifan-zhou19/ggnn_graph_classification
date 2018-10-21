package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] c = new int[20000];
		int a;
		int i = 0;
		int n;
		int p = 0;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			for (j = 0,k = 0; j < i; j++)
			{
				if (c[j] == a)
				{
					k = 1;
					break;
				}

			}

			if (k == 0)
			{
				c[p] = a;
				p++;
			}
			i++;

		}
		for (j = 0; j < p; j++)
		{
			System.out.printf("%d",c[j]);
			if (j < p - 1)
			{
				System.out.print(",");
			}
		}
	}
}

