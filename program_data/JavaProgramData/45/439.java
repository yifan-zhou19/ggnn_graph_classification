package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int k = 1;
		int re;
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		p = w;
		q = s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		for (; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i)) == *q)
			{
				re = i;
				while (*q != '\0')
				{
					if (*(p.Substring(i)) != *q)
					{
						k = 0;
						break;
					}
					q++;
					i++;
				}

				if (k != 0)
				{
					System.out.printf("%d",re);
					break;
				}
			}
		}
	}


}

