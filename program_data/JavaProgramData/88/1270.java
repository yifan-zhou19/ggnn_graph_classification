package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int flag; //????
		String a = new String(new char[40]); //?????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		a = new Scanner(System.in).nextLine(); //?????
		p = a;
		while (true) //??????????
		{
			if (*p == null)
			{
				break;
			}
			if (*p >= '0' && *p <= '9') //????
			{
				System.out.print(p++);
				flag = 1;
			}
			else if (flag == 1) // ??????????
			{
				System.out.print("\n");
				p++;
				flag = 0;
			}
			else //????????
			{
				p++;
			}
		}
		System.out.print("\n");
		return 0;
	}


}
