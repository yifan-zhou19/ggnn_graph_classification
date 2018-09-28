import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*???:????
	**???:??
	**?  ?:2010?12?10?
	*/
	public static int Main()
	{
		String str = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int sum; //?????????
		str = new Scanner(System.in).nextLine();
		for (q = str; * q != '\0'; q++) //??
		{
			sum = 0;
			if (*q >= '0' && *q <= '9') //????
			{
				sum += *q - '0';
				for (p = q + 1; * p <= '9' && *p >= '0'; p++) //?????,???????????'\0'
				{
					sum = sum * 10 + *p - '0'; //????
				}
				System.out.print(sum);
				System.out.print("\n");
				if (*p == '\0')
				{
					break; //?????,???
				}
				q = p; //??????????,????????????????
			}
		}
		return 0;
	}
}
