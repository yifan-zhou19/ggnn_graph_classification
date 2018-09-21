package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char q;
		char[][] a = new char[101][101];
		int[] tot = new int[101];
		int sum = 1;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			q = tempVar.charAt(0);
		}


		while (q != '\n')
		{
			   if (q == ' ')
			   {
			   sum++;
			   String tempVar2 = ConsoleInput.scanfRead(null, 1);
			   if (tempVar2 != null)
			   {
				   q = tempVar2.charAt(0);
			   }
			   }
		   else
		   {
			   tot[sum]++;
			   a[sum][tot[sum]] = q;
			   String tempVar3 = ConsoleInput.scanfRead(null, 1);
			   if (tempVar3 != null)
			   {
				   q = tempVar3.charAt(0);
			   }
		   }
		}
		for (i = sum;i > 1;i--)
		{
				for (j = 1;j <= tot[i];j++)
				{
					System.out.printf("%c",a[i][j]);
				}
				System.out.print(" ");
		}
		for (j = 1;j <= tot[1];j++)
		{
			System.out.printf("%c",a[i][j]);
		}
	 //   scanf("%c",&q);        

	}

}

