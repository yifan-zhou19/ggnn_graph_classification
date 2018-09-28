package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[50]);
	 String b = new String(new char[50]);
	 int i;
	 int j;
	 int k;
	 int m = 0;
	 int p = 0;
	 int d = 1;
	 int[] n = new int[50];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 b = tempVar2.charAt(0);
	 }
	  for (j = 0;b.charAt(j) != '\0';j++)
	  {
		if (a.charAt(0) == b.charAt(j))
		{
		  m++;
		}
	  }
	  n[0] = 0;
	  for (i = 1;i < m + 1;i++)
	  {
	   for (j = n[i - 1];b.charAt(j) != '\0';j++)
	   {
		if (a.charAt(0) == b.charAt(j) && d == 1)
		{
		   n[i] = j;
		  d = 0;
		}
	   }
	  }
	 for (k = 1;k < m + 1;k++)
	 {
	  for (i = 0;a.charAt(i) != '\0';i++)
	  {
		  if (a.charAt(i) == b.charAt(n[k] + i))
		  {
			p++;
		  }
	  }
	  if (p == a.length())
	  {
		  System.out.printf("%d",n[k]);
	  }
	 }
	 return 0;
	}


}

