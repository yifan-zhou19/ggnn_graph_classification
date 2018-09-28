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

	String sfc = new String(new char[50]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		k = 0;
		w = 1;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sfc = tempVar2.charAt(0);
	}
	if (sfc.charAt(0) >= 48 && sfc.charAt(0) <= 57)
	{
		k = 1;
	}
	for (j = 0;j < sfc.length();j++)
	{
		if ((sfc.charAt(j) >= 48 && sfc.charAt(j) <= 57) || (sfc.charAt(j) >= 65 && sfc.charAt(j) <= 90) || (sfc.charAt(j) >= 97 && sfc.charAt(j) <= 122) || sfc.charAt(j) == 95)
		{
			w = 1;
		}
		else
		{
		  w = 0;
		  break;
		}


	}


	if (w == 0 || k == 1)
	{
		System.out.print("no\n");
	}

	else
	{
		System.out.print("yes\n");
	}
	}
	return 0;
	}
}

