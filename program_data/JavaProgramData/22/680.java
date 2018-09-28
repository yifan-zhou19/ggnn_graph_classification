package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[300];
	  int m1;
	  int m2;
	  int i;
	  int j;
	  int m0;
	  char c;
	  j = 0;
	  for (i = 0;i < 300;i++)
	  {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[i] = Integer.parseInt(tempVar);
		   }
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		j = j + 1;
		if (c != ',')
		{
			i = 300;
		}
	  }
	  m1 = a[0];
	  m2 = -1;
	  for (i = 1;i < j;i++)
	  {
			 if (m2 < a[i] && a[i] < m1)
			 {
		   m2 = a[i];
			 }
		  else if (a[i] > m1)
		  {
			  m0 = m1;
		   m1 = a[i];
		   m2 = m0;
		  }
	  }
	  if (m2 == -1)
	  {
		  System.out.print("No");
	  }
	  else
	  {
		  System.out.printf("%d",m2);
	  }
	}
}

