package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[26][999];
		int t;
		int i;
		int[] n = new int[26];
		int k;
		int j;
		int b = 0;
		String x = new String(new char[27]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 26;i++)
		{
			n[i] = 0;
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = tempVar3.charAt(0);
			}
			for (j = 0;x.charAt(j) != '\0';j++)
			{
				a[x.charAt(j) - 65][n[x.charAt(j) - 65]] = k;
				n[x.charAt(j) - 65]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (n[i] > b)
			{
				b = n[i];
				j = i;
			}
		}
		System.out.printf("%c\n",j + 65);
		System.out.printf("%d\n",n[j]);
		for (i = 0;i < n[j];i++)
		{
			System.out.printf("%d\n",a[j][i]);
		}
		return 0;
	}
}

