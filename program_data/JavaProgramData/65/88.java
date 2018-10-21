package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int a = 0;
	int b = 0;
	int i;
	for (i = 0;i < n;i++)
	{

	int p;
	int q;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		p = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		q = Integer.parseInt(tempVar3);
	}
	if (p - q != 0)
	{

		if (p - q == -1 || p - q == 2)
		{
		a++;
		}
		else
		{
		b++;
		}




	}

















	}





	if (a == b)
	{
	System.out.print("Tie");

	}
	else if (a > b)
	{

	System.out.print("A");

	}

	else
	{
	System.out.print("B");

	}

















	return 0;
	}
}

