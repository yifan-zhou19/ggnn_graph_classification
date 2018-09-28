package <missing>;

public class GlobalMembers
{
	public static void pro()
	{
		int l;
		int i;
		int j;
		int[] a = new int[26];
		String c = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		l = c.length();
		for (i = 0;i < l;i++)
		{
			a[c.charAt(i) - 'a'] += 1;
		}
		for (i = 0;i < l;i++)
		{
			if (a[c.charAt(i) - 'a'] == 1)
			{
				System.out.printf("%c\n",c.charAt(i));
				break;
			}
		}
		if (i == l)
		{
			System.out.print("no\n");
		}
	}
	public static void Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			pro();
		}
	}


}

