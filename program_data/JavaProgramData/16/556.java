package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		float b;
		float c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int j;
		int k;
		int l;
		int m;
		int i;
		int n;
		String p = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = tempVar.charAt(0);
		}
		for (i = p.length() - 1;i >= 0;i--)
		{
			System.out.printf("%c",p.charAt(i));
		}
		return 7;
	}
}

