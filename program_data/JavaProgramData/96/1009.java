package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n = 1;
		for (i = 1;i <= n;i++)
		{
			int i;
			String n1 = new String(new char[110]);
			String n2 = new String(new char[110]);
			String n = new String(new char[110]);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n1 = tempVar.charAt(0);
			}
			n2 = "13";
			int l1 = n1.length();
			int l2 = n2.length();
			if (l1 < l2)
			{
				System.out.print("0\n");
				System.out.printf("%s",n1);
			}
			else
			{
				for (i = l2;i <= l1 - 1;i++)
				{
					n2 = tangible.StringFunctions.changeCharacter(n2, i, '0');
				}
				n2 = tangible.StringFunctions.changeCharacter(n2, i, '\0');
				for (i = 0;i <= l1 - l2;i++)
				{
					n = tangible.StringFunctions.changeCharacter(n, i, '0');
				}
				n = tangible.StringFunctions.changeCharacter(n, i, '\0');
				for (i = 0;i <= l1 - l2;i++)
				{
					int u;
					String temp = new String(new char[110]);
					temp = n1;
					for (u = 0;;)
					{
						int k;
						for (k = l1 - 1;k >= 1;k--)
						{
							if (temp.charAt(k) - n2.charAt(k) >= 0)
							{
								temp = tangible.StringFunctions.changeCharacter(temp, k, temp.charAt(k) - n2.charAt(k) + '0');
							}
							else
							{
								temp = tangible.StringFunctions.changeCharacter(temp, k, temp.charAt(k) - n2.charAt(k) + '0' + 10);
								temp.charAt(k - 1)--;
							}
						}
						temp = tangible.StringFunctions.changeCharacter(temp, 0, temp.charAt(0) - n2.charAt(k) + '0');
						if (temp.charAt(0) >= '0')
						{
							n1 = temp;
						}
						else
						{
							break;
						}
						u++;
					}
					n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) + u);
					for (u = l1 - 2;u >= 0;u--)
					{
						n2 = tangible.StringFunctions.changeCharacter(n2, u + 1, n2.charAt(u));
					}
					n2 = tangible.StringFunctions.changeCharacter(n2, 0, '0');
				}
				int l = 0;
				for (i = 0;i <= l1 - l2;i++)
				{
					if (n.charAt(i) != '0')
					{
						l = 1;
						break;
					}
				}
				for (;i <= l1 - l2;i++)
				{
					System.out.printf("%c",n.charAt(i));
				}
				if (l == 0)
				{
					System.out.print("0");
				}
				System.out.print("\n");
				l = 0;
				for (i = 0;i <= l1 - 1;i++)
				{
					if (n1.charAt(i) != '0')
					{
						l = 1;
						break;
					}
				}
				for (;i <= l1 - 1;i++)
				{
					System.out.printf("%c",n1.charAt(i));
				}
				if (l == 0)
				{
					System.out.print("0");
				}
			}
		}
	}

}

