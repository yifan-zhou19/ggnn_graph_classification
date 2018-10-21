package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String d = new String(new char[10]);
		d = new Scanner(System.in).nextLine();
		char[][] a = new char[n][1000];
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
		   int c;
		   int d = 0;
		   c = String.valueOf(a[i]).length();
		   int[] b = new int[c];
		   for (m = 0;m < c;m++)
		   {
			   b[m] = 0;
		   }
		   for (j = 0;j < c;j++)
		   {
			  for (k = 0;k < c;k++)
			  {
				 if (a[i][j] == a[i][k])
				 {
					 b[j]++;
				 }
			  }
			  if (b[j] == 1)
			  {
				System.out.printf("%c\n",a[i][j]);
				break;
			  }
		   }
		   for (m = 0;m < c;m++)
		   {
			  if (b[m] == 1)
			  {
				  d = 1;
			  }
		   }
		   if (d == 0)
		   {
			   System.out.print("no\n");
		   }
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		return 0;
	}

}

