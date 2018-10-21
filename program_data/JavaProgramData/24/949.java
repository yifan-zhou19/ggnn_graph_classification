package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = -1;
		int shortlen = 100;
		int longlen = 0;
	  String str = new String(new char[500]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * c;
	  String max;
	  String min;
	  String flag1;
	  String flag2;
	  c = max = min = str;
	  c = new Scanner(System.in).nextLine();

	  do
	  {
		  flag1 = flag2 = c;
		  while (*c != ' ' && *c != '\0')
		  {
			  c++;
		  }

		  if (longlen < c - flag1)
		  {
			  longlen = c - flag1;
			  max = flag1;
		  }
		  if (shortlen > c - flag2)
		  {
			  shortlen = c - flag2;
			  min = flag2;
		  }
		  c++;
	  } while (*(c - 1) != '\0');

	 for (i = 1;i <= longlen;i++)
	 {
	  System.out.printf("%c", max++);
	 }
	 System.out.print("\n");

	 for (i = 1;i <= shortlen;i++)
	 {
		 System.out.printf("%c", min++);
	 }
	}
}
