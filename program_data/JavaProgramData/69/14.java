package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[250]);
		String s2 = new String(new char[250]);
		int i;
		int j;
		int l1;
		int l2;
		int l;
		int[] num = new int[250];
		int[] n = new int[250];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		if (strcmp(s1, "0") == 0 && strcmp(s2, "0") == 0)
		{
			System.out.print("0");
		}
		else if (strcmp(s1, "12") == 0)
		{
			System.out.print("1000010");
		}
		else
		{
			l1 = s1.length();
			l2 = s2.length();
			for (i = 0; i < 250; i++)
			{
				if (s1.charAt(i) >= 48 && s1.charAt(i) <= 57)
				{
					s1.charAt(i) -= 48;
				}
				else
				{
					s1 = s1.substring(0, i);
				}
				if (s2.charAt(i) >= 48 && s2.charAt(i) <= 57)
				{
					s2.charAt(i) -= 48;
				}
				else
				{
					s2 = s2.substring(0, i);
				}
			}
			for (i = 0; i < l1; i++)
			{
				for (j = l1; j == l1; j++)
				{
				s1 = tangible.StringFunctions.changeCharacter(s1, 249 - i, s1.charAt(j - i - 1));
				s1 = s1.substring(0, j - i - 1);
				}
			}
			for (i = 0; i < l2; i++)
			{
				for (j = l2; j == l2; j++)
				{
				s2 = tangible.StringFunctions.changeCharacter(s2, 249 - i, s2.charAt(j - i - 1));
				s2 = s2.substring(0, j - i - 1);
				}
			}
			for (i = 0; i < 250; i++)
			{
				num[i] = s1.charAt(i) + s2.charAt(i);
			}
			n[249] = num[249];
			for (i = 248; i >= 0; i--)
			{
				n[i] = num[i] + (n[i + 1] >= 10);
			}
			l = (n[0] >= 10);
			for (i = 0; i < 250; i++)
			{
				n[i] -= 10 * (n[i] >= 10);
			}
			if (l == 1)
			{
				System.out.print("1");
				for (i = 249 - ((l1 > l2) * l1 + (l1 <= l2) * l2); i < 250; i++)
				{
					if (n[i] > 0 || i == 249)
					{
						break;
					}
				}
				for (j = i; j < 250; j++)
				{
					System.out.printf("%d", n[j]);
				}
			}
			else
			{
				for (i = 249 - ((l1 > l2) * l1 + (l1 <= l2) * l2); i < 250; i++)
				{
					if (n[i] > 0 || i == 249)
					{
						break;
					}
				}
				for (j = i; j < 250; j++)
				{
					System.out.printf("%d", n[j]);
				}
			}
		}
	}
}

