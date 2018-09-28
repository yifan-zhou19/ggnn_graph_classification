package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a;
		String b;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p;
	String q;
	int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	a = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	b = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
	a = new Scanner(System.in).nextLine();


	q = b;
	for (p = a; * p != '\0';p++)
	{
		n = n + 1;
	}

	for (q = b,p = a;p < a.Substring(n);p++)
	{
		if (p != (a.Substring(n) - 1))
		{
		q = *p + *(p + 1);
	q = q.Substring(1);
		}

	if (p == (a.Substring(n) - 1))
	{
		q = *p + a;
	}
	}


	for (q = b;q < b.Substring(n);q++)
	{
	System.out.printf("%c", q);
	}
	}

}
