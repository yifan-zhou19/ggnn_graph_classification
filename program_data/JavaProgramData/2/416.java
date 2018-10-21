package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[999];
		int i;
		int[] k = new int[27];
		int j;
		int t;
		int m;
		char[][] b = new char[999][27];
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
			for (j = 0;b[i][j];j++)
			{
			k[b[i][j] - 65]++;
			}
		}
		t = k[0];
		m = 0;
		for (j = 0;j < 26;j++)
		{
			if (k[j] > t)
			{
				t = k[j];
				m = j;
			}
		}
		System.out.printf("%c\n%d\n",m + 65,t);
		for (i = 0;i < n;i++)
		{
			for (j = 0;b[i][j];j++)
			{
				if (b[i][j] == m + 65)
				{
					System.out.printf("%d\n",a[i]);
					break;
				}
			}
		}
		return 0;
	}

}

