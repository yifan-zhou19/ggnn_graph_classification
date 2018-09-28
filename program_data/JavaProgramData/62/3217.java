package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[266]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * a;
		String k;
		int n;
		int i;
		int j;
		int s;
		int c = 0;
		zfc = new Scanner(System.in).nextLine();
		s = zfc.length();
		for (i = 0;i < s;i++)
		{
				for (a = zfc; * a != '\0';a++)
				{
						if (*(a - 1) == ' ' && *a == ' ')
						{
								for (a = a; * a != '\0';a++)
								{
									*a = (a + 1);
								}
						}
				}
		}
		System.out.println(zfc);
		return 0;
	}




}
