package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int s;
		int t;
		int n;
		int p;
		int x;
		int z;
		x = 0;
		z = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = n * n;
		s = 255;
		for (i = 1;i <= p;i++)
		{
			t = s;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = Integer.parseInt(tempVar2);
			}
			if (s == 0 && t == 0)
			{
				x += 1;
			}
			if (s == 0)
			{
				z += 1;
			}
		}
		z = (z - x - 2) / 2;
		x = x / 2 - 1;
		x = x * z;
		System.out.printf("%d\n",x);


	}

}

