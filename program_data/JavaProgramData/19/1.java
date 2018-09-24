package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String buf1 = new String(new char[100]);
	  String buf2 = new String(new char[100]);
	  String buf3 = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * tmp;
	  buf1 = new Scanner(System.in).nextLine();
	  buf2 = new Scanner(System.in).nextLine();
	  buf3 = new Scanner(System.in).nextLine();
	  tmp = buf1;
	  while ((*tmp) != 0)
	  {
		if (strncmp(tmp, buf2, buf2.length()) == 0)
		{
		  if ((tmp == buf1 || *(tmp - 1) == ' '))
		  {
			System.out.printf("%s", buf3);
			tmp += buf2.length();
		  }
		  else
		  {
			System.out.printf("%c", *tmp);
			++tmp;
		  }
		}
		else
		{
		  System.out.printf("%c", *tmp);
		  ++tmp;
		}
	  }
	  return 0;
	}

}
