package <missing>;

public class GlobalMembers
{
	public static String q = new String(new char[1200]);
	public static char lastQ;
	public static int head;
	public static int length;

	public static char MT(char q)
	{
	if ((q >= 'a') && (q <= 'z'))
	{
		return q - 'a'+'A';
	}
	}

	public static int Main()
	{
	q = ConsoleInput.readToWhiteSpace(true).charAt(0);
	head = 1;
	length = 1;
	lastQ = q.charAt(0);
	while (q.charAt(head) != '\0')
	{
	if (MT(q.charAt(head)) == MT(lastQ))
	{
		length++;
	}
	else
	{
	System.out.print('(');
	System.out.print(MT(lastQ));
	System.out.print(',');
	System.out.print(length);
	System.out.print(')');
	lastQ = q.charAt(head);
	length = 1;
	}
	head++;
	}
	System.out.print('(');
	System.out.print(MT(lastQ));
	System.out.print(',');
	System.out.print(length);
	System.out.print(')');
	System.out.print("\n");
	return 0;
	}
}

