package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i;
		int j;
		int k;
		int n = 0;
		int m;
		int res = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		j = a.length();
		k = b.length();
		for (n = 0;n < j - k + 1;n++)
		{
			m = 0;
			while ((m < k) && (b.charAt(m) == a.charAt(m + n)))
			{
				m++;
			}
			if (m == k)
			{
				res = n;
				break;
			}
		}
		if (res != -1)
		{
			System.out.printf("%d",res);
		}
	}
}

