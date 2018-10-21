package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = n;
		if (n == 1)
		{
		System.out.print("End");
		}
		if (n != 1)
		{
			do
			{
				if (t % 2 != 0 && t != 1)
				{
				System.out.printf("%d*3+1=%d\n",t,t * 3 + 1);
				t = t * 3 + 1;
				}
				if (t % 2 == 0 && t != 1)
				{
				  System.out.printf("%d/2=%d\n",t,t / 2);
				 t = t / 2;
				}
			}while (t != 1);
		System.out.print("End");
		}

	}
}

