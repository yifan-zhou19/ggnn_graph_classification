import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int i;
		int j;
		int k;
		int len;
		a = new Scanner(System.in).nextLine();
		len = a.length(); //??????????
		q = a;
		k = 0;
		for (j = 0;j < len;j++)
		{
		   if ((*q >= '0') && (*q <= '9')) //??????????
		   {
				System.out.print(q);
				k = 0;
		   }
		   else if (k == 0) //???????????????????????
		   {
				System.out.print("\n");
				k = 1;
		   }
				q++;
		}

		return 0;
	}

}
