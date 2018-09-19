package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[20];
	  int i;
	  int j;
	  int k;
	  int m;
	  while (true)
	  {
		m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		if (a[0] == -1)
		{
			break;
		}
		else
		{
			for (i = 1;;i++)
			{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i] = Integer.parseInt(tempVar2);
			 }
		 if (a[i] == 0)
		 {
			 break;
		 }
			}
		}
		for (k = 0;k < i;k++)
		{
			for (j = 0;j < i;j++)
			{
			 if ((a[k] == 2 * a[j]) && (a[k]))
			 {
		   m++;
			 }
			}
		}
		System.out.printf("%d\n",m);
	  }
	}

}

