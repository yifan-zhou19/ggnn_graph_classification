package <missing>;

public class GlobalMembers
{
	public static int issn(int n)
	{
		int a;
		int b = 1;

	for (a = 2;a < n;a++)

	{


	if (n % a == 0)
	{
		b = 0;
	}

	}
		return b;
	}
	public static int Main()
	{

	int n;
	int a;
	int b = 0;
	int c;

	int[] z = new int[10000];

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}


		for (a = 3;a < n + 100;a++)

		{


	if (issn(a) != 0)


	{



	z[b] = a;



	b++;


	}

		}



	for (a = 0;a <= b - 1;a++)

	{


	for (c = a;c < b - 1;c++)


	{



	if (z[a] + z[c] == n)



	{




	System.out.printf("%d %d\n",z[a],z[c]);



	}


	}

	}



	return 0;
	}
}

