package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		int i;
		int flag = 0;
		int count = 0;

		a = new Scanner(System.in).nextLine();
		i = 0;

		while (a.charAt(i) != '\0' || a.charAt(i - 1) != '\0')
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != '\0')
			{
				count++;
			}

			if (count != 0 && a.charAt(i) == ' ' || a.charAt(i) == '\0')
			{
				if (flag == 0)
				{
					System.out.printf("%d",count);
					flag = 1;
				}
				else
				{
					System.out.printf(",%d",count);
				}
				count = 0;
			}
			i++;


		}
	}
}
