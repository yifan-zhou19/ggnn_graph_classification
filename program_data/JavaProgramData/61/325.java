package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] data = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int n;
		int a;
		int i;
		int j;

		for (j = 2; j <= 19; j++)
		{
					data[j] = data[j - 2] + data[j - 1];
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0; i <= n - 1; i++)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a = Integer.parseInt(tempVar2);
			  }
			  System.out.printf("%d\n", data[a - 1]);
		}

		return 0;
	}





}

