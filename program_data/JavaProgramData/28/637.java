package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int i = 0;
		int num = 0;
		String str = new String(new char[1000]);
		str = new Scanner(System.in).nextLine();
		l = str.length();
		if (str.charAt(0) != ' ')
		{
			while (str.charAt(i) != ' ' && i <= l - 1)
			{
				i++;
			}
			System.out.printf("%d",i);
			while (i <= l - 1)
			{
				if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ' && i <= l - 2)
				{
					i++;
					while (str.charAt(i) != ' ' && i <= l - 1)
					{
						num++;
						i++;
					}
					System.out.printf(",%d",num);
					num = 0;
					i--;
				}
				i++;
			}
			System.out.print("\n");
		}
		else
		{
			while (str.charAt(i) == ' ')
			{
				i++;
			}
			num = 0;
			while (str.charAt(i) != ' ' && i <= l - 1)
			{
				num++;
				i++;
			}
			System.out.printf("%d",num);
			i--;
			num = 0;
			while (i <= l - 1)
			{
				if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ' && i <= l - 2)
				{
					i++;
					while (str.charAt(i) != ' ' && i <= l - 1)
					{
						num++;
						i++;
					}
					System.out.printf(",%d",num);
					num = 0;
					i--;
				}
				i++;
			}
			System.out.print("\n");
		}
	}

}
