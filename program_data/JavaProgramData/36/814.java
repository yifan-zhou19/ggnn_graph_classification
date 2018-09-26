package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		String b = new String(new char[1001]);
		int[] c = new int[100];
		int i;
		int n = 0;
		int l1;
		int l2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		l1 = a.length();
		l2 = b.length();
		if (l1 == l2)
		{
			for (i = 0;i < l1;i++)
			{
				c[a.charAt(i) - 'a']++;
			}
			for (i = 0;i < l2;i++)
			{
				c[b.charAt(i) - 'a']--;
			}
			for (i = 0;i < 100;i++)
			{
				if (c[i] != 0)
				{
					System.out.print("NO");
					n = 1;
					break;
				}
			}
			if (n == 0)
			{
				System.out.print("YES");
			}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

