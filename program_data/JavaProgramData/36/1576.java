package <missing>;

public class GlobalMembers
{
	public static int sta(String a, int i)
	{
		int j;
		int n = 0;
		for (j = 0;j < a.length();j++)
		{
			if (a[j].equals(i))
			{
				n++;
			}
		}
		return n;
	}
	public static int Main()
	{
		final String a = "";
		final String b = "";
		int[] ma = new int[52];
		int[] mb = new int[52];
		int i;
		int l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (i = 0;i < 26;i++)
		{
			ma[i] = sta(a, i + 65);
			ma[i + 26] = sta(a, i + 97);
			mb[i] = sta(b, i + 65);
			mb[i + 26] = sta(b, i + 97);
			if (ma[i] != mb[i] || ma[i + 26] != mb[i + 26])
			{
				System.out.print("NO\n");
				break;
			}
			else
			{
				l++;
			}
		}
		if (l == 26)
		{
			System.out.print("YES\n");
		}
		return 0;
	}
}

