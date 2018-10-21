package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		char flag;
		int count = 0;
		for (int i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) >= 'a')
			{
				str.charAt(i) -= 'a'-'A';
			}
		}
		flag = str.charAt(0);
		for (int i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) != flag)
			{
				System.out.printf("(%c,%d)",flag,count);
				flag = str.charAt(i);
				count = 1;
			}
			else
			{
				count++;
			}
		}
			System.out.printf("(%c,%d)",flag,count);
		return 0;
	}
}

