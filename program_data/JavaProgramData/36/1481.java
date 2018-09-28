package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[100]);
		String sh = new String(new char[100]);
		int[] a = new int[300];
		int[] b = new int[300];
		int len1;
		int len2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ch = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			sh = tempVar2.charAt(0);
		}
		int i;
		int j;
		len1 = ch.length();
		len2 = sh.length();
		if (len1 != len2)
		{
			System.out.print("NO\n");
		}
		else
		{
		for (i = 0;i <= len1;i++)
		{
			int m;
			m = ch.charAt(i);
			a[m]++;
		}
		for (j = 0;j <= len2;j++)
		{
			int n;
			n = sh.charAt(j);
			b[n]++;
		}
		int k;
		int h = 0;
		for (k = 0;k <= 299;k++)
		{
			if (a[k] != b[k])
			{
				System.out.print("NO\n");
				break;
			}
			else
			{
				h++;
			}
		}
			if (h == 300)
			{
				System.out.print("YES\n");
			}
		}
		return 0;
	}
}

