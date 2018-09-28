package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int a;
		int b;
		int flag;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		a = s1.length();
		b = s2.length();
		if (a != b)
		{
			System.out.print("NO");
		}
		else
		{
	p1 = s1;
		p2 = s2;
		for (j = 0;j < a;++j)
		{
		for (i = 0;i < a;++i)
		{
			if (*(p1 + i) != 0 && *(p2.Substring(j)) != 0)
			{
				if (*(p1 + i) == *(p2.Substring(j)))
				{

				*(p2.Substring(j)) = 0;
				*(p1 + i) = 0;
				}
			}

		}
		}
		for (p1 = s1;p1 < a + s1;p1++)
		{
			if (*p1 != 0)
			{
				flag = 0;
				break;
			}
			else
			{
				flag = 1;
			}
		}
		if (flag != 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		}
	}


}

