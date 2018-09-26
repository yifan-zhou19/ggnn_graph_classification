package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[100];
	char[][] c = new char[100][100];
	char e;
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
		   c[i] = tempVar2.charAt(0);
	   }
	}
	for (i = 0;i < n;i++)
	{
	  a[i] = String.valueOf(c[i]).length();
	}

	for (i = 0;i < n;i++)
	{
		k = a[i];

	 if ((e = c[i][k - 3]) == 'i')
	 {
		 for (j = 0;j < k - 3;j++)
		 {
			 System.out.printf("%c",c[i][j]);
		 }
		 System.out.print("\n");
	 }

	else
	{
		for (j = 0;j < k - 2;j++)
		{
		   System.out.printf("%c",c[i][j]);
		}
	   System.out.print("\n");
	}

	}


	}
}

