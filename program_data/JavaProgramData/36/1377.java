package <missing>;

public class GlobalMembers
{
	public static void paixu(String a)
	{
		int i;
		int j;
		char b;
		for (i = 0;i < a.length() - 1;i++)
		{
			for (j = 0;j < a.length() - 1 - i;j++)
			{
				if (a[j].compareTo(a[j + 1]) > 0)
				{
					b = a[j];
					 a[j] = a[j + 1];
					a[j + 1] = b;
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
		paixu(a);
		paixu(b);
		if (strcmp(a,b) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
}

