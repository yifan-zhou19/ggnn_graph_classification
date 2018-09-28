package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int w;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		a = w + 12;
		if (a % 7 == 5)
		{
			System.out.print("1\n");
		}
		for (i = 0;i < 11;i++)
		{
			a = w + m[i] + 12;
			if (a % 7 == 5)
			{
				d = i + 2;
			System.out.printf("%d\n",d);
			}
		  b = m[i + 1];
		  c = m[i];
		  m[i + 1] = b + c;
		}
		return 0;

	}
}

