package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] t = new int[20];
		int n;
		int i;
		int j;
		int a;
		int b;
		int c;
		i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t[i] = Integer.parseInt(tempVar2);
			}
			i = i + 1;
		}
		i = 0;
		while (i < n)
		{
			a = 1;
			b = 1;
			j = 1;
			while (j < t[i])
			{
				c = b;
				b = a + b;
				a = c;
				j = j + 1;
			}
			System.out.printf("%d\n",a);
			i = i + 1;
		}
	}
}

