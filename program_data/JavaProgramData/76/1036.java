package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int[] a = new int[1000];
	int[] b = new int[1000];
	int n;
	int i;
	int[] s = new int[20000];
	int j;
	int k;

	for (i = 0;i < 20000;i++)
	{


	s[i] = 0;
	}

	   k = 0;

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




	s[j] = 1;
	}


	}

	}

	int x;
	int y;

	for (i = 1;i < 20000;i++)
	{


	if (s[i] == 0 && s[i + 1] == 1 && s[i - 1] == 1)
	{



	k++;



	break;


	}


	else
	{



	if (s[i] == 1 && s[i + 1] == 1 && s[i - 1] == 0)
	{




	x = i / 2;
	}



	if (s[i] == 1 && s[i + 1] == 0 && s[i - 1] == 1)
	{




	y = i / 2;
	}


	}

	}

	if (k == 0)
	{


	System.out.printf("%d %d",x,y);
	}



	else
	{


	System.out.print("no");

	}
	return 0;
	}
}

