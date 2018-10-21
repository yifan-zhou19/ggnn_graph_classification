package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int n;
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		n = str.length();
		do
		{
			if (str.charAt(i) == ' ' && str.charAt(i - 1) == ' ')
			{
				i++;
			 continue;
			}
		 System.out.printf("%c",str.charAt(i));
		 i++;
		}while (i < n);
		return 0;
	}

}
