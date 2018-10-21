package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	 int N;
	 int i = 0;
	 int k = 0;
	 int j = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 N = Integer.parseInt(tempVar);
	 }
	 int[] s = new int[N];
	 while (i < N)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  s[i] = Integer.parseInt(tempVar2);
	  }
	  i = i + 1;
	 }
	 i = 0;
	 while (i < N)
	 {
	  if (s[i] % 2 == 1)
	  {
	   k = k + 1;
	  }
	  i = i + 1;
	 }
	 i = 0;
	 int[] m = new int[k];
	 while (i < N)
	 {
	  if (s[i] % 2 == 1)
	  {
	   m[j] = s[i];
	   j = j + 1;
	  }
	  i = i + 1;
	 }
	 j = 0;
	 i = 0;
	 int zhan;
	 while (i < k)
	 {
	  while (j < k - 1)
	  {
	   if (m[j] < m[j + 1])
	   {
		   zhan = m[j];
		   m[j] = m[j + 1];
		   m[j + 1] = zhan;
	   }
	   j = j + 1;
	  }
	 j = 0;
	 i = i + 1;
	 }
	 j = k - 2;
	 System.out.printf("%d",m[k - 1]);
	 while (j != -1)
	 {
	  System.out.printf(",%d",m[j]);
	  j = j - 1;
	 }
	 return 0;
	 }
}

