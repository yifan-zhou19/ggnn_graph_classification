package <missing>;

public class GlobalMembers
{
	public static int t = 0;
	public static void range(int n, int m, tangible.RefObject<Integer> p)
	{
		if (t == m)
		{
			return;
		}
		else
		{
			t++;
			range(n, m, p);
			int v = (p.argValue + n - 1);
			int i;
			for (i = n - 1;i > 0;i--)
			{
				*(p.argValue + i) = *(p.argValue + i - 1);
			}
			p.argValue = v;

		}
	}

	public static void Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int[] num = new int[100];
		int[] p = num;
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i] = Integer.parseInt(tempVar3);
			}
		}
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		range(n, m, tempRef_p);
		p = tempRef_p.argValue;
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",num[i]);
		}
		System.out.printf("%d",num[n - 1]);
	}




}

