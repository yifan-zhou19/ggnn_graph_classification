package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String sz = new String(new char[10000]);
	int i;
	int a;
	sz = new Scanner(System.in).nextLine();
	a = 0;
	for (i = 0;sz.charAt(i) != '\0';i++)
	{
	if (sz.charAt(i) != ' ')
	{
	a = a + 1;
	}
	else
	{
	if (a != 0)
	{
	System.out.printf("%d",a);
	System.out.print(",");
	a = 0;
	}
	}
	}
	System.out.printf("%d",a);
	return 0;
	}
}
