package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[10]);
		String substr = new String(new char[3]);
		String s = new String(new char[13]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * m;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * n;
		String q;
		char max;
		while (scanf("%s %s",str,substr) != EOF)
		{
		for (m = str,max = m; * m != '\0';m++)
		{
			if (*m > max)
			{
				max = m;
			}
		}
		for (m = str; * m != '\0';m++)
		{
			if (*m == max)
			{
				q = m;
				break;
			}
		}
		for (p = s,m = str;m <= q;p++,m++)
		{
			*p = m;
		}
		for (n = substr; * n != '\0';n++,p++)
		{
			*p = n;
		}
		for (m = q.Substring(1); * m != '\0';m++,p++)
		{
			*p = m;
		}
		*p = '\0';
		p = s;
		System.out.printf("%s\n",p);
		}
	}
}
