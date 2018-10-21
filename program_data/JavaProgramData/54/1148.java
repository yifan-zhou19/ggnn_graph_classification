package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int i;
	int l;
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int g;

	double j;
	double n;
	double k;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Double.parseDouble(tempVar2);
	}

	for (a = 1;;a++)

	{


	j = (double)a;

	   for (i = 0;i < n;i++)

	   {
		   b = 1;
				if ((int)j % (int)(n - 1) != 0)
				{
					b = 0;
					break;
				}



	j = j / (n - 1) * n + k;







	   }


	if (b == 1)
	{
		break;
	}

	}

	System.out.printf("%d",(int)j);

	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		g = Integer.parseInt(tempVar3);
	}

	return 0;
	}

}

