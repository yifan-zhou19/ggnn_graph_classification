package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		int i;
		int len = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != ' ')
			{
				len++;
			}
			else
			{
				if (len != 0)
				{
				System.out.printf("%d,",len);
				len = 0;
				}
			}
		}
		System.out.printf("%d",len);
		return 0;
	}
}
