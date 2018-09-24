package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	  int i;
	  int j;
	  int m;
	  int n;

	  while (true)
	  {
	  for (i = 0;i < 16;i++)
	  {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		if (a[i] == -1)
		{
		}
		if (a[i] == 0)
		{
			n = i;
			break;
		}
	  } //input
	  m = 0;
	  for (i = 0;i < n;i++)
	  {
	   for (j = 0;j < n;j++)
	   {
		 if (a[j] == (a[i] + a[i]))
		 {
			 m++;
		 }
	   }
	  } //??


	  {
		 System.out.printf("%d\n",m);
 }


	  }


	}

}

