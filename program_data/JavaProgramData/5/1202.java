package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[501]);
	  String b = new String(new char[501]);
	  int x;
	  int y;
	  int i;
	  int s = 0;
	  int q = 0;
	  double n;
	  double t;
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
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b = tempVar3.charAt(0);
	  }
		x = a.length();
		y = b.length();
		if (x != y)
		{
		System.out.print("error");
		}
		else
		{
			for (i = 0;i < x;i++)
			{
				if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
				{
				   System.out.print("error");
				   return 0;
				}
		if (a.charAt(i) == b.charAt(i))
		{
			s++;
		}
			}
					t = n * x;
					if (s > t)
					{
						System.out.print("yes");
					}
					else
					{
						System.out.print("no");
					}
		}



						   return 0;



	}
}

