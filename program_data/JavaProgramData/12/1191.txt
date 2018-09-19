package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[16];
	  int i;
	  int j;
	  int r;
	  int k;
	  while (true)
	  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[0] = Integer.parseInt(tempVar);
		  }
		  if (a[0] == -1)
		  {
			  break;
		  }
		  r = 0;
		  i = 0;
		  while (a[i] != 0)
		  {
			  i++;
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
		  }
		  for (k = 0;k < i;k++)
		  {
			  for (j = 0;j < i;j++)
			  {
				  if (a[j] == 2 * a[k])
				  {
					  r++;
				  }
			  }
		  }
		  System.out.printf("%d\n",r);
	  }


		return 0;
	}

}

