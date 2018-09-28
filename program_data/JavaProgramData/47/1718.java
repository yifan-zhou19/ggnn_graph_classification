package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int k = 0;
		int[] p = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;;p++)
		{
			if (k == n)
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
			k++;
		}
		p--;
		System.out.printf("%d",p[0]);
		p--;
		do
		{
			System.out.printf(" %d",p[0]);
			p--;
		}while (p >= a);
		return 0;
	}
}

