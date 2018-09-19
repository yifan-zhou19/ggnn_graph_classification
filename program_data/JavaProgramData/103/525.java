package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[500]);
	public static void Main()
	{
		char mark;
		int i;
		int sum = 0;
		int flag;
		a = new Scanner(System.in).nextLine();
	for (i = 0;a.charAt(i) != 0;i++)
	{
	if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
	{
		a.charAt(i) += 'A'-'a';
	}
	}
		mark = a.charAt(0);
		for (i = 0,flag = 0;a.charAt(i) != 0;i++)
		{
			if (a.charAt(i) != mark)
			{
				System.out.printf("(%c,%d)",mark,sum);
				sum = 1;
				mark = a.charAt(i);
			}
			else
			{
				sum++;
			}
		}
		System.out.printf("(%c,%d)",mark,sum);
	}
}
