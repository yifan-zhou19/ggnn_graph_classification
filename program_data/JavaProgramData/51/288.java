package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[501]);
	 char[][] b = new char[501][5];
	 int[] c = new int[501];
	 int n;
	 int i;
	 int l;
	 int j;
	 int p;
	 int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 a = new Scanner(System.in).nextLine();
	 l = a.length();
	 for (i = 0;i < l;i++)
	 {
	  c[i] = 1;
	 }
	 for (i = 0;i < l;i++)
	 {
	  for (j = 0;j < n;j++)
	  {
	   b[i][j] = a.charAt(i + j);
	  }
	  b[i][j] = '\0';
	  for (p = 0;p < i && strcmp(b[p],b[i]) != 0;p++)
	  {
	  }
	  if (p < i)
	  {
		  c[p]++;
	  }
	 }
	 k = c[0];
	 for (i = 0;i < l;i++)
	 {
	  if (c[i] > k)
	  {
		  k = c[i];
	  }
	 }
	 if (k == 1)
	 {
		 System.out.print("NO");
	 }

	 else
	 {
		 System.out.printf("%d\n",k);
	 for (i = 0;i < l;i++)
	 {
	  if (c[i] == k)
	  {
		  System.out.printf("%s\n",b[i]);
	  }
	 }
	 }
	 return 0;
	}
}

