package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 int i;
		 int[] s;
		 int[] r;
		 s = new int[n];
		 r = new int[n];
		 for (i = 0;i < n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 s[i] = Integer.parseInt(tempVar2);
			 }
			 if (s[i] == 0)
			 {
				 r[i] = 60;
			 }
			 else
			 {
				 int j;
				 int[] e;
				 e = new int[s[i]];
				 for (j = 0;j < s[i];j++)
				 {
					 String tempVar3 = ConsoleInput.scanfRead();
					 if (tempVar3 != null)
					 {
						 e[j] = Integer.parseInt(tempVar3);
					 }
				 }
				 if (3 * s[i] + e[j - 1] <= 60)
				 {
					 r[i] = 60 - 3 * s[i];
				 }
				 else if (3 * s[i] + e[j - 1] <= 63 && 3 * s[i] + e[j - 1] >= 57)
				 {
					 r[i] = e[j - 1];
				 }
				 else if (3 * s[i] + e[j - 1] > 60 && 3 * (s[i] - 1) + e[j - 2] <= 63 && 3 * (s[i] - 1) + e[j - 2] >= 57)
				 {
					 r[i] = e[j - 2];
				 }
				 else if (3 * (s[i] - 1) + e[j - 2] <= 57)
				 {
					 r[i] = 60 - 3 * (s[i] - 1);
				 }
				 else if (3 * (s[i] - 1) + e[j - 2] > 60 && 3 * (s[i] - 2) + e[j - 3] < 60)
				 {
					 r[i] = 60 - 3 * (s[i] - 2);
				 }
			 }
		 }
		 for (i = 0;i < n;i++)
		 {
			 System.out.printf("%d\n",r[i]);
		 }
		 return 0;
	 }


}

