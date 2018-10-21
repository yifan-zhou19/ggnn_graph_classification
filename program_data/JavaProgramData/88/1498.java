import java.util.*;

package <missing>;

public class GlobalMembers
{
	//???2010?12?8?

	//???1000010586_???

	//???????

	public static int Main()
	{
		int i;
		String str = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		str = new Scanner(System.in).nextLine();
		p = str;
		for (; * p != '\0' ; p++)
		{
			if (*p >= '0' && *p <= '9')
			{
				for (i = 0 ; * (p + i) != '\0' ; i++)
				{
					if (*(p + i) < '0' || *(p + i) > '9')
					{
						p = p + i;
						System.out.print("\n");
						break;
					}
					System.out.print((p + i));
					if (*(p + i + 1) == '\0')
					{
						p = p + i;
						System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}


}
