package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p = new String(new char[1000]);
		String q = new String(new char[1000]);
		int[] a = new int[128];
		int[] b = new int[128];
		int i;
		int j;
		int n;
		int m;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			q = tempVar2.charAt(0);
		}
		n = p.length();
		m = q.length();
		for (i = 0;i < n;i++)
		{
		   a[p.charAt(i)]++;
		}
		for (i = 0;i < m;i++)
		{
		   b[q.charAt(i)]++;
		}
		for (i = 0;i < 128;i++)
		{
		   if (a[i] != b[i])
		   {
		   t = 1;
		   break;
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

