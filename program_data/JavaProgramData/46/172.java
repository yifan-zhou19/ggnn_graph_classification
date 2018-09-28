package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int h;
	 int l;
	 int i;
	 int k;
	 int a;
	 int[][] s = new int[H][L];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 h = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 l = Integer.parseInt(tempVar2);
	 }

	 for (i = 0;i < h;i++)
	 {
		 for (k = 0;k < l;k++)
		 {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  (s[i][k]) = Integer.parseInt(tempVar3);
		  }


		 }
	 }
	 if (h <= l)
	 {
			  a = 2 * h - 1;
	 }
			  else
			  {
			  a = 2 * l;
			  }
	 for (i = 0;i < a;i++)
	 {
		  if (i % 4 == 0)
		  {
			 for (k = i / 4;k <= l - 1 - i / 4;k++)
			 {
				 System.out.printf("%d\n",s[i / 4][k]);

			 }
		  }
		  else if (i % 4 == 1)
		  {
			 for (k = i / 4 + 1;k <= h - 1 - i / 4;k++)
			 {
				 System.out.printf("%d\n",s[k][l - 1 - i / 4]);

			 }
		  }
		  else if (i % 4 == 2)
		  {
			 for (k = l - 2 - i / 4;k >= i / 4;k--)
			 {
				 System.out.printf("%d\n",s[h - 1 - i / 4][k]);

			 }
		  }
		  else
		  {
			 for (k = h - 2 - i / 4;k >= (i + 1) / 4;k--)
			 {
				 System.out.printf("%d\n",s[k][i / 4]);

			 }
		  }
	 }
	 return 0;
	}
}

