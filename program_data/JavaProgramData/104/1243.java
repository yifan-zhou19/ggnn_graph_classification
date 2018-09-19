package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c1 = 0;
		int c2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		int[] t = new int[10000];
		int[] m = new int[10000];
		int i;
		int j;
		if (a == b)
		{
			System.out.printf("%d",a);
		}
		else if (a == 1 || b == 1)
		{
			System.out.print("1");
		}
		else
		{
			t[1] = a;
		for (i = 2;a != 1;i++)
		{
			a = a / 2;
			t[i] = a;
			c1++;



		}
		m[1] = b;
		for (j = 2;b != 1;j++)
		{
			b = b / 2;
			m[j] = b;
			c2++;

		}
		for (i = 1;i <= c1;i++)
		{
			for (j = 1;j <= c2;j++)
			{
				if (t[i] == m[j])
				{
					break;
				}
			}
			if (t[i] == m[j])
			{
				break;
			}
		}


		System.out.printf("%d",t[i]);
		}





	}

}

