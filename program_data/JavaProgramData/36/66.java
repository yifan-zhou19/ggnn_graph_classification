package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p3;
		char temp;
		p1 = a;
		p2 = b;
		p3 = b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p2 = tempVar2.charAt(0);
		}
		if (a.length() != b.length())
		{
			System.out.print("NO");
		}
		else
		{
			for (; * p1 != '\0';p1++)
			{
			k = 0;
			for (; * p2 != '\0';p2++)
			{
				if (*p2 == *p1)
				{
					temp = p2;
					*p2 = p3;
					*p3 = temp;
					p3++;
					p2 = p3;
					k = 1;
					break;
				}
			}
			if (k == 0)
			{
				System.out.print("NO\n");
				break;
			}
			}
		}
		if (k == 1)
		{
			System.out.print("YES\n");
		}
	}
}

