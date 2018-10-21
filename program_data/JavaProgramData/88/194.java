package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p3;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (String)malloc(120);
		p1 = new Scanner(System.in).nextLine();
		for (p2 = p1; * p2;p2++)
		{
			if ((*p2) >= '0' && (*p2) <= '9') //??????0~9???
			{
				for (p3 = p2;(int)(*p3) - '0' >= 0 && (int)(*p3) - '0' <= 9;p3++) //??????????
				{
				System.out.printf("%c",*p3);
				}
				System.out.print("\n");
				p2 = p3; //???????
				p2--;
			}
		}
	}
}
