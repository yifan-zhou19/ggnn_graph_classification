package <missing>;

public class GlobalMembers
{
	public static String Dat = new String(new char[maxn]);
	public static int n;
	public static int[] Stac = new int[maxn];
	public static int Top;
	public static int Main()
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		Dat = tempVar.charAt(0);
	}
	n = Dat.length();
	Top = 0;
	for (int i = 0; i < n; i++)
	{
		if (Dat.charAt(i) == Dat.charAt(0))
		{
		Stac[++Top] = i;
		}
		else
		{
		System.out.printf("%d %d\n",Stac[Top--],i);
		}
	}
	}
}

