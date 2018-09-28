package <missing>;

public class GlobalMembers
{
	public static void fy(String a)
	{
	int i;
	int j;
	for (i = 0;;i++)
	{
	if (a[i].equals('\0'))
	{
	break;
	}
	}
	j = i;
	if ((a[i - 2].equals('l') && a[i - 1].equals('y')) || (a[i - 2].equals('e') && a[i - 1].equals('r')))
	{
	j = i - 2;
	}
	if (a[i - 3].equals('i') && a[i - 2].equals('n') && a[i - 1].equals('g'))
	{
	j = i - 3;
	}
	for (i = 0;i < j;i++)
	{
	System.out.printf("%c",a[i]);
	}
	System.out.print("\n");
	}
	public static void Main()
	{
	int n;
	int k;
	String a = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	System.in.read();
	for (k = 0;k < n;k++)
	{
	a = new Scanner(System.in).nextLine();
	fy(a);
	}
	}
}

