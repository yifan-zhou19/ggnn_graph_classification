package <missing>;

public class GlobalMembers
{
	// &micro;&yen;&acute;&Ecirc;&micro;&Auml;&sup3;�&para;&Egrave;&micro;&Uacute;&para;&thorn;&micro;&macr;.cpp : Defines the entry point for the console application.
	//

	public static void Main(String[] args)
	{
		String ju = new String(new char[10000]);
		int i;
		int a;
		int num;
		int pan = 0;
		ju = new Scanner(System.in).nextLine();
		a = ju.length();
		i = 0;
		num = 0;
		while (i < a - 1)
		{
			if (ju.charAt(i) == ' ')
			{
				System.out.printf("%d",num);
				pan = 1;
				i++;
				num = 0;
				break;
			}
			else
			{
				num++;
				i++;
			}
		}
		while (i < a - 1)
		{
			if (ju.charAt(i - 1) != ' ' && ju.charAt(i) == ' ')
			{
				System.out.printf(",%d",num);
				i++;
				num = 0;
			}
			else if (ju.charAt(i) != ' ')
			{
				num++;
				i++;
			}
			else
			{
				i++;
			}
		}
		if (pan == 1)
		{
			System.out.printf(",%d\n",num + 1);
		}
		else
		{
			System.out.printf("%d\n",num + 1);
		}
	}


}
