package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int s = 0;
		int n;
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		do
		{
			a = i / 10;
			b = i - a * 10;
			c = i / 7;
			d = i - 7 * c;
			s = s + i * i;
			if (a == 7 || b == 7 || d == 0)
			{
				s = s - i * i;
			}
			i++;
		}while (i <= n);
		System.out.printf("%d",s);
		return 0;
	}
}

