package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int j;
	int s;
	int[] x = new int[1000];
	int[] y = new int[1000];


	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
										  while (n != 0 && m != 0)
										  {

	for (i = 0;i <= (n - 1);i++)
	{
		y[i] = 0;
	x[i] = i + 1;
	}
	//?????n-1????? 
	//???????????? 

	for (j = 0;j <= (n - 2);j++)

	{
	s = m % (n - j);


			 for (i = s;i <= (n - j - 1);i++)
			 {
			  y[i - s] = x[i];
			 }
			  for (i = 0;i <= (s - 2);i++)
			  {
			  y[n - j - s + i] = x[i];
			  }

	//????????????y[] ,??y?????x?????y???

	for (i = 0;i <= (n - j - 2);i++)
	{
			  x[i] = y[i];
	}
	x[n - j - 1] = 0;
	for (i = 0;i <= n - j - 2;i++)
	{
						  y[i] = 0;
	}

	}



	System.out.printf("%d\n",x[0]);
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		m = Integer.parseInt(tempVar4);
	}
										  }


	}

}

