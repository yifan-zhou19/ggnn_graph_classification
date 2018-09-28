package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int a;
		 int b;
		 int c;
		 int d;
		 int i;
		 int j;
		 int l;
		 int m;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 int[] f = new int[a];
		 int[] h = new int[a];
		 int[] n = new int[a];
		 int[] k = new int[a];
		 int[] o = new int[a];
		 char[][] g = new char[a][10];
		 for (i = 0;i < a;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 g[i] = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 f[i] = Integer.parseInt(tempVar3);
			 }
		 }
		 j = 0;
		 for (i = 0;i < a;i++)
		 {
			 if (f[i] >= 60)
			 {
						  h[j] = f[i];
						  k[j] = i;
						  j++;
			 }
		 }
		 for (i = 0;i < j;i++)
		 {
			 n[i] = i;
		 }
		 for (i = 0;i < j;i++)
		 {
			 o[i] = i;
		 }
		 for (i = 0;i < j;i++)
		 {
			 for (l = i + 1;l < j;l++)
			 {
				 if (h[n[i]] < h[n[l]])
				 {
								   m = n[i];
								   n[i] = n[l];
								   n[l] = m;

				 }
				 else if (h[n[i]] == h[n[l]] && o[n[i]] > o[n[l]])
				 {
								   m = n[i];
								   n[i] = n[l];
								   n[l] = m;
				 }
			 }
		 }
		for (i = 0;i < j;i++)
		{
			 System.out.printf("%s\n",g[k[n[i]]]);
		}
		 for (i = 0;i < a;i++)
		 {
			 if (f[i] < 60)
			 {
			 System.out.printf("%s\n",g[i]);
			 }
		 }
		 System.in.read();
		 System.in.read();

	}

}

