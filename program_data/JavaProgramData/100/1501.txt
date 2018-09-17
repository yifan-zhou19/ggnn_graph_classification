package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[301]);
		int[] c = new int[26];
		int[] C = new int[26];
		for (int n = 0;n < 26;n++)
		{
			c[n] = 0;
			C[n] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int length;
		length = a.length();
		for (int i = 0;i < length;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				c[a.charAt(i) - 'a']++;
			}
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				C[a.charAt(i) - 'A']++;
			}
		}
		char x;
		int m = 0;
		for (int j = 0;j < 26;j++)
		{
			if (C[j] != 0)
			{
				if (m == 0)
				{
					x = j + 'A';
					System.out.printf("%c=%d",x,C[j]);
				}
				else
				{
					x = j + 'A';
					System.out.printf("\n%c=%d",x,C[j]);
				}
				m++;
			}
		}
		for (int k = 0;k < 26;k++)
		{
			if (c[k] != 0)
			{
				x = k + 'a';
				System.out.printf("\n%c=%d",x,c[k]);
				m++;
			}
		}
		if (m == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

