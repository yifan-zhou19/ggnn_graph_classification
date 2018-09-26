package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p;
		String q;
	 int a;
	 int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	q = p = malloc(100);
	q = new Scanner(System.in).nextLine();
	for (i = 0;i < 30;i++)
	{
	if (((*(p.Substring(i) - 1) > '9') || (*(p.Substring(i) - 1) < '0')) && ((*(p.Substring(i)) <= '9') && (*(p.Substring(i)) >= '0')))
	{
		a = Integer.parseInt(p.Substring(i));
		System.out.printf("%d\n",a);
	}
	}
	return 0;
	}
}
