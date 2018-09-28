package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);


		int i;
		int j;
		int k;

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

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1 = s1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2 = s2;
		String tt;

		k = 0;
		while (*p2 != '\0')
		{
		   if (*p1 != *p2)
		   {
			  p1 = s1;
			  p2 = p2 - k + 1;
			  k = 0;
		   }
		   else
		   {

				p1++;
				p2++;
				k++;
		   }

		   if (*p1 == '\0')
		   {

			   break;
		   }
		}

		tt = s2;
		System.out.printf("%d",p2 - s2 - s1.length());

		return 0;
	}
}

