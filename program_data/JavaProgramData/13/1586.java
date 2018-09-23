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

		int[] visit = new int[101];

		int i;
		for (i = 0; i < n; i++)
		{
			int num;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			if (visit[num] == 1)
			{

			}
			else
			{
				if (i != 0)
				{
					System.out.print(" ");
				}
				System.out.printf("%d", num);
				visit[num] = 1;
			}
		}
		System.out.print("\n");


		return 0;
	}

}

