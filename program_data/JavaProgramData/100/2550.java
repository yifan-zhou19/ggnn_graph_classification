package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int len;
		int i;
		int flag = 0;
		int j;
		int count = 0;
		String a = new String(new char[305]);
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 1;i <= len;i++)
		{
			if ((a.charAt(i - 1) >= 'A' && a.charAt(i - 1) <= 'Z') || (a.charAt(i - 1) >= 'a' && a.charAt(i - 1) <= 'z'))
			{
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
			return;
		}
		for (j = 1;j <= 26;j++)
		{
			count = 0;
			for (i = 1;i <= len;i++)
			{
				if (a.charAt(i - 1) == 'A' + j - 1)
				{
					count++;
				}
			}
			if (count != 0)
			{
				System.out.printf("%c=%d\n",'A' + j - 1,count);
			}
		}
		for (j = 1;j <= 26;j++)
		{
			count = 0;
			for (i = 1;i <= len;i++)
			{
				if (a.charAt(i - 1) == 'a' + j - 1)
				{
					count++;
				}
			}
			if (count != 0)
			{
				System.out.printf("%c=%d\n",'a' + j - 1,count);
			}
		}
	}
}
