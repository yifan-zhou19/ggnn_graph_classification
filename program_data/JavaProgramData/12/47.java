package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int[] z = new int[15];
		 int[] r = new int[100];
		 int i;
		 int j;
		 int l;
		 int sum = 0;
		 for (i = 0;;i++)
		 {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 z[i] = Integer.parseInt(tempVar);
			 }
			 if (z[i] == 0)
			 {
				 r[sum] = 0;
				 for (j = 0;j < i - 1;j++)
				 {
					 for (l = j + 1;l < i;l++)
					 {
						 if (z[j] == 2 * z[l] || z[j] == 0.5 * z[l])
						 {
							 r[sum]++;
						 }
					 }
				 }
				sum++;
				i = -1;
			 }
			 else if (z[i] == -1)
			 {
				 break;
			 }
		 }
		 for (i = 0;i < sum;i++)
		 {
			 System.out.printf("%d\n",r[i]);
		 }
		 return 0;
	 }
}

