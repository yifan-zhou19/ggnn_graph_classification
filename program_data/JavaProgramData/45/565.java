package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *rslt;
		int rslt;
		String w1 = new String(new char[60]);
		String w2 = new String(new char[60]);
		String p1;
		String p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w2 = tempVar2.charAt(0);
		}
		p1 = w1;
		p2 = w2;
		rslt = tangible.StringFunctions.strStr(p2,p1);
		m = p2;
		n = rslt;
		System.out.printf("%d",(n - m));
	}
}

