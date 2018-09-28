import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*???:???????
	**???:??
	**?  ?:2010?12?10?
	*/
	public static int Main()
	{
		String sentence = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		String k;
		int l; //??????????
		sentence = new Scanner(System.in).nextLine();
		for (p1 = sentence; * p1 != '\0'; p1++)
		{
			if (*p1 == ' ') //????
			{
				k = p1 + 1; //????????
				for (p2 = k; * p2 != '\0'; p2++) //??????????
				{
					if (*p2 != ' ') //???????
					{
						l = sentence.length() - (p2 - sentence) + 1; //????????????(sentence?????)
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
						memcpy(k, p2, l); //?????,????
						break; //?????????
					}
				}
			}
		}
		System.out.print(sentence);
		System.out.print("\n");
		return 0;
	}
}
