package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		String a = new String(new char[300]);
		char[] b = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		int[] c = new int[26];
		int t = 0;
		a = new Scanner(System.in).nextLine();
		for (p1 = a;p1 < a + a.length();p1++)
		{
			for (p2 = b,q = c;p2 < b + 26;p2++,q++)
			{
				if (*p1 == *p2)
				{
					*q = q + 1;
					t = 1;
					break;
				}
			}
		}
		for (p2 = b,q = c;p2 < b + 26;p2++,q++)
		{
			if (*q > 0)
			{
				System.out.printf("%c=%d\n",*p2,*q);
			}
		}
		if (t == 0)
		{
			System.out.print("No");
		}
	}
}
