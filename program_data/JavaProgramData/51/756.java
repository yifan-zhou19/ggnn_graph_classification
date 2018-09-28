package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[501]);
		  int n; //b???????????
		  int i;
		  int j;
		  int k = 0;
		  int[] b = new int[250];
		  int t;
		  int s = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = tempVar2.charAt(0);
		  }
		  char[][] c = new char[a.length() - n + 1][n + 1];
		  String d = new String(new char[n + 1]);
		  d = d.substring(0, n);
		  for (i = 0;i <= a.length() - n;i++)
		  {
									 for (j = i;j < n + i;j++)
									 {
									 d = tangible.StringFunctions.changeCharacter(d, j - i, a.charAt(j));
									 }
									 for (j = 0;j < k;j++)
									 {
													 if (strcmp(c[j],d) == 0)
													 {
													 b[j]++;
													 break;
													 }
									 }
									 if (j == k)
									 {
									 c[k] = d;
									 b[k] = 1;
									 k++;
									 }
		  }
		  t = b[0];
		  for (i = 1;i < k;i++)
		  {
						  if (b[i] > t)
						  {
						  t = b[i];
						  }
		  }
		  if (t == 1)
		  {
		  System.out.print("NO");
		  }
		  else
		  {
		  System.out.printf("%d\n",t);
		  for (i = 0;i < k;i++)
		  {
						  if (b[i] == t)
						  {
						  System.out.printf("%s\n",c[i]);
						  }
		  }
		  }
	}
}

