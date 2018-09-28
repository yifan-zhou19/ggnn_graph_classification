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
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct game
	//	{
	//		int g1;
	//		int g2;
	//	}
	//	g[n];


		int i;
		int p = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(g[i].g1) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(g[i].g2) = tempVar3;
			}
			if ((g[i].g1 == 0 && g[i].g2 == 1) || (g[i].g1 == 1 && g[i].g2 == 2) || g[i].g1 == 2 && g[i].g2 == 0)
			{
				p++;
			}
			else if (g[i].g1 == g[i].g2)
			{
			}
			else
			{
				p--;
			}


		}


		if (p > 0)
		{
			System.out.print("A");
		}
		else if (p < 0)
		{
			System.out.print("B");
		}
		else if (p == 0)
		{
			System.out.print("Tie");
		}



		return 0;
	}
}

