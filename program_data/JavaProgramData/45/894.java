package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String xiao = new String(new char[50]);
	  String da = new String(new char[50]);
		int i;
		int j;
		int k;
		int l;
		int m;
		int Z;
		int s;
		int n;
		int lenx;
		int lend;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			xiao = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			da = tempVar2.charAt(0);
		}
		p = tangible.StringFunctions.strStr(da,xiao) - da;
	System.out.printf("%d",p);

	}

}

