package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int length_s;
		int length_a;
		int length_b;
		int i;
		int j;
		int k;
		String s = new String(new char[128]);
		String a = new String(new char[128]);
		String b = new String(new char[128]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		length_s = s.length();
		length_a = a.length();

		for (i = 0;i < length_s;i++)
		{
			j = 0;
			if (s.charAt(i) == a.charAt(j) && (i == 0 || s.charAt(i - 1) == ' '))
			{
				k = i;
				while (s.charAt(i) == a.charAt(j) && s.charAt(i) > 0)
				{
					j++;
					i++;
				}

				if (j == length_a)
				{
					System.out.printf("%s",b);
					i--;

				}

				else
				{
					while (k <= i)
					{
						System.out.printf("%c",s.charAt(k));
						k++;
					}
				}

			}
			else
			{
				System.out.printf("%c",s.charAt(i));
			}
		}

		return 0;
	}
}
