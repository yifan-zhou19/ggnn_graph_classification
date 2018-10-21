package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int c;
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  b[i] = Integer.parseInt(tempVar2);
		  }
		}
		for (i = 1;i < a;i++)
		{
			if (b[i] > b[0])
			{
				c = b[i];
				b[i] = b[0];
				b[0] = c;
			}
		}

		for (i = 2;i < a;i++)
		{
			if (b[i] > b[1])
			{
				b[1] = b[i];
			}
		}
		System.out.printf("%d\n",b[0]);
		System.out.printf("%d",b[1]);
	return 0;
	}

}

