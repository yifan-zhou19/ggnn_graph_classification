package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[501]);
	  String b = new String(new char[501]);
	  double n;
	  double c;
	  double d;
	  double k = 0;
	  int i;
	  int e = 1;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Double.parseDouble(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead("\n");
	  if (tempVar3 != null)
	  {
		  b = tempVar3.charAt(0);
	  }
	  c = a.length();
	  d = b.length();
	  if (c != d)
	  {
		System.out.print("error");
	  }
	  else if (c == d)
	  {
		for (i = 0;i < c;i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C' || b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C')
			{
			e = 0;
			break;
			}
			else
			{
				if (a.charAt(i) == b.charAt(i))
				{
				k = k + 1;
				}
			}
		}
			 if (e == 0)
			 {
					  System.out.print("error");
			 }
			 else if (k != 0 && (k / c) >= n)
			 {
					  System.out.print("yes");
			 }
			 else if (e == 1 && (k / c) < n)
			 {
					  System.out.print("no");
			 }
	  }
	return 0;
	}

}

