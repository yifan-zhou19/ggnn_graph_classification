package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[100]);
		String = new Scanner(System.in).nextLine();
		int i;
		int j;
		int num;
		int count = 0;
		num = String.length();
		for (i = 1;i < num;i++)
		{
						if (String[i] == ' ' && string.charAt(i - 1) == ' ')
						{
										for (j = i;j < num;j++)
										{
										String[j] = string.charAt(j + 1);
										}
										count++;
										String[num - count] = '\0';
										i = i - 1;
						}

		}
		System.out.println(String);
		return 0;
	}
}
