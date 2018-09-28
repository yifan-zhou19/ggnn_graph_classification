import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String test = new String(new char[MAX_LENGTH]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pTest = test;
		test = new Scanner(System.in).nextLine();
		while (true) //??????
		{

			if (*pTest == 0)
			{
				break;
			}

			if (*pTest >= '0' && *pTest <= '9') //????
			{
				System.out.print(pTest);
				if (*(pTest + 1) < '0' || *(pTest + 1)>'9')
				{
					System.out.print("\n");
				}
			}
			pTest++;
		}
		return 0;
	}

}
