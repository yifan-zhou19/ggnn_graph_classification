package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p;
			int s = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *a=(char*)malloc(sizeof(char)*81);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			char a = (String)malloc((Character.SIZE / Byte.SIZE) * 81);
			a = new Scanner(System.in).nextLine();
			len = a.length();
			p = a;
			if (!((*p >= 'a' && *p <= 'z') || (*p >= 'A' && *p <= 'Z') || (*p == '_')))
			{
				System.out.print("0\n");
			}
			else
			{
				for (p = a + 1;p < a + len;p++)
				{
					if ((*p >= 'a' && *p <= 'z') || (*p >= 'A' && *p <= 'Z') || (*p >= '0' && *p <= '9') || (*p == '_'))
					{
						s++;
					}
				}
				if (s == len - 1)
				{
					System.out.print("1\n");
				}
				else
				{
					System.out.print("0\n");
				}
			}

		}
		return 0;
	}
}

