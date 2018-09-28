package <missing>;

public class GlobalMembers
{
	public static void f(int t)
	{
	String c = new String(new char[100]);
	if (scanf("%s",c) != EOF)
	{
		f(0);

	System.out.print(c);
	if (t == 0)
	{
		System.out.print(' ');
	}
	}
	}
	public static int Main()
	{
	f(1);

	return 0;
	}

}
