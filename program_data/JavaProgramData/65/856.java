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
	int[][] b = new int[n][2];
	int i;
	int j;
	int a = 0;
	int c = 0;
	for (i = 0;i < n;i++)
	{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 b[i][0] = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b[i][1] = Integer.parseInt(tempVar3);
		 }
	}

	for (i = 0;i < n;i++)
	{
		if (b[i][0] == 0 && b[i][1] == 1)
		{
			a++;
		}
		else if (b[i][0] == 1 && b[i][1] == 2)
		{
			a++;
		}
		else if (b[i][0] == 2 && b[i][1] == 0)
		{
			a++;
		}
		else if (b[i][1] == 1 && b[i][0] == 2)
		{
			c++;
		}
		else if (b[i][1] == 0 && b[i][0] == 1)
		{
			c++;
		}
		else if (b[i][1] == 2 && b[i][0] == 0)
		{
			c++;
		}
		else if (b[i][0] == b[i][1])
		{
		   continue;
		}
	}
	if (a > c)
	{
		System.out.print("A");
	}
	else if (a < c)
	{
		System.out.print("B");
	}
	else if (a == c)
	{
		System.out.print("Tie");
	}
	return 0;



	}

}

