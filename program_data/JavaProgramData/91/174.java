package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p;
		char c;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		c = p;
		for (i = 0;i < (p.length() - 1);i++)
		{
			*(p.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
		}
		*(p + p.length() - 1) = *(p + p.length() - 1) + c;
		for (i = 0;i < p.length();i++)
		{
			System.out.printf("%c",*(p.Substring(i)));
		}
		return 0;
	}
}
