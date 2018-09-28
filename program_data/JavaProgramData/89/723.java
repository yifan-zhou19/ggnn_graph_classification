package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int n;
		int i;
		int[] s = new int[10000];
		int[] z = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == 0 && b == 0)
			{
				break;
			}
			s[a] = 1;
			z[b] = z[b] + 1;
		}
		for (i = 0;i < n;i++)
		{
			if (s[i] == 0)
			{
				c = i;
			}
		}
		if (z[c] == n - 1)
		{
			System.out.printf("%d\n",c);
		}
		else
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}

