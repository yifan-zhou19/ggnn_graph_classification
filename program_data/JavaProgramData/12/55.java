package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int count;
		int[] group = new int[15];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		do
		{
			i = 0;
			do
			{
				group[i] = t;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					t = Integer.parseInt(tempVar2);
				}
				i++;
			} while (t != 0);
			System.out.print("\n");
					count = 0;
			for (j = i - 1;j >= 0;j--)
			{
			   for (k = 0;k < i;k++)
			   {
				  if ((double)group[k] / 2 == group[j]) //double
				  {
				  count++;
				  }
				  else if ((double)group[j] / 2 == group[k]) //!=int!!!!!!!
				  {
				  count++;
				  }
			   }
			}
			System.out.printf("%d\n",count / 2);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t = Integer.parseInt(tempVar3);
			}

		} while (t != -1);
		return 0;
	}


}

