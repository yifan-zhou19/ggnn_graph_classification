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
		for (i = 1;i <= n;i++)
		{
			String s1 = new String(new char[101]);
			char[] s2 = {'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			final String s3 = "";
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s2 = tempVar3.charAt(0);
			}
			System.out.print("\n");
			int l1;
			int l2;
			int j;
			int u = 0;
			l1 = s1.length();
			l2 = s2.length();
			for (j = 1;j <= l2;j++)
			{
				int x;
				int y;
				int z;
				x = s1.charAt(l1 - j) - '0';
				y = s2[l2 - j] - '0';
				if (x + u >= y)
				{
					z = x - y + u;
					u = 0;
				}
				else
				{
					z = 10 + x - y + u;
					u = -1;
				}
				s3 = tangible.StringFunctions.changeCharacter(s3, l1 - j, z + '0');
			}
			if (l1 > l2)
			{
				int k;
				int l;
				k = s1.charAt(l1 - l2 - 1) - '0';
				s3 = tangible.StringFunctions.changeCharacter(s3, l1 - l2 - 1, k + u + '0');
				for (l = 0;l < l1 - l2 - 1;l++)
				{
					s3 = tangible.StringFunctions.changeCharacter(s3, l, s1.charAt(l));
				}
			}
			int l;
			for (l = 0;l < l1 - 1;l++)
			{
				if (s3.charAt(l) != '0')
				{
					System.out.printf("%s",s3.Substring(l));
					break;
				}
			}
			if (l == l1 - 1)
			{
				System.out.printf("%c",s3.charAt(l1 - 1));
			}
		}
		return 0;
	}





}

