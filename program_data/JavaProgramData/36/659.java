package <missing>;

public class GlobalMembers
{
	public static void count(String s, int l, int[] ns)
	{
		int i;
		for (i = 0;i < l;i++)
		{
			ns[s[i] - 'A']++;
		}
	}
	public static void compare(int[] ms, int[] ns)
	{
		int i;
		for (i = 0;i < 60;i++)
		{
			if (ms[i] != ns[i])
			{
				System.out.print("NO\n");
				return;
			}

		}
		System.out.print("YES\n");
	}
	public static void Main()
	{
		int[] ns1 = new int[60];
		int[] ns2 = new int[60];
		int l1;
		int l2;
		int i;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		l1 = s1.length();
		l2 = s2.length();
		count(s1, l1, ns1);
		count(s2, l2, ns2);
		compare(ns1, ns2);
	}
}

