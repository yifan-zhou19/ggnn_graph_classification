package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p;
		int i;
		int l;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		l = p.length();
		for (i = 0;i < l - 1;i++)
		{

			if (Character.isDigit(*(p.Substring(i))))
			{
			System.out.printf("%c",*(p.Substring(i)));
			}
			if (Character.isDigit(*(p.Substring(i))) && Character.isDigit(*(p.Substring(i) + 1)) == 0)
			{
			System.out.print("\n");
			}
		}
		if (Character.isDigit(*(p.Substring(l) - 1)))
		{
		System.out.printf("%c",*(p.Substring(l) - 1));
		}
		return 0;
	}

}
