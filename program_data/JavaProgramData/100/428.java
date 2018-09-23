package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		final String a = "abcdefghijklmnopqrstuvwxyz";
		String b = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * x;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * y;
		int[] n = new int[26];
		int i;
		int j = 0;
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0,x = a; * x != '\0';x++,i++)
		{

			  for (y = s,n[i] = 0; * y != '\0';y++)
			  {
				  if (*y == *x)
				  {
					  n[i]++;
				  }
			  }
			  if (n[i] > 0)
			  {
				  System.out.printf("%c=%d\n",*x,n[i]);
			  }
			  j += n[i];
		}
		if (j == 0)
		{
			System.out.print("No");
		}

		return 0;
	}
}

