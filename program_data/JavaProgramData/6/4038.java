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
		int[][] num = new int[120][120];
		for (int i = 0;i < n;i++)
		{
			int a;
			int b;
			int s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			for (int m = 0;m < a;m++)
			{
			 for (int n = 0;n < b;n++)
			 {
				  String tempVar4 = ConsoleInput.scanfRead();
				  if (tempVar4 != null)
				  {
					  num[m][n] = Integer.parseInt(tempVar4);
				  }
				if (m == 0 || m == a - 1 || n == 0 || n == b - 1)
				{
				s += num[m][n];
				}


			 }
			}
		System.out.printf("%d\n",s);

		}



	}

}

