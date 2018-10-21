package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[300]);
		char c;
		int i;
		int n;
		int asc;
		int f = 0;
		int[] a = new int[123];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		n = s.length();
		for (i = 0;i < n;i++)
		{
			asc = s.charAt(i);
			a[asc]++;
		}
		for (i = 65;i <= 90;i++)
		{
			if (a[i] > 0)
			{
				c = i;
				System.out.printf("%c=%d\n",c,a[i]);
				f = 1;
			}
		}
		for (i = 97;i <= 122;i++)
		{
			if (a[i] > 0)
			{
				c = i;
				System.out.printf("%c=%d\n",c,a[i]);
				f = 1;
			}
		}
		if (f == 0)
		{
			System.out.print("No\n");
		}
	}
}

