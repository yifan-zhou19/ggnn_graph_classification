package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int len1;
		int len2;
		String ds1 = new String(new char[260]);
		String ds2 = new String(new char[260]);
		int[] a1 = new int[260];
		int[] a2 = new int[260];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ds1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			ds2 = tempVar2.charAt(0);
		}
		len1 = ds1.length();
		j = 0;
		for (i = len1 - 1;i >= 0;i--)
		{
			a1[j] = ds1.charAt(i) - '0';
			j++;
		}
		len2 = ds2.length();
		j = 0;
		for (i = len2 - 1;i >= 0;i--)
		{
			a2[j] = ds2.charAt(i) - '0';
			j++;
		}
		if (a1[0] == 0 && a2[0] == 0)
		{
			System.out.print("0");
			return 0;
		}
		for (i = 0;i < 250;i++)
		{
			a1[i] += a2[i];
			if (a1[i] >= 10)
			{
				a1[i] -= 10;
				a1[i + 1]++;
			}
		}
		int q0 = 0;
		for (i = 250;i >= 0;i--)
		{
			if (q0 != 0)
			{
				System.out.printf("%d",a1[i]);
			}
			else if (a1[i])
			{
				System.out.printf("%d",a1[i]);
				q0 = 1;
			}
		}
		return 0;
	}
}

