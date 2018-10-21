package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k = 0;
		int n;
		String str = new String(new char[2048]);
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) == ' ')
			{
				k++;
			}
		}
		if (k == 0)
		{
			System.out.printf("%d",n);
		}
		else
		{
			k = 0;
			for (i = 0;i < n;i++)
			{
				if (str.charAt(i) == ' ')
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
			System.out.printf("%d",k);
		}
	}
}
