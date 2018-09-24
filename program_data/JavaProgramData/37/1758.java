package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[26];
		int flag1;
		int flag2;
		int len;
		int t;
		int i;
		int j;
		int k;
		String s = new String(new char[100]);
		String c = new String(new char[26]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}

		while (t-- != 0)
		{
			for (i = 0;i < 26;i++)
			{
				a[i] = 0;
			}
			k = 0;
			flag2 = 0;

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			len = s.length();

			for (i = 0;i < len;i++)
			{
				if (i == 0)
				{
					c = tangible.StringFunctions.changeCharacter(c, k, s.charAt(i));
					k++;
				}
				else
				{
					flag1 = 0;
					for (j = 0;j < i;j++)
					{
						if (c.charAt(j) == s.charAt(i))
						{
							flag1 = 1;
							a[j] = 1;
						}
					}
					if (flag1 == 0)
					{
						c = tangible.StringFunctions.changeCharacter(c, k, s.charAt(i));
						k++;
					}
				}
			}

			for (i = 0;i < k;i++)
			{
				if (a[i] == 0)
				{
					System.out.printf("%c\n",c.charAt(i));
					flag2 = 1;
					break;
				}
			}

			if (flag2 == 0)
			{
				System.out.print("no\n");
			}
		}
	}
}

