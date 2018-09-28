package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[201]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		a = new Scanner(System.in).nextLine();
		p = a;
		int n = a.length();
		//cout << n << endl;
		int num = 0;
		for (p = a; p < a.Substring(n); p++)
		{
			if (*p == ' ')
			{
				num++;
			}
			if (*p != ' ' && *(p - 1) == ' ')
			{
				num = 0;
			}
			if (num == 0 || num == 1)
			{
				System.out.print(p);
			}
		}
		return 0;
	}
}
