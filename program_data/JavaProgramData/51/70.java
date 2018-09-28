package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int n;
		int i;
		int j = 0;
		int j2;
		int k = 0;
		int[] a = new int[500];
		int[] c = new int[500];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int t = n;
	  String v = new String(new char[503]);
	  char[][] b = new char[503][30];
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  v = tempVar2.charAt(0);
	  }
	  for (int i = 0;i <= v.length() - 1;i++)
	  {

		 b[k][j] = v.charAt(i);
		 j++;
		 if ((j == n) && (i != v.length() - 1))
		 {
			j = 0;
			i = i - n + 1;
			k++;
		 }
		  else if ((j == n) && (i == v.length() - 1))
		  {
			   break;
		  }
	  }
	 for (int i = 0;i <= v.length() - n;i++)
	 {
		  a[i] = 0;
		  int l = 0;
		 for (int j = 0;j <= v.length() - n;j++)
		 {
			 for (int p = 0;p <= n - 1;p++)
			 {
				if (b[i][p] == b[j][p])
				{
				   l++;
				}
			 }
			 if (l == n)
			 {
				 a[i]++;
				 l = 0;
			 }
			 else
			 {
				 l = 0;
			 }
		 }
	 }
	 for (int i = 0;i <= v.length() - n;i++)
	 {
		   c[i] = a[i];
	 }
	 int e = 0;
	 for (int i = 0;i <= v.length() - n;i++)
	 {
		if (a[i] == 1)
		{
			e++;
		}
	 }
	  if (e == v.length() - n + 1)
	  {
		  System.out.print("NO");
	  }
	 else
	 {

		  e = c[0];
	  for (int i = 0;i <= v.length() - n;i++)
	  {
		if (c[i] > e)
		{
			 e = c[i];
		}

	  }

	  System.out.printf("%d\n",e);
	  int[] m = new int[500];
	  int z = 0;
	  int o = 0;
	  int pa = 1;
	 for (int i = 0;i <= v.length() - n;i++)
	 {
		if (a[i] == e)
		{
			m[z] = i;
			z++;
		}
	 }
	for (int i = 0;i <= z - 1;i++)
	{
		 pa = 1;
	   if (i != 0)
	   {
		   for (int r = i - 1;r >= 0;r--)
		   {

		  if (strcmp(b[m[i]],b[m[r]]) == 0)
		  {
										 pa = 0;
										 break;
		  }
		   }
	   }
	   if (pa != 0)
	   {
		 for (int j2 = 0;j2 <= n - 1;j2++)
		 {
		  System.out.printf("%c",b[m[i]][j2]);
		 }
		 {
			  System.out.print("\n");
	  }
	   }
	}
	 }
	 int y;
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 y = Integer.parseInt(tempVar3);
	 }
	 return 0;
	}
}

