package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String d1 = new String(new char[1000]);
		String d2 = new String(new char[1000]);
		int[] a1_cap = new int[26];
		int[] a1_sma = new int[26];
		int[] a2_cap = new int[26];
		int[] a2_sma = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			d1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			d2 = tempVar2.charAt(0);
		}
		int l1 = d1.length();
		int l2 = d2.length();
		int i;
		for (i = 0;i < l1;i++)
		{
			if (d1.charAt(i) >= 'a' && d1.charAt(i) <= 'z')
			{
				int p = d1.charAt(i) - 'a';
				a1_sma[p]++;
			}
			else if (d1.charAt(i) >= 'A' && d1.charAt(i) <= 'Z')
			{
				int p = d1.charAt(i) - 'A';
				a1_cap[p]++;
			}
		}
		for (i = 0;i < l2;i++)
		{
			if (d2.charAt(i) >= 'a' && d2.charAt(i) <= 'z')
			{
				int p = d2.charAt(i) - 'a';
				a2_sma[p]++;
			}
			else if (d2.charAt(i) >= 'A' && d2.charAt(i) < 'Z')
			{
				int p = d2.charAt(i) - 'A';
				a2_cap[p]++;
			}
		}
		int ans = 0;
		for (i = 0;i < 26;i++)
		{
			if (a1_sma[i] == a2_sma[i])
			{
				ans++;
			}
			if (a1_cap[i] == a2_cap[i])
			{
				ans++;
			}
		}
		if (ans == 52)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}
}

