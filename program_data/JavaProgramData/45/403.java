package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pa;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pb;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (pb = b,pa = a;pb < b + b.length();)
		{
			if (*pb == *pa)
			{
				for (pa = a;pa < a.length() + a;pa++)
				{
					if (*pa == *pb)
					{
						pb++;
					}
					else
					{
						break;
					}
				}
				if (pa = a + a.length())
				{
					System.out.printf("%d",pb - b - a.length());
				}
				else
				{
					pa = a;
				}
			}
			else
			{
				pb++;
			}
		}
	}
}

