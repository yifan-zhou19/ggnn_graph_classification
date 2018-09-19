package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int left = 0;
			int[] p = new int[105];
			int t = 0;
			int k;
			int len;
			String a = new String(new char[105]);
			String b = new String(new char[105]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			len = a.length();
			for (k = 0;k < len;k++)
			{
				b = tangible.StringFunctions.changeCharacter(b, k, ' ');
			}
			b = tangible.StringFunctions.changeCharacter(b, len, '\0');
			for (k = 0;k < len;k++)
			{
				if (a.charAt(k) == '(')
				{
					b = tangible.StringFunctions.changeCharacter(b, k, '$');
					p[t] = k;
					t++;
					left++;
				}
				if (a.charAt(k) == ')')
				{
					if (left != 0)
					{
						t--;
						b = tangible.StringFunctions.changeCharacter(b, p[t], ' ');
						left--;
					}
					else
					{
						b = tangible.StringFunctions.changeCharacter(b, k, '?');
					}
				}
			}
			System.out.printf("%s",a);
			System.out.print("\n");
			System.out.printf("%s",b);
			System.out.print("\n");
		}
		return 0;
	}





}

