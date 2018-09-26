package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int rd;
		int check = 0;
		int output = 0;
		String str = new String(new char[100001]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pm;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (rd = 0;rd < t;rd++)
		{
			output = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			p = str;
			for (;p < (str + str.length());p++)
			{
				pm = str;
				for (;pm < (str + str.length());pm++)
				{
					if (*p == *pm)
					{
						check++;
					}
					if (check == 2)
					{
						check = 0;
						break;
					}
				}
				if (pm == str + str.length())
				{
					System.out.printf("%c\n",*p);
					check = 0;
					output++;
					break;
				}
			}
			if (output == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

