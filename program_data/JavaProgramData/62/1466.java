package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q = new String(new char[1000]);
		q = new Scanner(System.in).nextLine();
		n = q.length();
		p = q;
		for (i = 0;i < n;i++,p++)
		{
			if (*p != ' ')
			{
				System.out.printf("%c",*p);
			} //???????????
			if (*p == ' ') //????????????????????????
			{
				System.out.printf("%c",*p);
				while (*p == ' ')
				{
					i++;
					p++;
				}
				i = i - 1;
				p = p - 1;
			}
		}
	}
}
