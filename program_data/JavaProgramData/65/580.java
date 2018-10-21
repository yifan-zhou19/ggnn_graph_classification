package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int s;
		s = 0;
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
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a - b == -1 || a - b == 2)
			{
				s++;
			}
			if (a - b == 1 || a - b == -2)
			{
				s--;
			}
		}
		if (s > 0)
		{
			System.out.print("A");
		}
		if (s < 0)
		{
			System.out.print("B");
		}
		if (s == 0)
		{
			System.out.print("Tie");
		}


		return 0;
	}


}

