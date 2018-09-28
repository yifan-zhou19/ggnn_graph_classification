import java.util.*;

package <missing>;

public class GlobalMembers
{
	//??????
	//???
	//1000010098
	public static int Main()
	{
		String a = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * arr = a.Substring(1);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * j = null;
		a = new Scanner(System.in).nextLine();
		for (; * arr != '\0'; arr++)
		{
			if (*arr == ' ')
			{
				j = ++arr;
				while (*j == ' ')
				{
				j++;
				}
				arr = j;
			}
		}
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}


}
