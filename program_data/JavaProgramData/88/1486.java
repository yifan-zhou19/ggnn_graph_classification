import java.util.*;

package <missing>;

public class GlobalMembers
{
	//???????
	//??????
	//???2010.12.10

	public static int Main()
	{
		String a = new String(new char[31]);
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = 0;
		int f = 0;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE));

		a = new Scanner(System.in).nextLine();

		p = a; //???p????
		for (i = 1; i <= 30; i++, p++)
		{
			//?????????????????????
			if (((*p < '0') || (*p > '9')) && (f == 1))
			{
				System.out.print("\n");
				f = 0;
			}
			//?????????????????????
			if ((*p >= '0') && (*p <= '9') && (f == 1))
			{
				System.out.print(p);
			}
			if ((*p >= '0') && (*p <= '9') && (f == 0))
			{
				System.out.print(p);
				f = 1;
			}
			//???????
			if (*p == '\0')
			{
				break;
			}
		}

		return 0;
	}

}
