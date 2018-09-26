package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a = 0;
		int n;
		int sum = 0;
		String str = new String(new char[6000]);
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0;i <= n;i++)
		{
			if (str.charAt(i) != ' ' && str.charAt(i) != '\0')
			{
				sum++;
			}
			if (str.charAt(i) == ' ' || str.charAt(i) == '\0')
			{
				if (sum != 0)
				{
					if (a != 0)
					{
						System.out.printf(",%d",sum);
					}
					else if (a == 0)
					{
						System.out.printf("%d",sum);
					}
					a++;
					sum = 0;
				}
			}
		}
	}

}
