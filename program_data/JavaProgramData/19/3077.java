package <missing>;

public class GlobalMembers
{
	public static final char flag = -128;
	public static final char noo = -126;
	public static int Main()
	{
		int i;
		int l1;
		int l2;
		int l;
		String s1 = new String(new char[101]);
		String s2 = new String(new char[101]);
		String s = new String(new char[1001]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		s = new Scanner(System.in).nextLine();
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		l1 = s1.length();
		l2 = s2.length();
		l = s.length();
		while ((p = tangible.StringFunctions.strStr(s,s1)) != null)
		{
			/*if(l2>l1){
				for (i=l-1;&s[i]>=p;i--) s[i+l2-l1]=s[i];
				l+=l2-l1;s[l]=0;
			}
			for (i=0;i<l2;i++,p++) *p=s2[i];
			if(l2<l1){
				for (;*(p+l1-l2)!=0;p++) *p=*(p+l1-l2);
				*p=0;l-=l1-l2;
			}*/
			if (p != s && *(p - 1) != ' ')
			{
				*p = noo;
				continue;
			}
			*p = flag;
			for (p++; * (p + l1 - 1) != 0;p++)
			{
				*p = (p + l1 - 1);
			}
			*p = 0;
			l -= l1 - 1;
		}
		//puts(s);
		//for (i=0;i<l;i++) printf("%d ",s[i]);
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) == flag)
			{
				System.out.printf("%s",s2);
			}
			else if (s.charAt(i) == noo)
			{
				System.out.printf("%c",s1.charAt(0));
			}
			else
			{
				System.out.printf("%c",s.charAt(i));
			}
		}
		System.out.print("\n");
		return 0;
	}
}

