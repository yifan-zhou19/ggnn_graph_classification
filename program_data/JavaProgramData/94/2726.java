package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int n;
		 int t = 0;
		 int e;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 int[] s = new int[n];
		 for (int i = 1;i <= n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 s[i] = Integer.parseInt(tempVar2);
			 }
			 if (s[i] % 2 == 0)
			 {
				 s[i] = 0;
				 t += 1;
			 }
		 }
		 t = n - t;
		 for (int m = n - 1;m >= 1;m--)
		 {
			 for (int r = 1;r <= m;r++)
			 {
				 if (s[r] > s[r + 1])
				 {
					 e = s[r];
					 s[r] = s[r + 1];
					 s[r + 1] = e;
				 }
			 }
		 }
		 for (int i = n - t + 1;i < n;i++)
		 {
			 System.out.printf("%d,",s[i]);
		 }
		 System.out.printf("%d",s[n]);
		 return 0;
	 }

}

