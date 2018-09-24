package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		for (char * p = a; p != '\0';p++)
		{
			if (p == ' ' && *(p + 1) == ' ')
			{

			}
			else
			{
				System.out.print(p);
			}
		}
		return 0;
	}
}
