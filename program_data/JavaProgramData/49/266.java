package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[500]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p1;
	int i;
	int j;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	n = a.length();

	for (i = 2;i <= n;i++)
	{
		  for (p = a;p <= a.Substring(n) - i;p++)
		  {
			  for (p1 = p;p1 < p + i;p1++)
			  {
				   if (*p1 != *(p + (p + i - p1 - 1)))
				   {
					break;
				   }
			  }
			  if (p1 == p + i)
			  {
					  for (j = 0;j < i;j++)
					  {
						  System.out.printf("%c",*(p + j));
					  }
					System.out.print("\n");
			  }
		  }
	}
	return 0;
	}


}

