package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int c = 0;
		int e = 0;
		int n;
		int l;
		while (true)
		{
			for (i = 0;i < 16;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				e = e+1;
				if (a[i] == 0 || a[i] == -1)
				{
					break;
				}
			}
			if (a[i] == -1)
			{
				break;
			}
			for (l = 0;l < e-1;l++)
			{
				for (n = l + 1;n < e-1;n++)
				{
						if ((a[l] / a[n] == 2 && a[l] % a[n] == 0) || (a[n] / a[l] == 2 && a[n] % a[l] == 0))
						{
							c = c + 1;
						}
				}
			}
			System.out.printf("%d\n",c);
			int[] a = new int[16];
			e = c = 0;
		}
		return 0;
	}

}

