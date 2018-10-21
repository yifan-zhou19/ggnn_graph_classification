package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[] a = new int[6];
		for (n = 0;;n++)
		{
			k = 0;
			for (i = 0;i < 6;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				if (a[i] != 0)
				{
				k = 1;
				}
			}
			if (k == 0)
			{
			break;
			}
			m = a[0] * 3600 + a[1] * 60 + a[2];
			n = (a[3] + 12) * 3600 + a[4] * 60 + a[5];
			System.out.printf("%d\n",n - m);
		}
		  return 0;
	}

}

