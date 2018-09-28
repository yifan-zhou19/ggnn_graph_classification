package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //b[]????
		int i = 0;
		int[] b = new int[100];
		int j = 1;
		int t;
		int m;
		int k = 0;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (l = 0;l < m;l++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
			int[] a = new int[(n + 2)];
			for (i = 0; i < n; i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}
			i = 0;
			t = 0;
			for (j = 1;j <= 100;j++)
			{
				b[j] = t + 1;
				t = b[j];
				if (b[j] == a[i]) //???
				{
					i++;
					for (k = 0;k < 3; k++) //b??????????????
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

