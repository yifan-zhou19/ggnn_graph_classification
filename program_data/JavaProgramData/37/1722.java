package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int t;
	int i;
	int j;
	int k;
	int l;
	int m;
	int n;
	int[] b = new int[100000];
	String a = new String(new char[100000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= t;i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a = tempVar2.charAt(0);
	 }
	 l = a.length();
	 for (j = 0;j < l;j++)
	 {
	  b[j] = 0;
	 }
	 for (j = 0;j < l;j++)
	 {
	  for (k = 0;k < l;k++)
	  {
	   if (j == k)
	   {
		   continue;
	   }
	   if (a.charAt(j) == a.charAt(k))
	   {
		   b[j]++;
	   }
	  }
	 }
	  for (j = 0;j < l;j++)
	  {
	  if (b[j] == 0)
	  {
		  System.out.printf("%c\n",a.charAt(j));
		  break;
	  }
	  else
	  {
		  m = j;
	  }
	  }
	  if (m == l - 1)
	  {
		  System.out.print("no\n");
	  }
	}

	}

}

