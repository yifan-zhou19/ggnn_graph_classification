package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[105]);
	a = new Scanner(System.in).nextLine();
	int i;
	int b;
	int c;
	if (a.charAt(1) == '\0')
	{
	b = a.charAt(0) - '0';
	c = 0;
	System.out.printf("%d\n",c);
	System.out.printf("%d",b);
	}
	else
	{
	if (a.charAt(2) == '\0')
	{
	b = ((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) % 13;
	c = ((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) / 13;
	System.out.printf("%d\n",c);
	System.out.printf("%d",b);
	}
	else
	{
	b = ((a.charAt(0) - '0') * 100 + (a.charAt(1) - '0') * 10 + (a.charAt(2) - '0')) % 13;
	c = ((a.charAt(0) - '0') * 100 + (a.charAt(1) - '0') * 10 + (a.charAt(2) - '0')) / 13;
	System.out.printf("%d",c);
	for (i = 3;a.charAt(i) != '\0';i++)
	{
	c = (b * 10 + (a.charAt(i) - '0')) / 13;
	b = (b * 10 + (a.charAt(i) - '0')) % 13;
	System.out.printf("%d",c);
	}
	System.out.print("\n");
	System.out.printf("%d",b);
	}
	}
	}

}
