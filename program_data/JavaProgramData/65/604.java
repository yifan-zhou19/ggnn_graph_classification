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
	//	struct suoyou
	//	{
	//		int qian;
	//		int hou;
	//		int jg;
	//	}
	//	suoyous[202];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				suoyous[i].qian = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				suoyous[i].hou = tempVar3;
			}
			if (suoyous[i].qian == 0 && suoyous[i].hou == 1)
			{
				suoyous[i].jg = 1;
			}
			else if (suoyous[i].qian == 1 && suoyous[i].hou == 2)
			{
				suoyous[i].jg = 1;
			}
			else if (suoyous[i].qian == 2 && suoyous[i].hou == 0)
			{
				suoyous[i].jg = 1;
			}
			else if (suoyous[i].qian == 0 && suoyous[i].hou == 2)
			{
				suoyous[i].jg = 0;
			}
			else if (suoyous[i].qian == 0 && suoyous[i].hou == 0)
			{
				suoyous[i].jg = 2;
			}
			else if (suoyous[i].qian == 1 && suoyous[i].hou == 1)
			{
				suoyous[i].jg = 2;
			}
			else if (suoyous[i].qian == 1 && suoyous[i].hou == 0)
			{
				suoyous[i].jg = 0;
			}
			else if (suoyous[i].qian == 0 && suoyous[i].hou == 1)
			{
				suoyous[i].jg = 1;
			}
			else if (suoyous[i].qian == 2 && suoyous[i].hou == 1)
			{
				suoyous[i].jg = 0;
			}
			else if (suoyous[i].qian == 2 && suoyous[i].hou == 2)
			{
				suoyous[i].jg = 2;
			}
		}
		int s = 0;
		for (i = 0;i < n;i++)
		{
			if (suoyous[i].jg == 1)
			{
				s++;
			}
		}
		int m = 0;
		for (i = 0;i < n;i++)
		{
			if (suoyous[i].jg == 0)
			{
				m++;
			}
		}

		if (s > m)
		{
			System.out.print("A");
		}
		else if (s < m)
		{
			System.out.print("B");
		}
		else if (s == m)
		{
			System.out.print("Tie");
		}




		return 0;
	}
}

