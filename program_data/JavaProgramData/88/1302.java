package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int maxn = 31;
	  String c = new String(new char[maxn]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * p;

	  c = new Scanner(System.in).nextLine();
	  p = c;
	  while (*p != '\0')
	  {
		if (*p >= 48 && *p < 58)
		{
			do
			{
			   System.out.print(p);
			p++;
			}while (*p > 47 && *p < 58);
		  System.out.print("\n");
		}
		else
		{
			p++;
		}
	  }

	  return 0;
	}
}
