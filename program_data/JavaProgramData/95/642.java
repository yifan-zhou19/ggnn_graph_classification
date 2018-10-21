package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  String str1 = new String(new char[Len]);
	  String str2 = new String(new char[Len]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * q;
	  int L1;
	  int L2;
	  int flag = 0;

	  str1 = new Scanner(System.in).nextLine();
	  str2 = new Scanner(System.in).nextLine();
	  L1 = str1.length();
	  L2 = str2.length();

	  for (p = str1, q = str2;p <= str1.Substring(L1) && q <= str2.Substring(L2);p++, q++)
	  {
		  if (*p >= 'a' && *p <= 'z')
		  {
			*p = (char)((int) * p - 32);
		  }
		  if (*q >= 'a' && *q <= 'z')
		  {
			*q = (char)((int) * q - 32);
		  }

		  if (*p == *q)
		  {
			continue;
		  }
		  else if (*p < *q)
		  {
			  flag = 1;
			  break;
		  }
		  else
		  {
			  flag = -1;
			  break;
		  }
	  }
	   if (flag == 0)
	   {
		 System.out.print("=");
	   }
	   else if (flag == 1)
	   {
		 System.out.print("<");
	   }
	   else
	   {
		 System.out.print(">");
	   }


	}


}
