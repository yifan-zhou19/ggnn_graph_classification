package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p1;
		int i;
		int j;
		char c = ' ';
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
		p1 = new Scanner(System.in).nextLine();
		for (i = 0;i < (p1.length());i++)
		{
			if (Character.isDigit(*(p1.Substring(i))))
			{
				System.out.printf("%c",*(p1.Substring(i)));
			}
			else if ((Character.isDigit(*(p1.Substring(i))) == 0) && (Character.isDigit(*(p1.Substring(i) - 1)) != 0))
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}
