package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int i = 0;
		int len;
		String str = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		str = new Scanner(System.in).nextLine();
		p = str;
		len = str.length();
			for (; ; p++) //?????????????????????????????????????????????
			{
				if (*p != ' ')
				{
					System.out.print(p);
				}
				else
				{
					p++;
					if (*p != ' ')
					{
						System.out.print(' ');
					}
					p--;
				}
					i++;
					if (i >= len)
					{
						break;
					}
			}
		return 0;
	}
}
