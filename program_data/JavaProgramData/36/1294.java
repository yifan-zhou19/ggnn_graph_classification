package <missing>;

public class GlobalMembers
{
	public static int compare(Object a, Object b)
	{
		return*(String)b - (String)a;
	}
	public static void Main()
	{
		int i;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
	int la = a.length();
	int lb = b.length();
		if (la != lb)
		{
			System.out.print("NO");
		}
		else
		{
			qsort(a,la,(Character.SIZE / Byte.SIZE),compare);
			qsort(b,lb,(Character.SIZE / Byte.SIZE),compare);
			for (i = 0;i < a.length();i++)
			{
				if (a.charAt(i) != b.charAt(i))
				{
					break;
				}
			}
			if (i == a.length())
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

