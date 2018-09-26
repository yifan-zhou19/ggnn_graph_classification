package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[50]);
		String str2 = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		int t = 0;
		int j = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		p1 = str1;
		p2 = str2;
		for (; * p2 != '\0';)
		{

			for (; * p1 != '\0';j++)
			{
				if (*p1 == *p2 && *p1 != '\0')
				{
					t = 1;
					p1++;
					p2++;
					k = j - str1.length() + 1;
				}
				else
				{
					p1 = str1;
					if (t == 0)
					{
						p2++;
					}
					t = 0;
				}
			}
			if (t == 1)
			{
				System.out.printf("%d",k);
				break;
			}
		}
	}
}

