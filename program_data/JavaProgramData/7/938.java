package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[999]);
		String b = new String(new char[999]);
		String aa;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * bb;
		char[][] c = new char[999][999];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * cc;
		String d = new String(new char[999]);
		b = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		d = new Scanner(System.in).nextLine();
		int len = a.length();
		int len2 = b.length();
		int k = 0;
		int i;
		int j = 0;
		for (bb = b; * (bb + len - 1) != '\0';bb++,k++)
		{
			i = 0;
			for (cc = c[k];i < len;i++,cc++)
			{
				* cc =  (bb + i);
			}
			* cc = '\0';
			j++;
		}
		int sp = 0;
		for (i = 0;i < j;i++)
		{
			if (strcmp(a,c[i]) == 0)
			{
				sp = 1;
				break;
			}
		}
		char[][] e = new char[2][999];
		int pom = i;
		for (i = 0;i < pom;i++)
		{
			e[0][i] = b.charAt(i);
			e[0][pom] = '\0';
		}
		k = 0;
		for (i = pom + len;i < len2;i++,k++)
		{
			e[1][k] = b.charAt(i);
		}
		e[1][k] = '\0';
		if (sp == 1)
		{
			System.out.printf("%s%s%s",e[0],d,e[1]);
		}
		if (sp == 0)
		{
			System.out.println(b);
		}
		return 0;
	}
}
