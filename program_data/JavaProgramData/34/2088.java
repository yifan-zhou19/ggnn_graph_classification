package <missing>;

public class GlobalMembers
{
	public static void cal(tangible.RefObject<Integer> x)
	{
		int t;
		t = x.argValue;
		if (t % 2 != 0)
		{
			t = t * 3 + 1;
			System.out.printf("%d*3+1=%d\n",(t - 1) / 3,t);
		}
		else
		{
			t /= 2;
			System.out.printf("%d/2=%d\n",t * 2,t);
		}
		x.argValue = t;
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		do
		{
			if (n == 1)
			{
				System.out.print("End\n");
				return 0;
			}
			else
			{
			tangible.RefObject<Integer> tempRef_n = new tangible.RefObject<Integer>(n);
				cal(tempRef_n);
				n = tempRef_n.argValue;
			}
		} while (1 != 0);
	}
}

