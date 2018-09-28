package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[6];
		int i;
		int j;
		int s;
		for (j = 0;j < 100;j++)
		{
		  for (i = 0;i < 6;i++)
		  {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[i] = Integer.parseInt(tempVar);
		   }
		  }
		  if (a[0] == 0 && a[1] == 0)
		  {
			break;
		  }
		  if (a[3] < 12)
		  {
			  a[3] += 12;
		  }
		  s = a[3] * 60 * 60 + a[4] * 60 + a[5] - a[0] * 60 * 60 - a[1] * 60 - a[2];
		  System.out.printf("%d\n",s);

		}


		return 0;
	}


}

