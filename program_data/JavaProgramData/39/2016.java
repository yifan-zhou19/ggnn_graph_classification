package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int i;
		int sum = 0;
		int max = 0;
		int[] m = new int[100];
		int[] result = new int[100];
		char p;
		char q;
		String name = new String(new char[20]);
		String s = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			result[i] = scanf("%s %d %d %c %c %d\n", s, a, b, p, q, c);
			if (a > 80 && c > 0)
			{
				m[i] += 8000;
			}
			if (a > 85 && b > 80)
			{
				m[i] += 4000;
			}
			if (a > 90)
			{
				m[i] += 2000;
			}
			if (a > 85 && q == 'Y')
			{
				m[i] += 1000;
			}
			if (b > 80 && p == 'Y')
			{
				m[i] += 850;
			}
			if (m[i] > max)
			{
				max = m[i];
				name = s;
			}
			sum += m[i];
		}
		System.out.printf("%s\n%d\n%d\n", name, max, sum);
		return 0;
	}
}

