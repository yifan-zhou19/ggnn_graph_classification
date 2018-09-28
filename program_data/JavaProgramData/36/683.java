package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] c = new int[128];
		int l1;
		int l2;
		int i;
		int b = 0;
		String s1 = new String(new char[1000]);
		String s2 = new String(new char[1000]);
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
		for (i = 0;i < l1;i++)
		{
			c[s1.charAt(i)]++;
		}
		for (i = 0;i < l2;i++)
		{
			c[s2.charAt(i)]--;
		}
		for (i = 0;i < 128;i++)
		{
			b = b != 0 || c[i] != 0;
		}
		if (b == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}

}

