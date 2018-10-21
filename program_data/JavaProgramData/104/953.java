package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = int n;
	 int a;
	 int b;
	 int j;
	 int i;
	 int[] s1 = new int[100];
	 int[] s2 = new int[100];
	 int[] s3 = new int[100];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 b = Integer.parseInt(tempVar2);
	 }

	 for (s1[0] = a,i = 0;s1[i] != 1;i++)
	 {
		s1[i + 1] = f(s1[i]);
	 }
	 for (j = i;j >= 0;j--)
	 {
		 s2[i - j] = s1[j];
		 s1[j] = 0;
	 }

	 for (s1[0] = b,i = 0;s1[i] != 1;i++)
	 {
		s1[i + 1] = f(s1[i]);
	 }
	 for (j = i;j >= 0;j--)
	 {
		 s3[i - j] = s1[j];
		 s1[j] = 0;
	 }

	 for (i = 0;;i++)
	 {
		 if (s2[i] != s3[i])
		 {
		 System.out.printf("%d\n",s2[i - 1]);
		 break;
		 }
	 }
	 return 0;
	}
	public static int f(int n)
	{
		int i;
		int t = 1;
		int m;
	   for (i = 0;;i++)
	   {
		   t = 2 * t;
	   if (t > n)
	   {
		   t = t / 2;
		   break;
	   }
	   }
	  m = t / 2 + (n - t) / 2;
	  return m;
	}

}

