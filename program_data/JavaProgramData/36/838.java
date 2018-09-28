package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return ((String)a - (String)b);
	}
	public static void Main()
	{
		String s1 = new String(new char[1000]);
		String s2 = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		int n1 = s1.length();
		int n2 = s2.length();
		int flag = 1;
		if (n1 != n2)
		{
			System.out.print("NO");
			flag = 0;
		}
		qsort(s1,n1,(Character.SIZE / Byte.SIZE),cmp);
		qsort(s2,n2,(Character.SIZE / Byte.SIZE),cmp);
		if (flag != 0)
		{
		if (strcmp(s1,s2) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		}
	}

}

