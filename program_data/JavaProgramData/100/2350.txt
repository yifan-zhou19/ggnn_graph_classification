package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		char[] b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int[] d = new int[26];
		int[] e = new int[26];
		int l;
		int i;
		int j;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		for (i = 0;i <= (l - 1);i++)
		{
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
			{
				for (j = 0;j <= 25;j++)
				{
					if (a.charAt(i) == b[j])
					{
						d[j]++;
						break;
					}
				}
			}
			if (a.charAt(i) >= 97 && a.charAt(i) <= 122)
			{
				for (j = 0;j <= 25;j++)
				{
					if (a.charAt(i) == c[j])
					{
						e[j]++;
						break;
					}
				}
			}
		}
		f = 0;
		for (i = 0;i <= 25;i++)
		{
			if (d[i] != 0)
			{
				System.out.printf("%c=%d\n",b[i],d[i]);
				f++;
			}
		}

		for (i = 0;i <= 25;i++)
		{
			if (e[i] != 0)
			{
				System.out.printf("%c=%d\n",c[i],e[i]);
				f++;
			}
		}
		if (f == 0)
		{
			System.out.print("No");
		}
	}
}

