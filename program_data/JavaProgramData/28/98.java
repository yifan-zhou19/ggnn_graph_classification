package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String ch = "";
		int flag = 0;
		int n = 0;
		int i;
		int j = 0;
		ch = new Scanner(System.in).nextLine();
		for (i = 0;ch.charAt(i) != '\0';i++)
		{
			if (ch.charAt(i) != ' ')
			{
				if (flag == 0)
				{
					flag = 1;
				}
				n++;
			}
			else
			{
				if (flag == 1)
				{
					if (j != 0)
					{
						System.out.print(",");
					}
					System.out.printf("%d",n);
					n = 0;
					j++;
					flag = 0;
				}
			}
		}
		if (n != 0)
		{
			if (j != 0)
			{
				System.out.print(",");
			}
			System.out.printf("%d",n);
		}
		System.out.print("\n");
	}
}
