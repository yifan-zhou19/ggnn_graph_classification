package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int sum = 0;
		int n;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (p = a,q = b;p < a.Substring(n) - 1;p++,q++)
		{
			*q = p + *(p + 1);
			sum++;
		}
		*q = p + *a;
		sum++;
		for (q = b;q < b.Substring(sum);q++)
		{
			System.out.printf("%c",*q);
		}
	   return 0;
	}


}
