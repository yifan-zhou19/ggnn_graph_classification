package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int h = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
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
			if (c == 1)
			{
				k++;
			}
			else if (c == 2)
			{
				h++;
			}
			else if (c == -1)
			{
				h++;
			}
			else if (c == -2)
			{
				k++;
			}
			else if (c == 0)
			{
				h++;
				k++;
			}
		}
		if (h < k)
		{
			System.out.print("B");
		}
		else if (h > k)
		{
			System.out.print("A");
		}
		else if (h == k)
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

