package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc1 = new String(new char[100]);
		String zfc2 = new String(new char[100]);
		int[] sz1 = new int[100];
		int[] sz2 = new int[100];
		int m1;
		int m2;
		int i;
		int t;
		int a;
			a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			zfc2 = tempVar2.charAt(0);
		}
		m1 = zfc1.length();
		m2 = zfc2.length();
		for (i = 0;i < 52;i++)
		{
			sz1[i] = 0;
			sz2[i] = 0;
		}
		for (i = 0;i < m1;i++)
		{
				if ((zfc1.charAt(i) >= 'A') && (zfc1.charAt(i) <= 'Z'))
				{
					t = zfc1.charAt(i) - 65;
			sz1[t]++;
				}
				else
				{
					t = zfc1.charAt(i) - 71;
			sz1[t]++;
				}
		}
		for (i = 0;i < m2;i++)
		{
			if ((zfc2.charAt(i) >= 'A') && (zfc2.charAt(i) <= 'Z'))
			{
				t = zfc2.charAt(i) - 65;
			sz2[t]++;
			}
			else
			{
				t = zfc2.charAt(i) - 71;
			sz2[t]++;
			}
		}
		for (i = 0;i < 52;i++)
		{
			if (sz1[i] == sz2[i])
			{
				a = a + 1;
			}
		}
		if (a == 52)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

