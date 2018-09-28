package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int k;
	  int num = 0;
	  int len1;
	  int len2;
	  int pos = 0;
	  int lea;
	  double rate;
	  String a = new String(new char[500]);
	  String b = new String(new char[500]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  rate = Double.parseDouble(tempVar);
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
	  len1 = a.length();
	  len2 = b.length();
	  if (len1 != len2)
	  {
		System.out.print("error");
	  }
	  else
	  {
		for (k = 0;a.charAt(k) != '\0';k++)
		{
		 if (a.charAt(k) != 'A' && a.charAt(k) != 'T' && a.charAt(k) != 'C' && a.charAt(k) != 'G')
		 {
		  pos = 0;
		  break;
		 }
		  else if (b.charAt(k) != 'A' && b.charAt(k) != 'T' && b.charAt(k) != 'C' && b.charAt(k) != 'G')
		  {
		  pos = 0;
		  break;
		  }
		  else
		  {
		   pos = 1;
			if (a.charAt(k) == b.charAt(k))
			{
		  num++;

			}
		  }
		}
	   if (pos == 1)
	   {
		 if (1.0 * num / len1 > rate)
		 {
		  System.out.print("yes");
		 }
		 else
		 {
		  System.out.print("no");
		 }
	   }

	   else
	   {
		  System.out.print("error");
	   }
	  }
	 return 0;
	}
}

