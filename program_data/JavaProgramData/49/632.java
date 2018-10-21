package <missing>;

public class GlobalMembers
{
	//???????
	//??? 1200017623
	//???????



	public static int Main()
	{
		int judge = new int(char*,int);
		String str = new String(new char[500]);
		final String temp = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int len;
		int num;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		for (num = 2;num <= len;num++)
		{
			for (p = str;p < str.Substring(len) + 1 - num;p++)
			{
				temp = p.substring(0, num);
			tangible.RefObject<String> tempRef_temp = new tangible.RefObject<String>(temp);
				if (judge(tempRef_temp, num) != 0)
				{
					temp = tempRef_temp.argValue;
					System.out.print(temp);
					System.out.print("\n");
				}
				else
				{
					temp = tempRef_temp.argValue;
				}
			}
		}
		return 0;
	}

	public static int judge(tangible.RefObject<String> ch, int n)
	{ //???????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		for (p = ch.argValue,q = ch.argValue.Substring(n) - 1;p <= q;p++,q--)
		{
			if (*p != *q)
			{
				return 0;
			}
		}
		return 1;
	}

}

