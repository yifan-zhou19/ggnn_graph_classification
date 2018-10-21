package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[500]);
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i,j,flag=0;
		int i;
		int j;
		int flag = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 2;i <= s.length();i++)
		{
			for (p = s; * (p + i - 1) != '\0';p++)
			{
				flag = 0;
				for (j = 0;j < i / 2;j++)
				{
					if (*(p + j) != *(p + i - 1 - j))
					{
						flag = 1;
					}
				}
				if (flag == 0)
				{
					for (j = 0;j < i;j++)
					{
						System.out.print(*(p + j));
					}
					System.out.print("\n");
				}
			}
		}
	}
}

