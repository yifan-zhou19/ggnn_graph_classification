package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int j;
	int k;
	int w;

	String sfc = new String(new char[280]);
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
		sfc = tempVar2.charAt(0);
	}

	if ((sfc.charAt(sfc.length() - 3)) == 'i')
	{
		sfc = sfc.substring(0, sfc.length() - 3);
	}
	else
	{
		sfc = sfc.substring(0, sfc.length() - 2);
	}



	System.out.printf("%s\n",sfc);
	}
	return 0;
	}

}

