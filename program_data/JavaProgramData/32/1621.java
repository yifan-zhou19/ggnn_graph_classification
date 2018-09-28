package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 char[][] a = new char[100][100];
	 char[][] b = new char[100][100];
	 char eat;
	 int i;
	 int ca;
	 int cb;
	 int n;
	 int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (j = 0;j < n;j++)
	 {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[j] = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   b[j] = tempVar3.charAt(0);
	   }


	 }

	 for (j = 0;j < n;j++)
	 {
	   for (i = 0;a[j][i] != '\0';i++)
	   {
		a[j][i] = a[j][i] - '1' + 1;
	   }
	   ca = i - 1;
	   for (i = 0;b[j][i] != '\0';i++)
	   {
		b[j][i] = b[j][i] - '1' + 1;
	   }
	   cb = i - 1;

	for (i = ca;i - ca + cb >= 0;i--)
	{
		 if (a[j][i] < b[j][i - ca + cb])
		 {
		   a[j][i - 1] -= 1;
		   a[j][i] = a[j][i] + 10 - b[j][i - ca + cb];
		 }
		 else
		 {
		  a[j][i] = a[j][i] - b[j][i - ca + cb];
		 }
	}
	   for (i = ca;i >= 1;i--)
	   {
		if (a[j][i] == -1)
		{
		 a[j][i] = 9;
		 a[j][i - 1] -= 1;
		}
	   }
	   for (i = 0;i <= ca;i++)
	   {
		a[j][i] = a[j][i] - 1 + '1';
	   }
	   System.out.printf("%s\n",a[j]);
	 }
	}


}

