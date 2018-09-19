package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int[] b = new int[999];
		int[] n = new int[26];
		int[] t = new int[2];
		int x = 0;
	char[][] a = new char[999][26];
	char au;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 0;i < m;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = tempVar3.charAt(0);
		}
	}
	for (i = 0;i < m;i++)
	{
		for (j = 0;j < (int)String.valueOf(a[i]).length();j++)
		{
			n[(int)a[i][j] - 65]++;
		}
	}
	for (i = 0;i < 26;i++)
	{
		if (t[0] < n[i])
		{
			t[0] = n[i],t[1] = i;
		}
	}
	au = t[1] + 65;
	System.out.printf("%c\n%d\n",au,t[0]);
	for (i = 0;i < m;i++)
	{
		x = 0,j = 0;
		while (j < (int)String.valueOf(a[i]).length() && x == 0)
		{
			if (a[i][j] == t[1] + 65)
			{
				System.out.printf("%d\n",b[i]),x++;
			}
			else
			{
				j++;
			}
		}
	}
	return 0;
	}
}

