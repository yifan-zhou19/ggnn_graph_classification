package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int m;
		int cal = new int(int monkey, int rest);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		m = cal(n, k);
		System.out.printf("%d\n", m);

		return 0;
	}

	public static int cal(int monkey, int rest)
	{
		int i;
		int j;
		int num;
		int nummin;
		int[] a = new int[10000];
		for (i = 0; i < 10000; i++)
		{
			a[i] = 0;
		}
		nummin = 1;
		while (nummin >= 1)
		{
			num = nummin;
			num = num * monkey + rest;
			for (i = 2; i <= monkey; i++)
			{
				num = num * monkey / (monkey - 1) + rest;
				a[i] = num;
				if (num % monkey != rest)
				{
					nummin++;
					for (j = 0; j <= monkey; j++)
					{
						a[j] = 0;
					}
					break;
				}
			}
			if (a[monkey] % monkey == rest)
			{
				break;
			}
		}
		return (num);
	}

}

