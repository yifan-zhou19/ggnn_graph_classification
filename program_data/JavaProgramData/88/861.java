package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[1000]);
	int i;
	a = new Scanner(System.in).nextLine();
	for (i = 0;a.charAt(i) != '\0';i++)
	{
	if (a.charAt(i) >= 48 && a.charAt(i) <= 57)
	{
	System.out.printf("%c",a.charAt(i));
	}
	else
	{
		System.out.print("\n");
	}
	}
	}
}
