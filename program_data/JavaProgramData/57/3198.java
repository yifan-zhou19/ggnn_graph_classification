package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		int i;
		int j;
		int k;
		int x;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (x = 0;x < n;x++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		k = s.length();
		if (s.charAt(k - 1) == 'r' || s.charAt(k - 1) == 'y')
		{
		k = k - 2;
		}
		else if (s.charAt(k - 1) == 'g')
		{
		k = k - 3;
		}
		for (i = 0;i < k;i++)
		{
		System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");
		}
	}
}

