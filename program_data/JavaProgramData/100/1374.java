package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String zfc = new String(new char[300]);
	char k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		zfc = tempVar.charAt(0);
	}
	int L;
	L = zfc.length();
	int i;
	int a;
	int p;
	for (i = 97;i <= 122;i++)
	{
		a = 0;
		for (p = 0;p < L;p++)
		{
			if (zfc.charAt(p) == i)
			{
			a++;
			}
		}
		if (a != 0)
		{
		k = i;
		System.out.printf("%c=%d\n",k,a);
		}
	}
	int o = 0;
	for (p = 0;p < L;p++)
	{
		if (zfc.charAt(p) < 97 || zfc.charAt(p)>122)
		{
		o++;
		}
	}
	if (o == L)
	{
	System.out.print("No");
	}
	return 0;
	}
}

