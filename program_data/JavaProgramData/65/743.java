package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[][] cai = new int[300][2];
	int i;
	int t;
	int s;
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
			(cai[i][0]) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			(cai[i][1]) = Integer.parseInt(tempVar3);
		}
	}
	s = 0;
	for (i = 0;i < n;i++)
	{
		t = (cai[i][0]) - (cai[i][1]);
		if (t == -1 || t == 2)
		{
			s += 1;
		}
		if (t == 1 || t == -2)
		{
			s -= 1;
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

