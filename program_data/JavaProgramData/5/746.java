package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String sz1 = new String(new char[501]);
	  String sz2 = new String(new char[501]);
	  int n;
	  int i;
	  int result = 0;
	  int x = 0;
	  double p;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  p = Double.parseDouble(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  sz1 = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  sz2 = tempVar3.charAt(0);
	  }
	  n = sz1.length();
	  for (i = 0;i < n;i++)
	  {
		if (((sz1.charAt(i) != 'A') && (sz1.charAt(i) != 'T') && (sz1.charAt(i) != 'C') && (sz1.charAt(i) != 'G')) || ((sz2.charAt(i) != 'A') && (sz2.charAt(i) != 'T') && (sz2.charAt(i) != 'C') && (sz2.charAt(i) != 'G')))
		{
		  result = 1;
		  break;
		}
		else if (sz1.charAt(i) == sz2.charAt(i))
		{
		  x++;
		}
	  }
	  if (result == 1)
	  {
		System.out.print("error\n");
	  }
	  else if ((1.0 * x / n) > p)
	  {
		System.out.print("yes\n");
	  }
	  else
	  {
		System.out.print("no\n");
	  }
	  return 0;
	}

}

