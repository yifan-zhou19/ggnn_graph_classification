package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] m = new int[100];
		int i;
		int sum = 0;
		int k;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			k = i;
			m[i] = k;
			if (k % 7 == 0)
			{
				m[i] = 0;
			}
			else
			{
				a = k % 10;
			b = (k / 10) % 10;
			c = (k / 100) % 10;
			if (a != 7 && b != 7 && c != 7)
			{
				m[i] = k;
			}
			else
			{
				m[i] = 0;
			}
			}
			sum = sum + m[i] * m[i];
		}
		System.out.printf("%d",sum);



	}
}

