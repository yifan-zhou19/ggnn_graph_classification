package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int l;
	  int r = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * q;
	  String a = new String(new char[100]);
	  String b = new String(new char[100]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  b = tempVar2.charAt(0);
	  }
	  if (a.length() != b.length())
	  {
		  System.out.print("NO");
	  }
	  else
	  {
		l = a.length();
		for (p = a;p < a.Substring(l);p++)
		{
		  for (q = b;q < b.Substring(l);q++)
		  {
			if (*p == *q)
			{
			  r++;
			  *q = 0;
			  break;
			}
		  }
		}
		if (r == l)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	  }
	}
}

