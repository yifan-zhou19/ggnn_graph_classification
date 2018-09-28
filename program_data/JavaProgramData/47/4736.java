package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int t;
		int[] a = new int[100];
		int[] p = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++,p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
		}
		for (p = a,i = 0;i < n / 2;i++)
		{
			t = (p + n - 1 - i);
			p[n - 1 - i] = (p + i);
			p[i] = t;
		}
		for (p = a;p < a + n;p++)
		{
			System.out.printf("%d",p[0]);
			if (p != a + n - 1)
			{
				System.out.print(" ");
			}
		}
	}
}

