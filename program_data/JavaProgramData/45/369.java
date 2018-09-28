package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		String m;
		int lens;
		int lenw;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		lens = s.length();
		lenw = w.length();
		p1 = s;
		p2 = w;
		for (;p2 < w.Substring(lenw);p2++)
		{
			if (*p2 == *p1)
			{
				m = p2;
				flag = 0;
				for (;p1 < w.Substring(lens);p1++,p2++)
				{
					if (*p1 != *p2)
					{
						flag++;
						break;
					}
				}
				if (flag == 0)
				{
					System.out.printf("%d\n",m - w);
					break;
				}
				else
				{
					p2 = m;
					p1 = s;
				}
			}
		}
	}




}

