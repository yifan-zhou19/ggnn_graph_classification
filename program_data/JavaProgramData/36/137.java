package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int[] m = new int[52];
		int[] n = new int[52];
		String a = new String(new char[100]);
		String b = new String(new char[100]);
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
		if (a.length() != b.length())
		{
			System.out.print("NO");
		}
		else if (a.length() == b.length())
		{
			for (i = 0;i <= a.length() - 1;i++)
			{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				m[a.charAt(i) - 'a' + 26]++;
			}
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				m[a.charAt(i) - 'A']++;
			}
			if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
			{
				n[b.charAt(i) - 'a' + 26]++;
			}
			if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
			{
				n[b.charAt(i) - 'A']++;
			}
			}

			for (j = 0;j < 52;j++)
			{
				if (m[j] != n[j])
				{
					System.out.print("NO");
					break;
				}
				if (j == 51)
				{
					System.out.print("YES");
				}
			}
		}
	}
}

