package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int n;
		 int m;
		 int h;
		 int l;
		 int i;
		 int e;
		 int a;
		 char[][] s = new char[200][200];
		 char[][] w = new char[200][200];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (h = 0;h < n;h++)
		 {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 s[h] = tempVar2.charAt(0);
				 }
		 }
		 for (h = 0;h < n;h++)
		 {
			 for (l = 0;l < n;l++)
			 {
				 w[h + 1][l + 1] = s[h][l];
			 }
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 m = Integer.parseInt(tempVar3);
		 }
		 for (e = 1;e < m;e++)
		 {
			 for (h = 1;h < n + 1;h++)
			 {
				 for (l = 1;l < n + 1;l++)
				 {
				 if (w[h][l] == '@')
				 {
					 w[h][l] = '^';
				 }
				 }
			 }
		   for (h = 1;h < n + 1;h++)
		   {
				 for (l = 1;l < n + 1;l++)
				 {
				 if (w[h][l] == '^')
				 {
					 if (w[h - 1][l] == '.')
					 {
						 w[h - 1][l] = '@';
					 }
					 if (w[h + 1][l] == '.')
					 {
						 w[h + 1][l] = '@';
					 }
					 if (w[h][l - 1] == '.')
					 {
						 w[h][l - 1] = '@';
					 }
					 if (w[h][l + 1] == '.')
					 {
						 w[h][l + 1] = '@';
					 }
						 w[h][l] = '@';
				 }
				 }
		   }
		 }
		 a = 0;
		 for (h = 1;h < n + 1;h++)
		 {
			 for (l = 1;l < n + 1;l++)
			 {
				 if (w[h][l] == '@')
				 {
					 a++;
				 }
			 }
		 }
			  System.out.printf("%d\n",a);



		return 0;
	 }

}

