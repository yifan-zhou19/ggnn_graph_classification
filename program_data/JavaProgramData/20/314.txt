package <missing>;

public class GlobalMembers
{
	public static int MAX(String str, int len)
	{
		int i;
		int max;
		int temp;
		max = 0;
		for (i = 1;i < len;i++)
		{
			if (str[max].compareTo(str[i]) < 0)
			{
				temp = max;
				max = i;
				i = temp;
			}
		}
		return (max);
	}
	public static void Main()
	{
		String str = new String(new char[10]);
		String substr = new String(new char[3]);
		int stop;
		int len;
		int i;
		for (;;)
		{
			stop = scanf("%s %s",str,substr);
			if (stop != 2)
			{
				break;
			}
			len = str.length();
			for (i = 0;i <= MAX(str, len);i++)
			{
			System.out.printf("%c",str.charAt(i));
			}
			System.out.printf("%s",substr);
			for (i = MAX(str, len) + 1;i < len;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
					System.out.print("\n");
		}
	}
}
