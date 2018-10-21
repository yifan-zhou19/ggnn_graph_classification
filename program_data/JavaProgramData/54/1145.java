package <missing>;

public class GlobalMembers
{
	public static int Check(int i, int n, int k, tangible.RefObject<Integer> m, int time)
	{
		if (time == n)
		{
			return 1;
		}
		if ((i * n) % (n - 1) == 0)
		{
			m.argValue = (i * n) / (n - 1) + k;
			time++;
			return Check((i * n) / (n - 1) + k, n, k, m, time);
		}
		else
		{
			return 0;
		}
	}



	public static int Main()
	{
		int n;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *m;
		int m;
		int time = 0;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int i;
		m = a;
		m = null;
		for (i = 1;1;i++)
		{
		tangible.RefObject<Integer> tempRef_m = new tangible.RefObject<Integer>(m);
			if (Check(i, n, k, tempRef_m, time) != 0)
			{
				m = tempRef_m.argValue;
				System.out.printf("%d\n", m);
				break;
			}
			else
			{
				m = tempRef_m.argValue;
			}
		}
		return 0;
	}
}

