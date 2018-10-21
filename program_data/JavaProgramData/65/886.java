package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] time = new int[200][2];
		int A = 0;
		int B = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int a = 0;a < n;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(time[a][0]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(time[a][1]) = Integer.parseInt(tempVar3);
			}
		}
		for (int a = 0;a < n;a++)
		{
			if ((time[a][0] == 0 && time[a][1] == 2))
			{
				   B++;
			}
			   if (time[a][0] > time[a][1] && (time[a][0] != 2 || time[a][1] != 0))
			   {
					 B++;
			   }
			  if ((time[a][1] == 0 && time[a][0] == 2))
			  {
				   A++;
			  }
			  if (time[a][1] > time[a][0] && (time[a][1] != 2 || time[a][0] != 0))
			  {
				   A++;
			  }
		}
		if (A == B)
		{
			System.out.print("Tie");
		}
		if (A > B)
		{
			System.out.print("A");
		}
		if (A < B)
		{
			System.out.print("B");
		}
		return 0;
	}
}

