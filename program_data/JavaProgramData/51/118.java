package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int m = 0;
	 String a = new String(new char[505]);
	 char[][] b = new char[500][5];
	 int[] c = new int[500];
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
	 for (i = 0;i < a.length() - n + 1;i++)
	 {
		 for (j = 0;j < n;j++)
		 {
			 b[i][j] = a.charAt(i + j);
		 }
	 }
	 for (i = 0;i < a.length() - n + 1;i++)
	 {
		 for (j = i;j < a.length();j++)
		 {
			 if (strcmp(b[i],b[j]) == 0)
			 {
			 c[i]++;
			 }
			 if (c[i] > m)
			 {
			 m = c[i];
			 }
		 }
	 }
	 if (m == 1)
	 {
	 System.out.print("NO");
	 }
	 else
	 {
		 System.out.printf("%d\n",m);
		 for (i = 0;i < a.length() - n + 1;i++)
		 {
			 if (c[i] == m)
			 {
			 System.out.printf("%s\n",b[i]);
			 }
		 }
	 }
	 return 0;
	}
}

