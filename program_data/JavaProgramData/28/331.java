package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String chuan = new String(new char[10000]);
		int i;
		int j = 0;
		String p = chuan;
		chuan = new Scanner(System.in).nextLine();
		for (i = 0;chuan.charAt(i) != '\0';i++)
		{
			if (chuan.charAt(i) != ' ')
			{
				j = j + 1;
			}
			if (chuan.charAt(i) == ' ' && chuan.charAt(i - 1) != ' ')
			{
				System.out.printf("%d,",j);
				j = 0;
			}
		}
		System.out.printf("%d",j);
	}
}
