package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		int i = 0;
		int j = 0;
		int n1 = 0;
		int n2 = 0;
		int k = 0;
		while (b.charAt(i) != '\0')
		{
			i++;
			n1++;
		}
		i = 0;
		while (c.charAt(i) != '\0')
		{
			i++;
			n2++;
		}

		for (i = 0;a.charAt(i) != '\0';i++)
		{
			for (j = 0;j < n1;j++)
			{
				if (a.charAt(i + j) != b.charAt(j))
				{
					break;
				}
				if (j == n1 - 1)
				{
					for (j = 0;j < i;j++)
					{
						System.out.printf("%c",a.charAt(j));
					}
					System.out.printf("%s",c);
					for (j = i + n2;a.charAt(j) != '\0';j++)
					{
						System.out.printf("%c",a.charAt(j));
					}
					k++;

				}
			}
			if (k != 0)
			{
				break;
			}
		}

	if (k == 0)
	{
		System.out.printf("%s",a);
	}


	}

}
