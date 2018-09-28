package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int i;
	int j;
	int k = 0;
	int l;
	int m;
	int n;

	String word = new String(new char[40]);

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		word = tempVar2.charAt(0);
	}

	k = k + word.length() + 1;

	System.out.printf("%s",word);

	for (i = 2;i <= n;i++)

	{


	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		word = tempVar3.charAt(0);
	}


	k = k + word.length() + 1;


	if (k <= 81)


	{



	System.out.print(" ");



	System.out.printf("%s",word);


	}


	else


	{



	System.out.printf("\n%s",word);


	   k = word.length() + 1;


	}

	}

	return 0;
	}

}

