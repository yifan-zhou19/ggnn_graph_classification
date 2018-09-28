package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	String a = new String(new char[10000]);
	String p;
	a = new Scanner(System.in).nextLine();
	p = a;
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
