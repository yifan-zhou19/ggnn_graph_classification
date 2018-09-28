package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);
		int i;
		int j;
		int t;
		int[] a1 = new int[200];
		int[] a2 = new int[200];
		int l1;
		int l2;
		int l;
		for (i = 0;i < 200;i++)
		{
			a1[i] = 0;
			a2[i] = 0;
		}
		t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		l1 = s1.length();
		l2 = s2.length();
		if (l1 != l2)
		{
			System.out.print("NO\n");
		}
		else
		{
			l = l1;
			for (i = 0;i < l;i++)
			{
				a1[s1.charAt(i)]++;
				a2[s2.charAt(i)]++;
			}
			t = 0;
			for (i = 0;i < 200;i++)
			{
				if (a1[i] != a2[i])
				{
					t = 1;
				}
			}
			if (t == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}

}

