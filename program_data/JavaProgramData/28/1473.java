package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[20000]);
		a = new Scanner(System.in).nextLine();
		int len = 0;
		int n = 0;
		int i = 0;
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i) != 32)
			{
				len++;
			}
			else
			{
				if (a.charAt(i - 1) != 32)
				{
					System.out.printf("%d,",len);
					len = 0;
				}
			}
			i++;
		}
		System.out.printf("%d",len);
		return 0;
	}
}
