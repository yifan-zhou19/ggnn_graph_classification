package <missing>;

public class GlobalMembers
{
	public static int apple(int a,int b) //a??b??//
	{
		int z;
		if (b == 1 || a == 0)
		{
			z = 1;
		}
		else if (b > a)
		{
			z = apple(a, a);
		}
		else
		{
			z = apple(a, b - 1) + apple(a - b, b);
		}
		return z;
	}
	public static void Main()
	{
		int[] m = new int[20];
		int[] n = new int[20];
		int s;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		for (i = 0;i < s;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < s;i++)
		{
			System.out.printf("%d\n",apple(m[i], n[i]));
		}
	}
}

