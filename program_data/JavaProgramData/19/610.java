package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int sum = 1;
		int j;
		int[] c = new int[102];
		int k = 0;
		int s;
		String a = new String(new char[102]);
		String b = new String(new char[102]);
		String d = new String(new char[102]);
		a.Substring(1) = new Scanner(System.in).nextLine();
		b.Substring(1) = new Scanner(System.in).nextLine();
		d.Substring(1) = new Scanner(System.in).nextLine();
		i = 1;
		j = 1;
		while (i <= a.Substring(1).length() && j <= b.Substring(1).length())
		{
			if (a.charAt(i) == b.charAt(j))
			{
				i++;
				j++;
			}
			else
			{
				i = i - j + 2;
				j = 1;
			}
			if (j > b.Substring(1).length())
			{
				if ((a.charAt(1) == b.charAt(1) && a.charAt(i) == ' ') || ((a.charAt(i) == ' ' || a.charAt(i) == '\0') && a.charAt(i - j) == ' '))
				{
				c[k] = i - b.Substring(1).length();
				k++;

				}
				j = 1;
			}

		}
		c[k] = -1;
		if (c[0] == -1)
		{
			for (i = 1;i <= a.Substring(1).length();i++)
			{
				System.out.print(a.charAt(i));
			}
		}
		else
		{
			i = 1;
			s = 0;
				while (i <= a.Substring(1).length())
				{

					if (i != c[s])
					{
						System.out.print(a.charAt(i));
						i++;
					}
					else
					{
						i = i + b.Substring(1).length();
						s++;
						for (j = 1;j <= d.Substring(1).length();j++)
						{
							System.out.print(d.charAt(j));
						}

					}

				}
		}
		System.out.print("\n");

		return 0;
	}

}
