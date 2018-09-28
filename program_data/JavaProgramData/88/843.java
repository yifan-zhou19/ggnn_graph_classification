package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String p;
	int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
	p = new Scanner(System.in).nextLine();
	for (i = 0; * (p.Substring(i)) != '\0';i++)
	{
		if (*(p.Substring(i)) >= '0' && *(p.Substring(i)) <= '9')
		{
			System.out.printf("%c",*(p.Substring(i)));
		}
	else if (*(p.Substring(i) + 1) >= '0' && *(p.Substring(i) + 1) <= '9')
	{
		System.out.print("\n");
	}
	}
	return 0;
	}

}
