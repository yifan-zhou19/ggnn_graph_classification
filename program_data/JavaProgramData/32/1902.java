package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int k;
		int t;
		String[] c = {""};
		final String a = "";
		final String b = "";
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
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			k = a.length();
			t = b.length();
			for (;k > 0;k--,t--)
			{
				if (t <= 0)
				{
					c[i][k - 1] = a.charAt(k - 1);
				}
				else if (a.charAt(k - 1) >= b.charAt(t - 1))
				{
					c[i][k - 1] = a.charAt(k - 1) - b.charAt(t - 1) + 48;
				}
				else if (a.charAt(k - 1) < b.charAt(t - 1))
				{
					c[i][k - 1] = a.charAt(k - 1) - b.charAt(t - 1) + 58;
					a.charAt(k - 2)--;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;;j++)
			{
				if (c[i][j] != '0')
				{
					break;
				}
			}
			System.out.printf("%s\n",c[i] + j);
		}
	}
}

