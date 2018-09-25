package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] an = new int[50];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * p;
	int i;
	int t = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * q;
	for (i = 0;;)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		an[i] = Integer.parseInt(tempVar);
	}
	if (an[i] == -1)
	{
		break;
	}
	else
	{
		for (i = 1;;i++)

		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 an[i] = Integer.parseInt(tempVar2);
		 }
		 if (an[i] == 0)
		 {
			 break;
		 }
		}
		 for (p = an; * p != 0;p++)
		 {
		  for (q = an; * q != 0;q++)
		  {
		  if (*q == (*p) * 2)
		  {
			  t++;
		  }
		  }
		 }
		 System.out.printf("%d\n",t);
		 t = 0;
	}
	i = 0;

	}


	return 0;
	}
}

