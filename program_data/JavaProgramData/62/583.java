package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		int i;
		int k = 0;
		p = new Scanner(System.in).nextLine();
		for (i = 0; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i)) != ' ')
			{
				System.out.printf("%c",*(p.Substring(i)));
				k = 1;
			}
			if ((k == 1) && (*(p.Substring(i)) == ' '))
			{
				System.out.print(" ");
				k = 0;
			}
		}
	}
}
