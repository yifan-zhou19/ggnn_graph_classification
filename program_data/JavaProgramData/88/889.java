package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	String a = new String(new char[100]);
	String p;
	a = new Scanner(System.in).nextLine();
	p = a;
	for (i = 0; * (p.Substring(i)) != '\0';i++)
	{
	if ((*(p.Substring(i)) >= 48) && (*(p.Substring(i)) <= 58))
	{
		System.out.printf("%d",*(p.Substring(i)) - 48);
	}
	else
	{
		System.out.print("\n");
	}
	}
	}
}
