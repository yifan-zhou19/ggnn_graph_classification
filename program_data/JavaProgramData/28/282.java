package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10000]);
		int[] m = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		int i;
		p = m;
		q = m;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != ' ')
			{
				(*p)++;
			}
			else
			{
				p++;
				q++;
			}

		}
		for (p = m;p < q;p++)
		{
			if (*p != 0)
			{
			System.out.printf("%d,",*p);
			}
		}
		System.out.printf("%d\n",*q);
	}
}
