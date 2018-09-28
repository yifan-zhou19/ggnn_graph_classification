package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[100000]);
	int t0;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}
	for (t0 = 1;t0 <= t;t0++)
	{
	  int i;
	  int j1;
	  int j2;
	  int k;
	  int m = 0;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  s = tempVar2.charAt(0);
	  }
	  k = s.length();
	  int[] a = new int[k];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(a,0,4 * k);
	  for (j1 = 0;j1 < k;j1++)
	  {
			for (j2 = 0;j2 < k;j2++)
			{
				if (s.charAt(j2) == s.charAt(j1))
				{
					a[j1]++;
				}
			}
	  }

	  for (i = 0;i < k;i++)
	  {
			if (a[i] == 1)
			{
				  m++;
				  break;
			}
	  }

	  if (m == 0)
	  {
		  System.out.print("no\n");
	  }
	  else
	  {
		  System.out.printf("%c\n",s.charAt(i));
	  }
	}
	}

}

