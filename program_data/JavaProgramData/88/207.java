package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		int i;
		for (i = 0; * (p.Substring(i)) != '\0';i++)
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
		return 0;
	}

}
