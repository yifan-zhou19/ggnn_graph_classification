package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[512]);
		int n = 0;
		int i;
		int j;
		int k;
		int m;
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			n++;
		}
		j = n - 1;
		for (i = n - 1;i >= 0;i--)
		{
			if (str.charAt(i) != ' ' && str.charAt(i - 1) == ' ' || i == 0)
			{
				k = i;
				for (m = k;m <= j;m++)
				{
				System.out.printf("%c",str.charAt(m));
				}
				if (k != 0)
				{
					System.out.print(" ");
				}
				if (i != 0)
				{
					j = i - 2;
				}
			}
		}
	}

}
