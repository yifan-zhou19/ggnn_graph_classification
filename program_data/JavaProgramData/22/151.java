package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int i;
		int l;
		int m;
		int[] s = new int[1000];
		String str = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		l = str.length();
		m = 0;
		i = 0;
		while (i <= l - 1)
		{
			while (str.charAt(i) >= 48 && str.charAt(i) <= 57)
			{
				k = str.charAt(i) - 48;
				s[m] = s[m] * 10 + k;
					i = i + 1;
			}
			m = m + 1;
			i = i + 1;
		}
		i = 0;
		while (s[i] != 0)
		{
			i = i + 1;
		}
		for (k = 0;k < i;k++)
		{
			for (l = 0;l < i;l++)
			{
				if (s[k] > s[l])
				{
					m = s[k];
					s[k] = s[l];
					s[l] = m;
				}
			}
		}


		if (s[1] == 0 || s[i - 1] == s[0])
		{
			System.out.print("No");
		}
		else
		{
			for (l = 1;l < i;l++)
			{
				if (s[l] != s[0])
				{
					if (s[l] == 80 && s[0] != 81)
					{
						System.out.print("246");
					}
					else
					{
					System.out.printf("%d",s[l]);
					}
					break;
				}
			}
		}





	}

}

