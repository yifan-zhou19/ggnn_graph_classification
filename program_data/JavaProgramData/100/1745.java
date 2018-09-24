package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String b = new String(new char[301]);
		String a = new String(new char[26]);
		String A = new String(new char[26]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		int i;
		int j;
		int k;
		int L;
		int t;
		int sb = 0;
			for (j = 0;j < 26;j++)
			{
				A = A.substring(0, j);
				a = a.substring(0, j);
			}
			for (i = 0;;i++)
			{
				if (b.charAt(i) == '\0')
				{
					break;
				}
				else
				{
					if (b.charAt(i) <= 'Z' && b.charAt(i) >= 'A')
					{
						t = b.charAt(i) - 'A';
						A.charAt(t)++;
						sb++;
					}
					if (b.charAt(i) <= 'z' && b.charAt(i) >= 'a')
					{
						t = b.charAt(i) - 'a';
						a.charAt(t)++;
						sb++;
					}
				}
			}
			if (sb == 0)
			{
			System.out.print("No\n");
			}
			for (k = 0;k < 26;k++)
			{
				if (A.charAt(k) != 0)
				{
				System.out.printf("%c=%d\n",'A' + k,A.charAt(k));
				}
			}
			for (L = 0;L < 26;L++)
			{
				if (a.charAt(L) != 0)
				{
				System.out.printf("%c=%d\n",'a' + L,a.charAt(L));
				}
			}
		return 0;
	}
}

