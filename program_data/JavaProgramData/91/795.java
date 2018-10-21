package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String p;
		String q;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String q1;
		char t;
		int i;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(120 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		k = p.length();
		p1 = p;
		t = p;

		for (i = 0;i < k - 1;i++)
		{
			*p1 = p1 + *(p1 + 1);
			p1++;
		}
		*p1 = t + *p1;

		System.out.printf("%s",p);

	}

}
