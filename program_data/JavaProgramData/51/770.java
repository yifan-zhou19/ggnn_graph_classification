package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int n;
		 int y = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 String a = new String(new char[500]);
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a = tempVar2.charAt(0);
		 }
		 int[] b = new int[500];
		 int s = a.length();
		 for (int i = 0;i < s - n + 1;i++)
		 {
			 b[i] = 1;
			 for (int d = 1;d < s;d++)
			 {
			 int m = 0;
			 int t;
			 for (t = i;t < i + n;t++)
			 {
			 if (a.charAt(t) == a.charAt(t + d))
			 {
			 m++;
			 }
			 }
				   if (m == n)
				   {
				   b[i]++;
				   }
			 }
		 }
		 for (int e = 0;e < s - n;e++)
		 {
				 int f;
				 int w = 0;
				 for (f = 0;f < s - n;f++)
				 {
						 if (b[e] < b[f])
						 {
							 ;
						 }
						 else
						 {
							 w++;
						 }
				 }
				 if (w == s - n)
				 {

						   if (b[e] > 1)
						   {
							   y++;
						   if (y == 1)
						   {
						   System.out.printf("%d\n",b[e]);
						   }
						   for (int p = 0;p < n;p++)
						   {
							   System.out.printf("%c",a.charAt(e + p));
						   }
						   System.out.print("\n");
						   }
						   else
						   {
							   System.out.print("NO\n");
							   break;
						   }
				 }
		 }

	 }
}

