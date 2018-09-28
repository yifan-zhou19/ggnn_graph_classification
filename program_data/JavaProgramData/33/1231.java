package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	char[][] in = new char[10000][256];

	char[][] out = new char[10000][256];

	int n;
	int i;



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
		in[i] = tempVar2.charAt(0);
	}

	   int m = String.valueOf(in[i]).length();


	 for (int j = 0;j < m;j++)
	 {



	if (in[i][j] == 'A')




	{
		out[i][j] = 'T';
	}



	else if (in[i][j] == 'T')




	{
		out[i][j] = 'A';
	}



	else if (in[i][j] == 'C')




	{
		out[i][j] = 'G';
	}



	else
	{
		out[i][j] = 'C';
	}


	 }


	System.out.printf("%s\n",out[i]);

	}



	return 0;
	}


}

