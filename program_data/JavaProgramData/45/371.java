package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int la;
		int lb;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pa;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pb;
		String x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		pa = a;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		pb = b;
		la = a.length();
		lb = b.length();
		for (;pb < b.Substring(lb);pb++)
		{
			if (*pb == *pa)
			{
				x = pb;
				for (pa = a;pa < a.Substring(la);pa++)
				{
					if (*pb == *pa)
					{
						pb = pb + 1;
					}

					else
					{
						break;
					}
				}


				if (pa == a.Substring(la) && *(pb - 1) == *(pa - 1))
				{
					System.out.printf("%d",x - b);
					break;
				}
				else
				{
					pb = x;
					pa = a;
				}
			}
		}





		return 0;
	}



}

