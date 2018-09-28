package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		int[] a = new int[26];
		int[] b = new int[26];
		int i;
		int l;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		if (str1.length() != str2.length())
		{
			System.out.print("NO\n");
		}
		else
		{
			for (i = 0;i < 26;i++)
			{
				a[i] = 0;
				b[i] = 0;
			}
			l = str1.length();
			for (i = 0;i < l;i++)
			{
				if ((str1.charAt(i) >= 'A') && (str1.charAt(i) <= 'Z'))
				{
					a[str1.charAt(i) - 'A'] = a[str1.charAt(i) - 'A'] + 1;
				}
				else
				{
					b[str1.charAt(i) - 'a'] = b[str1.charAt(i) - 'a'] + 1;
				}
				if ((str2.charAt(i) >= 'A') && (str2.charAt(i) <= 'Z'))
				{
					a[str2.charAt(i) - 'A'] = a[str2.charAt(i) - 'A'] - 1;
				}
				else
				{
					b[str2.charAt(i) - 'a'] = b[str2.charAt(i) - 'a'] - 1;
				}
			}
			f = 1;
			for (i = 0;i < 26;i++)
			{
				if ((a[i] != 0) || (b[i] != 0))
				{
					f = 0;
				}
			}
			if (f == 1)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}

}

