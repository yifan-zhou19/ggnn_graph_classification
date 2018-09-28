package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int flag = 1;
		String str = new String(new char[81]);
		String num = new String(new char[15]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ptr;
		num = new Scanner(System.in).nextLine();
		n = Integer.parseInt(num);
		for (i = 0;i < n;i++)
		{
						 flag = 1;
						 str = new Scanner(System.in).nextLine();
						 ptr = str;
						 if (*ptr != '_' && (*ptr > 90 || *ptr < 65) && (*ptr>122 || *ptr < 97))
						 {
									  System.out.print("0\n");
									  flag = 0;
						 }
						 else
						 {
							   for (ptr = str.Substring(1); * ptr != '\0';ptr++)
							   {
														if (*ptr != '_' && (*ptr > 57 || *ptr < 48) && (*ptr>90 || *ptr < 65) && (*ptr>122 || *ptr < 97))
														{
														System.out.print("0\n");
														flag = 0;
														break;
														}
							   }
						 }
						 if (flag != 0)
						 {
							 System.out.print("1\n");
						 }
		}
		return 0;
	}

}
