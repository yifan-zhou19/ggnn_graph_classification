package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[300]);
		String s2 = new String(new char[300]);
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
		int[] a = new int[128];
		int[] b = new int[128];
		int i;
		int n;
		int m;
		int k = 1;
		for (i = 0;i < 128;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		n = s1.length();
		m = s2.length();
		if (m == n)
		{
			for (i = 0;i < n;i++)
			{
				a[s1.charAt(i)]++;
				b[s2.charAt(i)]++;
			}
			for (i = 0;i < 128;i++)
			{
				if (a[i] != b[i])
				{
					System.out.print("NO");
					k = 0;
					break;
				}
			}
			if (k != 0)
			{
				System.out.print("YES");
			}
		}
		else
		{
			System.out.print("NO");
		}
	}

}

