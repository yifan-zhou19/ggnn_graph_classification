import java.util.*;

package <missing>;

public class GlobalMembers
{
	/************************************************
	**authour:	???				*
	**number:	1000012905			*
	**descripition:	?????			*
	************************************************/
	public static int Main()
	{
		//?????  
		String words = new String(new char[101]);
		words = new Scanner(System.in).nextLine();
		//???????  
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = words;

		//????????????????  
		while (*(p + 1) != '\0')
		{
			System.out.print((char)(*p + *(p + 1)));
			p++;
		}
		System.out.print((char)(*p + words.charAt(0)));
		System.out.print("\n");

		return 0;
	}

}
