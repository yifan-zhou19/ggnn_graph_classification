package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int c;
		int n;
		int i;
		String d = new String(new char[200]);
		String e = new String(new char[232]);
		String f = new String(new char[232]);
		int max = 0;
		int min = 100;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d = tempVar2.charAt(0);
			}
			b = d.length();
			if (b > max)
			{
				max = b;
				e = d;
			}
			if (b < min)
			{
				min = b;
				f = d;
			}
		}
		System.out.printf("%s\n",e);
		System.out.printf("%s\n",f);
		return 0;
	}
}

