package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String s = new String(new char[1000]);
	 String sub = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * ptr;
	 int i;
	 int j;
	 int mark = 0;
	 s = new Scanner(System.in).nextLine();
	 ptr = s;
	 for (; * ptr != 0;)
	 {
		 if (*ptr == ' ')
		 {
			 ptr++;
			 continue;
		 }
		/* get a word from s */
	  for (i = 0; i < 100; i++)
	  {
		  sub = sub.substring(0, i);
	  }

	  for (i = 0 ; ; ptr++, i++)
	  {
		   sub = tangible.StringFunctions.changeCharacter(sub, i, *ptr);
		   if (((sub.charAt(i) == ' ') || (sub.charAt(i) == 0)) && (mark == 0))
		   {
			  sub = sub.substring(0, i);
			  System.out.printf("%d",sub.length());
			  mark = 1;
			  break;
		   }
		   if (((sub.charAt(i) == ' ') || (sub.charAt(i) == 0)) && (mark != 0))
		   {
			  sub = sub.substring(0, i);
			  System.out.printf(",%d",sub.length());
			  break;
		   }
	  }
		if (*ptr == 0)
		{
			break;
		}
		else
		{
			ptr++;
		}
	 }
	 return;
	}
}

