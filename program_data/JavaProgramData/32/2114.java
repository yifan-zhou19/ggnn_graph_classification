package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] s = new int[200];
		int i;
		int j;
		int e;
		int l;
		int k;
		int[] d = new int[200];
		int h;
		String a = new String(new char[200]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (h = 0;h < 200;h++)
			{
				a = tangible.StringFunctions.changeCharacter(a, h, s[h] = d[h] = 0);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			l = a.length();
			for (j = 0;j < l;j++)
			{
				s[j] = a.charAt(l - j - 1) - '0';
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = tempVar3.charAt(0);
			}
			k = a.length();
			for (j = 0;j < k;j++)
			{
				d[j] = a.charAt(k - j - 1) - '0';
			}
			for (j = 0;j < l;j++)
			{
				s[j] = s[j] - d[j];
				if (s[j] < 0)
				{
					s[j] = s[j] + 10;
					s[j + 1] = s[j + 1] - 1;
				}
			}
			for (j = l - 1;j >= 0;j--)
			{
				if (s[j] != 0)
				{
					break;
				}
			}
			for (h = j;h >= 0;h--)
			{
				System.out.printf("%d",s[h]);
			}
			System.out.print("\n");
		}
		return 0;
	}



}

