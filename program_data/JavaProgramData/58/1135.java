package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * character;
		String sz = new String(new char[81]);
		int i;
		int j;
		int n;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			e = 0;
			character = sz;
			character = new Scanner(System.in).nextLine();
			if (*character == '_' || (*character >= 65 && *character <= 90) || (*character >= 97 && *character <= 122))
			{
				for (; * character != '\0';++character)
				{
					if (*character == '_' || (*character >= 65 && *character <= 90) || (*character >= 97 && *character <= 122) || (*character >= 48 && *character <= 57))
					{
						continue;
					}
					else
					{
						System.out.printf("%d\n",0);
						e = 1;
						break;
					}
				}
				if (e == 0)
				{
					System.out.printf("%d\n",1);
				}
			}
			else
			{
				System.out.printf("%d\n",0);
			}
		}
		return 0;
	}
}

