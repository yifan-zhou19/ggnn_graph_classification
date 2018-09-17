package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[12];
		int[] b = new int[12];
		int x;
		int i;
		int j;
		x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b[0] = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < 11;i++)
		{
			a[i + 1] = a[i] / 2;
			b[i + 1] = b[i] / 2;
		}
		for (i = 0;i < 12;i++)
		{
			for (j = 0;j < 12;j++)
			{
				if (a[i] == b[j])
				{
					System.out.printf("%d",a[i]);
					x = 1;
					break;
				}
				if (x == 1)
				{
					break;
				}
			}
		}
	}

}

