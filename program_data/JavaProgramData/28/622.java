package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		String a = new String(new char[10000]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
		j = 0;
		for (i = 0;i <= n;i++)
		{
			if (a.charAt(i) != '\0')
			{
				if (a.charAt(i) != ' ')
				{
					j++;
				}
				else
				{
					if (a.charAt(i + 1) != ' ')
					{
						System.out.printf("%d,",j);
					j = 0;
					}
				}
			}
			else
			{
				System.out.printf("%d",j);
			}
		}
	}

}
