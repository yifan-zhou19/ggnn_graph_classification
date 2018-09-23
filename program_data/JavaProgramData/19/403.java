package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[200]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String ptemp;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pstr;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pa;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pb;
		int flag;
		int lstr;
		int la;
		int lb;
		pstr = str;
		pa = a;
		pb = b;
		pstr = new Scanner(System.in).nextLine();
		pa = new Scanner(System.in).nextLine();
		pb = new Scanner(System.in).nextLine();
		lstr = pstr.length();
		la = pa.length();
		lb = pb.length();
		for (;pstr <= str.Substring(lstr) - 1;pstr++)
		{
			flag = 1;
			while ((*pstr != ' ') && (*pstr != '\0'))
			{
				if (*pstr != *pa)
				{
					flag = 0;
				}
				pstr++;
				pa++;
			}
			if ((flag) != 0 && (pa == a.Substring(la)))
			{
				ptemp = pstr;
				if (la < lb) //add room
				{
					for (pstr = str.Substring(lstr);pstr >= ptemp;pstr--)
					{
						*(pstr + lb - la) = *pstr;
					}
					for (pstr = ptemp - la;pb <= b.Substring(lb) - 1;pb++,pstr++)
					{
						*pstr = pb;
					}
					pb = b;
					lstr = lstr + lb - la;
				}
				if (la >= lb) //cut room
				{
					for (pstr = ptemp - la + lb;pstr <= str.Substring(lstr) - la + lb;pstr++)
					{
						*pstr = (pstr + la - lb);
					}
					for (pstr = ptemp - la;pb <= b.Substring(lb) - 1;pb++,pstr++)
					{
						*pstr = pb;
					}
					pb = b;
					lstr = lstr - la + lb;
				}
			}
			pa = a;
		}
		pstr = str;
		System.out.printf("%s",pstr);
	}

}
