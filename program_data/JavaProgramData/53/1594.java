package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int j;
		int[] b = new int[300];
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == 0)
			{
				if (s != 0)
				{
					System.out.print(",");
				}
				System.out.printf("%d",a[i]);
				s = 1;
			}
			for (j = i + 1;j < n;j++)
			{
				if (a[i] == a[j])
				{
					b[j] = -1;
				}
			}
		}
	}

}

