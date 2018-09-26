import java.util.*;

package <missing>;

public class GlobalMembers
{
	//****************************************************** 
	//* ? ? ?   ?? ? ? ? ? ? ?                  *
	//* ? ?      ?? ? ?                              *
	//* ? ? ? ??2010 ? 12 ? 8 ?                    * 
	//* ? ?      ?1000010185                            *
	//****************************************************** 
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a; // ??p?????a????
		for (; * p != '\0'; p++) // ??p???????a
		{
			if (*p == ' ' && *(p + 1) == ' ') // ????????
			{
				for (char * q = p + 1; q != '\0'; q++) // ????????????????????????
				{
					q = *(q + 1);
				}
				p -= 1; // ???????????
			}
		}
		System.out.print(a);
		return 0;
	}
}
