package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int i;
		int j;
		int q = 0;
		int t;
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
		for (p = b,t = 0;p < b + b.length();p++,t++)
		{
			if (*p == *a)
			{
				for (j = 1;j < a.length();j++,p++)
				{
					if (*p = !*(a.Substring(j)))
					{
						q = 1;
						break;
					}
					if (q == 0)
					{
						System.out.printf("%d\n",t);
						break;
					}
				}
			}
		}
	}
}

