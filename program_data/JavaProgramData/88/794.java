package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q = new String(new char[31]);
	int a;
	int n;
	int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
	p = q;
	p = new Scanner(System.in).nextLine();
	n = p.length();
	a = p;
	for (i = 0;i < n;i++,p++)
	{
	if (*p >= '0' && *p <= '9')
	{
	System.out.printf("%c",*p);
	}
	else
	{
	for (; * p < '0' || *p>'9';i++)
	{
		p++;
	}
	p = p - 1;
	i = i - 1;
	if (a < '0' || a>'9')
	{
		a = '0';
	}
	else
	{
		System.out.print("\n");
	}
	}
	}
	}
}
