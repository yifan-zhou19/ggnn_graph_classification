package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int len;
		int[] a = new int[100];
		int[] s = new int[100];
		int[] re = new int[100];
		int j;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }

		 for (i = 0;i < n;i++)
		 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
		 }

		 for (i = 0;i < n;i++)
		 {
			 if (a[i] == 1 || a[i] == 2)
			 {
			 re[i] = 1;
			 }
			 else
			 {
				 s[0] = 1;
				 s[1] = 1;
			  for (j = 2;j < a[i];j++)
			  {
			  s[j] = s[j - 1] + s[j - 2];
			  }
			  re[i] = s[j - 1];
			 }
		 }

		 for (i = 0;i < n;i++)
		 {
		 System.out.printf("%d\n",re[i]);
		 }

		return 0;
	}
}

