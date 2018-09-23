package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		int i;
		int[] b = new int[26];
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) >= 97 && a.charAt(i) <= 122)
			{
				b[(a.charAt(i) - 97)]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (b[i] > 0)
			{
				System.out.printf("%c=%d\n",(97 + i),b[i]);
			}
		}
		for (i = 0;i < 26;i++)
		{
			t += b[i];
		}
		if (t == 0)
		{
			System.out.print("No\n");
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		return 0;
	}


}

