package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	   int[] v = new int[1001];
		 v[0] = 1;
		 while (n-- != 0)
		 {
	for (i = 0;i <= 1000;i++)
	{
	v[i] = v[i] * 2;
	}
	for (i = 0;i <= 1000;i++)
	{
	if (v[i] >= 10)
	{
		   v[i] = v[i] - 10;
			v[i + 1] = v[i + 1] + 1;
	}
	}
		 }
	//printf("%d\n",v[1]);
	int flag = 0;
	for (i = 1000;i >= 0;i--)
	{
		 if (v[i] != 0)
		 {
			   for (k = i;k >= 0;k--)
			   {

			System.out.printf("%d",v[k]);
			   }


	flag = 1;
	  break;
		 }
	if (flag != 0)
	{
	 break;
	}
	}

	}

}

