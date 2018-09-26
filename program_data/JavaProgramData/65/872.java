package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a;
		int b;
		int c;
		int m;
		int j = 0;
		int k = 0;
		for (int i = 0;i < n;i++)
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
			c = a - b;
			if (c == -1 || c == 2)
			{
				j++;
			}
			else if (c == 1 || c == -2)
			{
				k++;
			}
		}
		m = j - k;
		if (m == 0)
		{
			System.out.print("Tie");
		}
		else if (m < 0)
		{
			System.out.print("B");
		}
		else if (m > 0)
		{
			System.out.print("A");
		}
		return 0;
	}

}

