package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	String p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p = (String)malloc(1000 * (Integer.SIZE / Byte.SIZE));
	p = new Scanner(System.in).nextLine();
	for (i = 0; * (p.Substring(i)) != '\0';i++)
	{
	if (*(p.Substring(i)) == ' ')
	{
	System.out.print(" ");
	for (i = i + 1; * (p.Substring(i)) == ' ';i++)
	{
		;
	}
	i = i - 1;
	}
	else
	{
		System.out.printf("%c",*(p.Substring(i)));
	}
	}
	}
}
