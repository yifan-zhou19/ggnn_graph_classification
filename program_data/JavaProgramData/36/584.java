package <missing>;

public class GlobalMembers
{
	public static void paixu(String a, int n)
	{
		char m;
		char k;
		int p;
		int j;
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar;
			}
		}
		for (i = 0;i < n;i++)
		{
			m = a[i];
			k = i;
			for (j = i;j < n;j++)
			{
				if (a[j].compareTo(m) > 0)
				{
					m = a[j];
					k = j;
				}
			}
			p = a[k];
			a[k] = a[i];
			a[i] = p;
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
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		paixu(a, a.length());
		paixu(b, b.length());
		int n = strcmp(a,b);
		if (n == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}

}

