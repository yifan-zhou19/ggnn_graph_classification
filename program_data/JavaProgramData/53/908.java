package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int[] sz = new int[300];
	  int n;
	  int mark = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[i] = Integer.parseInt(tempVar2);
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		mark = 0;
		/*if(i==6)  printf("ok"); */
		/*if(i==8)   printf("ok"); */
		if (i == 0)
		{
		  System.out.printf("%d",sz[0]);
		}

		if (i == n - 1)
		{
		  for (j = 0;j < i;j++)
		  {
			if (sz[i] != sz[j])
			{
			  mark++;
			}
			else if (sz[i] == sz[j])
			{
				break;
			}
		  }
		  if (mark == i)
		  {
			  System.out.printf(",%d",sz[i]);
		  }
		}

		for (j = 0;j < i;j++)
		{
		  if (sz[i] != sz[j])
		  {
			mark++;
		  }
		  else if (sz[i] == sz[j])
		  {
			  break;
		  }
		  if (mark == i)
		  {
			  System.out.printf(",%d",sz[i]);
		  }
		}
	  }
	  return 0;
	}

}

