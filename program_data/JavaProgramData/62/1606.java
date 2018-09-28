package <missing>;

public class GlobalMembers
{
	//???????
	public static int Main()
	{
		final String a = "";
		String p;
		int i;
		a = new Scanner(System.in).nextLine(); //?????
		p = a; //???????????
		for (i = 0;i < 202;i++) //????????
		{
			if (*(p.Substring(i)) == '\0')
			{
				break;
			}
			if (*(p.Substring(i)) != ' ' || (*(p.Substring(i)) == ' ' && *(p.Substring(i) + 1) != ' '))
			{
				System.out.print((p.Substring(i)));
			}
		}
		System.out.print("\n");
		return 0;
	}
}
