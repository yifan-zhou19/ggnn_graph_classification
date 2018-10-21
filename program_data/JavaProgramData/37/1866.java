package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int p;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (p = 1;p <= n;p++)
		  {
		  String a = new String(new char[100000]);
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = tempVar2.charAt(0);
		  }
		  int i;
		  int j;
		  int k;
		  int m = 0;
		  int q;
		  int w;
		  int r;
		  int t = 0;
		  int[][] b = new int[26][2];
		  int[] c = new int[26];
		  for (i = 0;a.charAt(i) != '\0';i++)
		  {
								 j = a.charAt(i) - 97;
								 b[j][0]++;
								 if (b[j][0] == 1)
								 {
								 b[j][1] = i + 1;
								 }
		  }
		  for (k = 0;k < 26;k++)
		  {
		  if (b[k][0] == 1)
		  {
		  c[m] = b[k][1];
		  m++;
		  }
		  }
		  if (m == 0)
		  {
				  System.out.print("no\n");
		  return 0;
		  }
		  for (q = 0;q < m - 1;q++)
		  {
		  if (c[q] < c[q + 1])
		  {
		  c[q + 1] = c[q];
		  }
		  }
		  for (w = 0;w < 26;w++)
		  {
		  if (c[q] == b[w][1])
		  {
		  System.out.printf("%c\n",w + 97);
		  break;
		  }
		  }
		  }
	}
}

