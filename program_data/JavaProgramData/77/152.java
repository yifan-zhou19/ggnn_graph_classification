package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String c = new String(new char[100]);
	  char sex;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  c = tempVar.charAt(0);
	  }
	  int i;
	  int j;
	  int k = 0;
	  int[] x = new int[100];
	  int[] y = new int[100];
	  int a;
	  int b;
	  int n;
	  n = c.length();
	  sex = c.charAt(0);
	  for (i = n;i >= 0;i--)
	  {
		  a = 0;
		  b = 0;
		  if (c.charAt(i) != sex)
		  {
				 for (j = i;j >= 0;j--)
				 {
					  if (c.charAt(j) == sex)
					  {
						   a++;
					  }
					  else
					  {
						  b++;
					  }
					  if (a == b)
					  {
							  x[k] = j;
							  y[k] = i;
							  k++;
							  break;
					  }
				 }
		  }
	  }
	  for (i = k - 1;i >= 0;i--)
	  {
		   System.out.printf("%d %d\n",x[i],y[i]);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  return 0;
	}
}

