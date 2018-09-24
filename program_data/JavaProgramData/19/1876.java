package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			String s = new String(new char[120]);
			String a = new String(new char[120]);
			String b = new String(new char[120]);
			s = new Scanner(System.in).nextLine();
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			int len_s = s.length();
			int len_a = a.length();
			int i = 0;
			int j;
			while (i < len_s)
			{
					if (i == 0 || s.charAt(i - 1) == ' ')
					{
							for (j = 0; j < len_a && i + j < len_s; j++)
							{
									if (s.charAt(i + j) != a.charAt(j))
									{
											break;
									}
							}
							if (j == len_a)
							{
									System.out.print(b);
									i += len_a;
							}
							else
							{
									System.out.print(s.charAt(i));
									i++;
							}
					}
					else
					{
							System.out.print(s.charAt(i));
							i++;
					}
			}
			System.out.print("\n");

			return 0;
	}

}
