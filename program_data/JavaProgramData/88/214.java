package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		String p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		for (k = 0,i = 0; * (p.Substring(i)) != '\0';i++)
		{
			if ((*(p.Substring(i)) >= '0') && (*(p.Substring(i)) <= '9'))
			{
				System.out.printf("%c",*(p.Substring(i)));
				k = 1;
			}
			if ((k = 1) != 0 && !((*(p.Substring(i)) >= '0') && (*(p.Substring(i)) <= '9')))
			{
				System.out.print("\n");
				k = 0;
			}
		}
	}
}
