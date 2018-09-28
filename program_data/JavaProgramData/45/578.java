package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		p = a;
		q = b;
		for (;p < a + a.length();p++)
		{
			for (i = 0;i < b.length();i++)
			{
				if (*(p + i) != *(q.Substring(i)))
				{
					break;
				}
			}
				if (i == b.length())
				{
					System.out.printf("%d",p - a);
					break;
				}
		}
	}
}

