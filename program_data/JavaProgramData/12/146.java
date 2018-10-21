package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[15];
		int i = 0;
		int j = 0;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (a[i] != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i + 1] = Integer.parseInt(tempVar2);
			}
			i = i + 1;
		}
		i = 0;
		while (a[0] != -1)
		{
			while (a[i] != 0)
			{
				while (a[j] != 0)
				{
					if (((float)a[j]) / ((float)a[i]) == 2)
					{
						m = m + 1;
					}
					j = j + 1;
				}
				j = 0;
				i = i + 1;
			}
			System.out.printf("%d\n",m);
			i = 0;
			m = 0;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[0] = Integer.parseInt(tempVar3);
			}
			while (a[i] != 0)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a[i + 1] = Integer.parseInt(tempVar4);
				}
				i = i + 1;
			}
		i = 0;
		}
	}

}

