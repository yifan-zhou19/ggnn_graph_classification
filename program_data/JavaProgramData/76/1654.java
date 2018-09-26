package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] s = new int[10000];
	int[] e = new int[10000];
	int i;
	int c = 0;
	int n;
	int[] m = new int[10000];
	int min;
	int max;
	for (int d = 0;d < 10000;d++)
	{
		m[d] = 0;
	}
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int q = 0;q < n;q++)
	{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 s[q] = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 e[q] = Integer.parseInt(tempVar3);
		 }
			 for (i = s[q];i < e[q];i++)
			 {
			 m[i] = 1;
			 }
	}
	min = s[0];
	max = e[0];
	for (int b = 1;b < n;b++)
	{
			 if (s[b] < min)
			 {
				 min = s[b];
			 }
			   if (e[b] > max)
			   {
			   max = e[b];
			   }
	}
	 for (i = min; i < max + 1; i++)
	 {
				 c = c + m[i];
	 }
			 if (c == max - min)
			 {
			  System.out.printf("%d %d", min,max);
			 }
			 else
			 {
				 System.out.print("no");
			 }
	return 0;
	}
}

