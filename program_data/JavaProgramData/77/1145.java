package <missing>;

public class GlobalMembers
{
	public static int find(char a, int b, int c)
	{
		char t;
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			t = tempVar.charAt(0);
		}
		while (t == a)
		{
			c = find(a, c, c + 1);
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				t = tempVar2.charAt(0);
			}
		}
		System.out.printf("%d %d\n",b,c);
		return c + 1;
	}
	public static int Main()
	{
		char d;
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			d = tempVar.charAt(0);
		}
		find(d, 0, 1);
	//	return 0;
	}
}

