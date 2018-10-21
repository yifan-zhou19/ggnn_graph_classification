package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String a = new String(new char[501]);
		 int[] m = new int[500];
		 int n;
		 int i;
		 int j;
		 int t;
		 int s;
		 int x = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 a = new Scanner(System.in).nextLine();
		 t = a.length();
		 char[][] k = new char[501][6];
		 for (i = 0;i < t + 1 - n;i++)
		 {
			 for (j = 0;j < n;j++)
			 {
			 k[i][j] = a.charAt(i + j);
			 }
			 m[i] = 0;
		 }
		 for (i = 0;i < t + 1 - n;i++)
		 {
			 for (j = i;j < t + 1 - n;j++)
			 {
				s = strcmp(k[i],k[j]);
				if (s == 0)
				{
					m[i]++;
				}
			 }
			 if (m[i] > x)
			 {
				 x = m[i];
			 }
		 }
		 if (x == 1)
		 {
			 System.out.print("NO");
		 }
		 else
		 {
			 System.out.printf("%d\n",x);
			 for (i = 0;i < t - n;i++)
			 {
				 if (m[i] == x)
				 {
				 System.out.printf("%s\n",k[i]);
				 }
			 }
		 }

	  return 0;
	}






}

