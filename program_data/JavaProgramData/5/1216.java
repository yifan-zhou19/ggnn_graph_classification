package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  double a;
	  double g;
	  int b;
	  int c;
	  int i;
	  int j;
	  int d;
	  int e;
	  int k;
	  int f = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Double.parseDouble(tempVar);
	  }
	  String zfc1 = new String(new char[500]);
	  String zfc2 = new String(new char[500]);
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  zfc1 = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  zfc2 = tempVar3.charAt(0);
	  }
	  b = zfc1.length();
	  c = zfc2.length();
	  for (i = 0;i < b;i++)
	  {
		  if (zfc1.charAt(i) == 'A' || zfc1.charAt(i) == 'T' || zfc1.charAt(i) == 'G' || zfc1.charAt(i) == 'C')
		  {
				d = 0;
		  }
		  else
		  {
			  d = 1;
			  break;
		  }
	  }
	  for (j = 0;j < c;j++)
	  {
		  if (zfc2.charAt(j) == 'A' || zfc2.charAt(j) == 'T' || zfc2.charAt(j) == 'G' || zfc2.charAt(j) == 'C')
		  {
				e = 0;
		  }
		  else
		  {
			  e = 1;
			  break;
		  }
	  }
	  if (b != c || e == 1 || d == 1)
	  {
		  System.out.print("error\n");
	  }
	  else
	  {
		  for (k = 0;k < b;k++)
		  {
		  if (zfc1.charAt(k) == zfc2.charAt(k))
		  {
			  f++;
		  }
		  }
		 g = f * 1.0 / b;
			 if (g > a)
			 {
				 System.out.print("yes\n");
			 }
			 else
			 {
				 System.out.print("no\n");
			 }
	  }

		return 0;
	}

}

