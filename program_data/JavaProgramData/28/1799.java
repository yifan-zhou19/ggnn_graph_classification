package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[1000000]);
	public static int Main()
	{

		int num;
		int i;
		int len;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i < len;i++)
		{
			num = 0;
			if (a.charAt(i) == ' ')
			{
				continue;
			}
			while (a.charAt(i) != ' ' && (i != len - 1))
			{
				num++;
				i++;
			}
			if (i != len - 1)
			{
				System.out.printf("%d,",num);
			}
			else
			{
				System.out.printf("%d",num + 1);
			}
		}
		System.out.print("\n");
		return 0;
	}
}
