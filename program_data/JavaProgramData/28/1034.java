package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String string = new String(new char[30000]);
		int i;
		int len;
		int count = 0;
		String = new Scanner(System.in).nextLine();
		len = String.length();
		for (i = 0;i < len;i++)
		{
			if (String[i] != ' ')
			{
				count++;
			}
			if (String[i] == ' ' && string.charAt(i + 1) != ' ')
			{
				System.out.printf("%d,",count);
				count = 0;
			}
		}
		System.out.printf("%d",count);
	}
}
