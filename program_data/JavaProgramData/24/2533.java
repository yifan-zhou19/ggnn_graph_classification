package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] b = new int[200];
		int max = 0;
		int min = 100;
		int I;
		int J;
		int n;
	char[][] a = new char[200][200];

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
		 a[i] = tempVar2.charAt(0);
	 }
	}

	for (i = 0;i < n;i++)
	{
	b[i] = String.valueOf(a[i]).length();
	}


	for (i = 0;i < n;i++)
	{
	if (max < b[i])
	{
		max = b[i];
		I = i;
	}
	if (min > b[i])
	{
		min = b[i];
		J = i;
	}
	}

	System.out.printf("%s\n",a[I]);
	System.out.printf("%s",a[J]);
	return 0;
	}

}

