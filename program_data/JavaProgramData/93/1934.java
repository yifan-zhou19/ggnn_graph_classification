package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = 0;
		for (i = 3;i <= 7;i = i + 2)
		{
			if (n % i == 0)
			{
				if (t >= 1)
				{
					System.out.print(" ");
				}
				System.out.printf("%d",i);
				t++;
			}
		}
		if (t == 0)
		{
			System.out.print("n");
		}
	}
}

