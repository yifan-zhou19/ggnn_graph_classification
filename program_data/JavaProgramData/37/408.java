package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String a = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * q;
	  int n;
	  int i;
	  int flag;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  a = new Scanner(System.in).nextLine();
	  k = 0;
	  for (p = a; * p != '\0';p++)
	  {
		  flag = 0;
		   for (q = a; * q != '\0';q++)
		   {
			 if (*q == *p)
			 {
				 flag += 1;
			 }
		   }
			if (flag == 1 && k == 0)
			{
				k += 1;
				System.out.printf("%c\n",*p);
			}
	  }
			if (k == 0)
			{
				System.out.print("no\n");
			}


	  }

	}


}

