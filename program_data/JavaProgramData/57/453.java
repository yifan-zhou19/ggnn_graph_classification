package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int suffix = char a[];
	char[][] a = new char[50][32];
	int n;
	int i;
	int l;
	int j;
	int p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = tempVar2.charAt(0);
		}
	p = suffix(a[i]);
	l = String.valueOf(a[i]).length();
	for (j = 0;j < l - p;j++)
	{
		System.out.printf("%c",a[i][j]);
	}
	System.out.print("\n");
	}
	}
	public static int suffix(String a)
	{
		int l;
		int p;
		l = a.length();
		switch (a[l - 1])
		{
			case 'g':
				p = 3;
				break;
		 case 'r':
			 p = 2;
			 break;
		 default :
			 p = 2;
		}
		return (p);
	}
}

