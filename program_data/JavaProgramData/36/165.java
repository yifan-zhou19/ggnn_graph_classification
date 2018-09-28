package <missing>;

public class GlobalMembers
{
	public static int mycompare(Object c1, Object c2)
	{
		String p1 = (String)c1;
		String p2 = (String)c2;
		return (p1 - p2);
	}
	public static int Main()
	{
		char[] a = {0};
		char[] b = {0};
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
		qsort(a,a.length(),(Character.SIZE / Byte.SIZE),mycompare);
		qsort(b,b.length(),(Character.SIZE / Byte.SIZE),mycompare);
		if (strcmp(a,b) != 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print("YES");
		}
		return 0;
	}
}

