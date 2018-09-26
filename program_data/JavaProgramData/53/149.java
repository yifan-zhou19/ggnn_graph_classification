package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int judge = 0;
		int[] b = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *c[300];
		int[] c = new int[300];
		int num;
		int i;
		int k;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			c[i] = b[i];
		}

		for (i = 0;i < num;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   c[i] = tempVar2;
		   }
		}
		for (i = 0;i < num;i++)
		{
			if (c[i] == null)
			{
				continue;
			}
			k = c[i];
			for (j = i + 1;j < num;j++)
			{
				if (c[j] == null)
				{
					continue;
				}
			if (c[j] == k)
			{
				c[j] = null;
			}
			}
		}
		for (i = 0;i < num;i++)
		{
			if (c[i] == null)
			{
				continue;
			}
			System.out.printf("%d",c[i]);
			break;
		}
		for (i++;i < num;i++)
		{
			if (c[i] == null)
			{
				continue;
			}
			System.out.printf(",%d",c[i]);
		}



		return 0;
	}

}

