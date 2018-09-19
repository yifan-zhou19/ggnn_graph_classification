package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int[] a = new int[16];
		int s = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (a[0] != -1)
		{
			for (i = 1;i <= 15;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			if (a[i] == 0)
			{
				break;
			}
			for (j = 0;j <= i;j++)
			{
				if (a[j] == 2 * a[i] || a[j] == 0.5 * a[i])
				{
					s += 1;
				}
			}
			}
			System.out.printf("%d\n",s);
			s = 0;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[0] = Integer.parseInt(tempVar3);
			}
		}


	}

}

