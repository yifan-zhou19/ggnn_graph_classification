package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int a;
		int b;
		int c;
		int p;
		int q;
		int m1;
		int m2;
		int sum;
		int[] k = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		i = (a - 1) / 4;
		j = (a - 1) / 100;
		t = (a - 1) / 400;
		p = i + t - j;
		q = (a - 1) - p;
		m1 = 2 * p + q;
		m2 = c;
		for (i = 1;i < b;i++)
		{
			if (((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) && i == 2)
			{
			   m2++;
			}
			m2 += k[i];
		}
		sum = m1 + m2;
		if (sum % 7 == 1)
		{
		   System.out.print("Mon.");
		}
		if (sum % 7 == 2)
		{
		   System.out.print("Tue.");
		}
		if (sum % 7 == 3)
		{
		   System.out.print("Wed.");
		}
		if (sum % 7 == 4)
		{
		   System.out.print("Thu.");
		}
		if (sum % 7 == 5)
		{
		   System.out.print("Fri.");
		}
		if (sum % 7 == 6)
		{
		   System.out.print("Sat.");
		}
		if (sum % 7 == 0)
		{
		   System.out.print("Sun.");
		}
	}
}

