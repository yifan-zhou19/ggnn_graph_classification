package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[9000]);
		int len;
		int num = 0;
		int i;
		int j;
		int k;
		int word = 0;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) == ' ')
			{
				if (num != 0)
				{
				System.out.printf("%d",num);
				word++;
				num = 0;
				break;
				}
			}
			else
			{
				num++;
			}
		}
		for (i = i + 1;i < len;i++)
		{
			if (a.charAt(i) == ' ')
			{
				if (num != 0)
				{
				System.out.printf(",%d",num);
				word++;
				num = 0;
				}
			}
			else
			{
				num++;
			}
		}
		if (num != 0)
		{
			if (word == 0)
			{
				System.out.printf("%d",num);
			}

				else
				{
			System.out.printf(",%d",num);
				}
		}

	}
}
