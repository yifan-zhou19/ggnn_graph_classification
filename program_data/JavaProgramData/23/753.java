package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int i;
		int k;
		int j;
		str = new Scanner(System.in).nextLine();
		i = str.length() - 1;
		for (j = i,k = i;i >= 0;i--)
		{
			if (str.charAt(i) == ' ' || i == 0)
			{
				j = i;
				if (i == 0)
				{
					for (;i <= k;i++)
					{
						System.out.printf("%c",str.charAt(i));
					}
				}
				else
				{
					for (i = i + 1;i <= k;i++)
					{
						System.out.printf("%c",str.charAt(i));
					}
				}
				if (j > 0)
				{
					System.out.print(" ");
				}
				i = j;
				k = j - 1;
			}
		}
	}

}
