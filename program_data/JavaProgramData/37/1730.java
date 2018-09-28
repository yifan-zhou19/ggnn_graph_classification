package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  int j;
		  int k;
		  int[] a = new int[100000];
		  final String s = "";
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }

		  for (i = 0;i < n;i++)
		  {
			  for (int xunhuan = 0;xunhuan < 100000;xunhuan++)
			  {
		   s = tangible.StringFunctions.changeCharacter(s, xunhuan, '\0');
			  }
		   for (int xunhuan = 0;xunhuan < 100000;xunhuan++)
		   {
		   a[xunhuan] = 0;
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   s = tempVar2.charAt(0);
		   }
		   int nei = 0;
		   while (nei < 100000)
		   {
			   if (s.charAt(nei + 1) == '\0')
			   {
				m = nei;
			 break;
			   }
			nei++;
		   }

			for (j = 0;j <= m;j++)
			{
				for (k = 0;k <= m;k++)
				{
				 if (s.charAt(j) == s.charAt(k))
				 {
			  a[j]++;
				 }
				}
			}

		   for (j = 0;j <= m;j++)
		   {
			   if (a[j] == 1)
			   {
				System.out.printf("%c\n",s.charAt(j));
			 break;
			   }
			if (j == m && a[m] != 1)
			{
			System.out.print("no\n");
			}
		   }
		  }

	}
}

