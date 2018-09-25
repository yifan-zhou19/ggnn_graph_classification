package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		int j;
		int t;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (int l = 0;l < m;l++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
			for (i = 0; i < n; i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}
			a[i] = 60;
			i = 0;
			t = 0;
			for (j = 1;j <= 70;j++)
			{
				b[j] = t + 1;
				t = b[j];
				if (b[j] == a[i])
				{
					i++;
					for (int k = 0;k < 3; k++)
					{
						b[++j] = t;
					}
				}
			}
			System.out.printf("%d\n", b[60]);
		}
		return 0;
	}
}

