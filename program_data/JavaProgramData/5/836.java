package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int t;
	  int e;
	  int i;
	  int z;
	  e = 0;
	  double x;
	  double y;
	  double k;
	  double h;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Double.parseDouble(tempVar);
	  }
	  String a = new String(new char[510]);
	  String b = new String(new char[510]);
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
	  t = a.length();
	  if (a.length() != b.length())
	  {
		System.out.print("error");
	  }
	  else
	  {
		 for (i = 0;a.charAt(i) != '\0';i++)
		 {
		   if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C')
		   {
			   z++;
		   }
			  else if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C')
			  {
				z++;
			  }
			  else if (a.charAt(i) == b.charAt(i))
			  {
				  e++;
			  }
		 }
		 if (z != 0)
		 {
		   System.out.print("error");
		 }
		 else
		 {
		 x = e;
		 y = t;
		 h = x / y;
		 if (h > k)
		 {
		   System.out.print("yes");
		 }
		else
		{
			System.out.print("no");
		}
		 }
	  }
	  return 0;
	}

}

