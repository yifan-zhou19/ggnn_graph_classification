package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  String s1 = new String(new char[50]);
	  String s2 = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * p2;
	  int i = 0;
	  int j;
	  int lens1;
	  int lens2;
	  int n;
	  int x = 0;
	  int y = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s1 = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  s2 = tempVar2.charAt(0);
	  }
	  p1 = s1;
	  p2 = s2;
	  lens1 = s1.length();
	  lens2 = s2.length();
	  n = lens2 - lens1 + 1;
	  for (i = 0;i < n;i++)
	  {
		  p2 = s2;
		  p2 += i;
		  x = 0;
		  for (p1 = s1; * p1 != '\0' && *p2 != '\0';p1++, p2++)
		  {
			  if (*p1 == *p2)
			  {
				  x += 1;
			  }
			  else
			  {
				  x += 0;
			  }
		  }
		  if (x == lens1)
		  {
			  y = i;
			  break;
		  }
	  }
	  System.out.printf("%d",y);

	}

}

