package <missing>;

public class GlobalMembers
{
	/************************/
	/*    ???????    */
	/*    ??? pyyaoer    */
	/*   ??  2011.12.4    */
	/************************/
	public static int Main()
	{
		String c = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null; //?????
		p = c;
		c = new Scanner(System.in).nextLine();
		for (; * p != '\0';p++) //???????????
		{
			if (*p == ' ') //?????????????
			{
				System.out.print(" ");
				for (; * p == ' ';p++)
				{
				} //???????
				p--;
			}
			else
			{
				System.out.print(p);
			}
		}
		System.out.print("\n");
		return 0;
	}
}
