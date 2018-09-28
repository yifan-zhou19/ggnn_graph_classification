package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int s = 0;
		int k = 1;
		int flag = 0;
		String str = new String(new char[10000]);
		str = new Scanner(System.in).nextLine();
		for (i = 0;i <= str.length() - 1;i++)
		{
			if (str.charAt(i) != ' ')
			{
				s++;
				flag = 0;
			}
			if (str.charAt(i) == ' ' && flag == 0)
			{
				System.out.printf("%d,",s);
				s = 0;
				flag = 1;
			}
		}
		System.out.printf("%d",s);
	}
}
