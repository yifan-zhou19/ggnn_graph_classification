package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int bisai(int a, int b, int c, int d);

	public static int Main()
	{
		int n;
		int[] t = new int[1000];
		int[] q = new int[1000];
		int i = 0;
		int k = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int w = 0;
		int p = 0;
		int l = 0;
		int m = 0;
		do
		{
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 n = Integer.parseInt(tempVar);
			 }
			 if (n == 0)
			 {
			 break;
			 }
			 for (i = 0;i < n;i++)
			 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 t[i] = Integer.parseInt(tempVar2);
			 }
			 }
			 for (a = 0;a < n - 1;a++)
			 {
				 for (b = 0;b < n - a - 1;b++)
				 {
					 if (t[b] < t[b + 1])
					 {
						 c = t[b];
						 t[b] = t[b + 1];
						 t[b + 1] = c;
					 }
				 }
			 }
			 for (i = 0;i < n;i++)
			 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 q[i] = Integer.parseInt(tempVar3);
			 }
			 }
			 for (a = 0;a < n - 1;a++)
			 {
				 for (b = 0;b < n - a - 1;b++)
				 {
					 if (q[b] < q[b + 1])
					 {
						 c = q[b];
						 q[b] = q[b + 1];
						 q[b + 1] = c;
					 }
				 }
			 }
			 i = n - 1;
			 for (k = 0;k < n;k++)
			 {
				 if (t[i] > q[i])
				 {
					 w = w + 1;
					 i = i - 1;
					 continue;
				 }
				 if (t[i] < q[i])
				 {
					 l = l + 1;
					 for (int o = 0;o < i;o++)
					 {
					 q[o] = q[o + 1];
					 }
					 i = i - 1;
					 continue;
				 }
				 if (t[i] == q[i])
				 {
					 if (t[0] > q[0])
					 {
						 w = w + 1;
						 for (int o = 0;o < i;o++)
						 {
							 q[o] = q[o + 1];
							 t[o] = t[o + 1];
						 }
						 i = i - 1;
						 continue;
					 }
					 if (t[0] < q[0])
					 {
						 l = l + 1;
						 for (int o = 0;o < i;o++)
						 {
						 q[o] = q[o + 1];
						 }
						 i = i - 1;
						 continue;
					 }
					 if (t[0] == q[0])
					 {
						 if (t[0] == t[i])
						 {
						 continue;
						 }
						 else
						 {
							 l = l + 1;
							 for (int o = 0;o < i;o++)
							 {
							 q[o] = q[o + 1];
							 }
							 i = i - 1;
							 continue;
						 }
					 }
				 }
			 }
			 m = 200 * w - 200 * l;
			 System.out.printf("%d\n",m);
			 w = 0;
			 l = 0;
			 p = 0;
			 m = 0;
		} while (n != 0);
		return 0;
	}

}

