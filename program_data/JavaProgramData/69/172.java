package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		int l1;
		int l2;
		int l = 0;
		int m;
		int n;
		int[] c = new int[250];
		int i;
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
		while (l1 > 0 || l2 > 0)
		{
			if (l1 > 0)
			{
				m = a.charAt(l1 - 1) - '0';
			}
			else
			{
				m = 0;
			}
			l1--;
			if (l2 > 0)
			{
				n = b.charAt(l2 - 1) - '0';
			}
			else
			{
				n = 0;
			}
			l2--;
			c[l] += (m + n);
			c[l + 1] = c[l] / 10;
			c[l] = c[l] % 10;
			l++;
		}
		while (c[l] == 0 && l > 0)
		{
			l--;
		}
		for (i = l;i >= 0;i--)
		{
			System.out.printf("%d",c[i]);
		}
	}





}

