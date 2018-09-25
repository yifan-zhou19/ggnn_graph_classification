package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a1;
		int b1;
		int i;
		int j;
		int k = 0;
		int[] a = new int[20];
		int[] b = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b1 = Integer.parseInt(tempVar2);
		}
		for (i = 0; a1 != 0 || b1 != 0; a1 /= 2,b1 /= 2)
		{
			a[i] = a1;
			b[i] = b1;
			i++;
		}
		for (i = 0; a[i] != 0; i++)
		{
			for (j = 0; b[j] != 0; j++)
			{
				if (b[j] == a[i])
				{
					k = 1;
					break;
				}
			}
			if (k == 1)
			{
				break;
			}
		}
		System.out.printf("%d",b[j]);

	}
}

