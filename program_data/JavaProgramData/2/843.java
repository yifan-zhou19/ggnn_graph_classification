package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[999];
		char[][] r = new char[999][26];
		int[] b = new int[125];
		int n;
		int i;
		int j;
		int maxi;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				r[i] = tempVar3.charAt(0);
			}
			s = String.valueOf(r[i]).length() - 1;
			for (j = 0;j <= s;j++)
			{
				b[r[i][j]] = b[r[i][j]] + 1;
			}
		}
		maxi = 65;
		for (i = 66;i <= 90;i++)
		{
			if (b[i] > b[maxi])
			{
				maxi = i;
			}
		}
		System.out.printf("%c\n",maxi);
		System.out.printf("%d\n",b[maxi]);
		for (i = 0;i <= n - 1;i++)
		{
			s = String.valueOf(r[i]).length() - 1;
			for (j = 0;j <= s;j++)
			{
				if (r[i][j] == maxi)
				{
					System.out.printf("%d\n",a[i]);
					break;
				}
			}
		}

		return 0;
	}

}

