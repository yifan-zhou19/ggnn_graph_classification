package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int[] a = new int[16];
	  int i;
	  int j;
	  int k;
	  int m;
	  for (;;)
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
		for (i = 1;i < 16;i++)
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
		for (j = 0;j < i;j++)
		{
			 if (a[j] % 2 == 0)
			 {
				  for (k = 0;k < i;k++)
				  {
				   if ((a[j] / 2) == a[k])
				   {
				m++;
				   }
				  }
			 }
		}
		System.out.printf("%d\n",m);
	  }
	}
}

