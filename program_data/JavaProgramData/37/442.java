package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int t;
		  int i;
		  int j;
		  int n;
		  String c = new String(new char[1]);
		  c = new Scanner(System.in).nextLine();
		  t = Integer.parseInt(c);
		  char[][] a = new char[2][100000];
		  int[] b = new int[26];
		  for (i = 0;i < t;i++)
		  {
						  a[0] = new Scanner(System.in).nextLine();
						  n = String.valueOf(a[0]).length();
						  for (j = 0;j < 26;j++)
						  {
						  b[j] = 0;
						  }
						  for (j = 0;j < n;j++)
						  {
										  int k;
										  k = a[0][j] - 'a';
										  b[k]++;
						  }
						  for (j = 0;j < n;j++)
						  {
										  if (b[a[0][j] - 'a'] == 1)
										  {
											  break;
										  }
						  }
										  if (j == n)
										  {
											  System.out.print("no\n");
										  }
										  else
										  {
											  System.out.printf("%c\n",a[0][j]);
										  }
		  }

		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}


}
