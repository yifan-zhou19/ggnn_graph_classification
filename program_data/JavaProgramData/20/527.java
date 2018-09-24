package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[11]);
		String cut = new String(new char[4]);
		String ans = new String(new char[20]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		char maxchar;
		int i;
		int l;
		int maxnum;
		while (scanf("%s%s",str1,cut) != EOF)
		{
			p = str1;
			l = str1.length();
			maxchar = p;
			maxnum = 0;
			p++;
			for (i = 1;i < l;i++,p++)
			{
				if (*p > maxchar)
				{
					maxchar = p;
					maxnum = i;
				}
			}
			ans = "";
			strncat(ans,str1,maxnum + 1);
			ans += cut;
			ans += str1.Substring(maxnum) + 1;
			System.out.println(ans);
		}
	}
}
