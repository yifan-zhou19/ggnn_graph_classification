package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int a;
		String src = new String(new char[50]);
		String sub = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sub = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			src = tempVar2.charAt(0);
		}
		m = (int)sub.length();
		n = (int)src.length();
		for (i = 0; i <= n - m; i++)
		{
			j = 0;
			k = i;
			while (j < m && src.charAt(k) == sub.charAt(j))
			{
				j++;
				k++;
			}
			if (j == m)
			{
				a = i;
				break;
			}
		}
		System.out.printf("%d\n",a);
		return 0;
	}
}

