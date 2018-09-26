package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int sum = 0;
	  int len1;
	  int len2;
	  int i;
	  int n;
	  int p = 0;
	  double x;
	  double y;
	  String a1 = new String(new char[501]);
	  String a2 = new String(new char[501]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  x = Double.parseDouble(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a1 = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  a2 = tempVar3.charAt(0);
	  }
	  len1 = a1.length();
	  len2 = a2.length();
	  if (len1 != len2)
	  {
		p = 1;
	  }
	  else
	  {
		for (i = 0;i < len1;i++)
		{
		  if ((a1.charAt(i) != 'A' && a1.charAt(i) != 'T' && a1.charAt(i) != 'C' && a1.charAt(i) != 'G') || (a2.charAt(i) != 'A' && a2.charAt(i) != 'T' && a2.charAt(i) != 'C' && a2.charAt(i) != 'G'))
		  {
			  p = 1;
		  }
		}
	  }
	  if (p != 0)
	  {
		System.out.print("error");
	  }
	  else
	  {
		for (i = 0;i < len1;i++)
		{
		  if (a1.charAt(i) == a2.charAt(i))
		  {
		  sum++;
		  }
		}
		y = 1.0 * sum / len1;
		if (y <= x)
		{
		  System.out.print("no");
		}
		else
		{
		  System.out.print("yes");
		}
	  }
	  return 0;
	}

}

