package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[2048]);
		String p;
		int i = 0;
		int k = 0;
		str = new Scanner(System.in).nextLine();
		p = str;
		for (i = 0; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i)) == ' ')
			{
				k++;
			}
		}
		if (k == 0)
		{
			for (i = 0; * (p.Substring(i)) != '\0';i++)
			{
				k++;
			}
			System.out.printf("%d",k);
		}
		else
		{
			k = 0;
			for (i = 0; * (p.Substring(i)) != '\0';i++)
			{
			if (*(p.Substring(i)) == ' ')
			{
				if (k != 0)
				{
					System.out.printf("%d,",k);
					k = 0;
				}
			}
			else
			{
				k++;
			}

			}
		for (i = str.length() - 1;;i--)
		{
			if (*(p.Substring(i)) == ' ')
			{
				System.out.printf("%d",str.length() - i - 1);
				break;
			}
		}
		}


	}
}
