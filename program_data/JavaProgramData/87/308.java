package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int s;
		while (true)
		{
			int[] a = new int[6];
			for (i = 0;i < 6;i++)
			{
				if (i == 0)
				{
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						a[i] = Integer.parseInt(tempVar);
					}
				}
				else
				{
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
				}
			}
			if (a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 0 && a[5] == 0)
			{
			}
				s = (a[3] + 12 - a[0]) * 3600 + a[5] + a[4] * 60 - a[2] - a[1] * 60;
				System.out.printf("%d\n",s);
		}
	}

}

