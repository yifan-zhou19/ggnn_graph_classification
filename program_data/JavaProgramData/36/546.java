package <missing>;

public class GlobalMembers
{
	/*??????*/
	public static void arrange(String a, int l)
	{
		int i;
		int j;
		char t;
		for (i = 0;i < l;i++)
		{
			for (j = 0;j < l - i - 1;j++)
			{
				if (a[j].compareTo(a[j + 1]) > 0)
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
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
		int la = a.length();
		int lb = b.length();
		arrange(a, la);
		arrange(b, lb);
		if (strcmp(a,b) == 0 && la == lb)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}
}

