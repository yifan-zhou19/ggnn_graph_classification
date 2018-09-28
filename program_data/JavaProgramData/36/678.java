package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int i;
		int p;
		int j;
		int a;
		int b;
		String s = new String(new char[1000]);
		String s1 = new String(new char[1000]);
		int[] ss = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		a = s.length();
		b = s1.length();
		if (a == b)
		{
		for (i = 0;i < a;i++)
		{
			p = 0;
			for (j = 0;j < b;j++)
			{
				if (s.charAt(i) == s1.charAt(j) && ss[j] == 0)
				{
					ss[j] = 1;
					p = 1;
					break;
				}
			}
			if (p == 0)
			{
				System.out.print("NO\n");
				break;
			}
		}
		if (p == 1)
		{
			System.out.print("YES\n");
		}
		}
		else
		{
			System.out.print("NO\n");
		}
	}
}

