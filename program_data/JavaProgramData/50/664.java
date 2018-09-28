package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[12];
		int w;
		int s;
		s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		a[0] = a[12] = 0;
		for (i = 1;i < 12;i++)
		{
			if (i == 2)
			{
				a[i] = 28;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				a[i] = 30;
			}
			else
			{
				a[i] = 31;
			}
		}
		for (i = 0;i < 12;i++)
		{
			s = s + a[i];
			if ((s + w) % 7 == 0)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
		return 0;
	}


}

