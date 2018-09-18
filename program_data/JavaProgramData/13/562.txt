package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int k;
	 int m;
	 int i;
	 int j;
	 int n;
	 int[] s1 = new int[20000];
	 int[] s2 = new int[20000];
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
		 s1[i] = Integer.parseInt(tempVar2);
	 }
	 }
	 for (i = n - 1,m = 0;i >= 0;i--)
	 {
		 k = 0;
	  for (j = i - 1;j >= 0;j--)
	  {
		  if (s1[i] == s1[j])
		  {
	   k++;
		  }
	  }
	  if (k == 0)
	  {
		  s2[m] = s1[i];
	   m++;
	  }
	 }
	  s2[m] = '\0';
	for (n = m - 1;n > 0;n--)
	{
		System.out.printf("%d ",s2[n]);
	}
	System.out.printf("%d",s2[0]);
	}

}

