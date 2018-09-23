package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int i;
		int[] shu = new int[200];
		String zi = new String(new char[301]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zi = tempVar.charAt(0);
		}
		for (i = 0;i < zi.length();i++)
		{
			if (((zi.charAt(i) > 64) && (zi.charAt(i) < 91)) || ((zi.charAt(i)>96) && (zi.charAt(i) < 123)))
			{
			  shu[zi.charAt(i) - 'A']++;
			  a = 1;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (shu[i] > 0)
			{
			System.out.printf("%c=%d\n",i + 'A',shu[i]);
			}
		}
		for (i = 32;i < 58;i++)
		{
			if (shu[i] > 0)
			{

			System.out.printf("%c=%d\n",i + 'A',shu[i]);
			}
		}
		if (a == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}

