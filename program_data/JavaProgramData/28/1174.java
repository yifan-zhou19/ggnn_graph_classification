package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100000]);
		char c;
		int i;
		int m;
		int n;
		int j;
		str = new Scanner(System.in).nextLine();
		m = str.length();
		n = 1;
		j = 0;
		for (i = 0;i <= m;)
		{
			c = str.charAt(i);
			if (c != ' ')
			{
				j = j + 1;
			i = i + 1;
			}
			else
			{
				if (j != 0)
				{
					System.out.printf("%d,",j);
				}
			j = 0;
			i = i + 1;
			}
		}
		j = j - 1;
	System.out.printf("%d",j);

	}


}
