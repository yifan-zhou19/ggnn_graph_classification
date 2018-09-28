package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int flag;
		int i;
		int n;
		String a = new String(new char[501]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * l;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * r;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = a.length();
		for (i = 1;i < n;i++)
		{
			for (j = a; * (j + i);j++)
			{
				flag = 1;
				for (l = j,r = j + i;l < r;l++,r--)
				{
					if (*l != *r)
					{
					flag = 0;
					break;
					}
				}
				if (flag != 0)
				{
					for (l = j;l <= j + i;l++)
					{
						System.out.print(l);
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

