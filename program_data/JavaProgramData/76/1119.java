package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int[] a = new int[1000];
	int[] b = new int[1000];
	int n;
	int i;
	int[] all = new int[20000];
	int j;
	int m;

	for (i = 0;i < 20000;i++)
	{


	all[i] = 0;
	}

	   m = 0;

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
		a[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}


	for (j = 0;j < 20000;j++)
	{



	if (j >= 2 * a[i] && j <= 2 * b[i])
	{




	all[j] = 1;
	}


	}

	}

	int x;
	int y;

	for (i = 1;i < 20000;i++)
	{


	if (all[i] == 0 && all[i + 1] == 1 && all[i - 1] == 1)
	{



	m++;



	break;


	}


	else
	{



	if (all[i] == 1 && all[i + 1] == 1 && all[i - 1] == 0)
	{




	x = i / 2;
	}



	if (all[i] == 1 && all[i + 1] == 0 && all[i - 1] == 1)
	{




	y = i / 2;
	}


	}

	}

	if (m == 0)
	{


	System.out.printf("%d %d",x,y);
	}



	else
	{


	System.out.print("no");

	}

	System.in.read();

	System.in.read();

	return 0;
	}


}

