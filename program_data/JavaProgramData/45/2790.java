package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[51]);
		String w = new String(new char[51]);
		char i;
		char j;
		char m;
		char n;
		char c;
		int[] a = new int[51];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		m = s.length();
		n = w.length();
		for (i = 0;i <= n - m;i++)
		{
			for (j = i;j < i + m;j++)
			{
				c = w.charAt(j) - s.charAt(j - i);
				if (c < 0)
				{
					c = (-1) * c;
				}
				a[i] = a[i] + c;
			}
		}
		for (i = 0;i <= n - m;i++)
		{
			if (a[i] == 0)
			{
				break;
			}
		}
		System.out.printf("%d",i);
		return 0;
	}





}

