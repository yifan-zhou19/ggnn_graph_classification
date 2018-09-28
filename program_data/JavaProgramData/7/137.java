package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int j;
	int n1;
	int k;
	int sum = 0;
	String a = new String(new char[257]);
	String b = new String(new char[257]);
	String c = new String(new char[257]);
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	c = new Scanner(System.in).nextLine();
	n = a.length();
	n1 = b.length();
	for (i = 0;i < n - n1 + 1;i++)
	{
	sum = 0;
	for (j = i,k = 0;j < i + n1;j++,k++)
	{
	if (a.charAt(j) != b.charAt(k))
	{
	sum = 1;
	}
	}
	if (sum == 0)
	{
	for (j = i,k = 0;j < i + n1;j++,k++)
	{
	a = tangible.StringFunctions.changeCharacter(a, j, c.charAt(k));
	}
	break;
	}
	}
	System.out.printf("%s",a);
	return 0;
	}


}

