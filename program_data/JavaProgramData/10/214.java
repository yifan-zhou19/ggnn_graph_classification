package <missing>;

public class GlobalMembers
{
	public static int max(tangible.RefObject<Integer> p, int num, int height)
	{
		int missile;
		int case1;
		int case2;
		if (num == 1)
		{
			if (p.argValue <= height)
			{
				missile = 1;
			}
		else
		{
			missile = 0;
		}
		}
		else
		{
			case1 = max(p.argValue+1, num - 1, p.argValue) + 1;
		case2 = max(p.argValue+1, num - 1, height);
		if (p.argValue <= height != 0 && case1 >= case2)
		{
			missile = case1;
		}
		else
		{
			missile = case2;
		}
		}
		return (missile);
	}
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int height = 100000;
		int H;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
		H = max(tempRef_a, n, height);
		a = tempRef_a.argValue;
		System.out.printf("%d",H);
	}




}

