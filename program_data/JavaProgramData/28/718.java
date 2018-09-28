package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10000]);
		int i;
		int j;
		int n;
		int count;
		count = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != ' ')
			{
				count++;
			}
			if (a.charAt(i) != ' ' && a.charAt(i + 1) == ' ')
			{
				System.out.printf("%d,",count);
				count = 0;
			}
			if (a.charAt(i) != ' ' && a.charAt(i + 1) == '\0')
			{
				System.out.printf("%d",count);
			}
		}
	}

}
