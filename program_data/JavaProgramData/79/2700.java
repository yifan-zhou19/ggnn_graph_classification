package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] n = new int[10000];
	int[] m = new int[10000];
	int i;
	int s;
	for (int q = 0;q < 10000;q++)
	{
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n[q] = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m[q] = Integer.parseInt(tempVar2);
		 }
		 if (n[q] == 0 && m[q] == 0)
		 {
			 break;
		 }
		 else if (n[q] != 0 && m[q] != 0)
		 {
			 s = 0;
			 for (i = 2; i <= n[q]; i++)
			 {
				 s = (s + m[q]) % i;
			 }
			  System.out.printf("%d\n", s + 1);
		 }
	}
	return 0;
	}
}

