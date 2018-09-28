import java.util.*;

package <missing>;

public class GlobalMembers
{
	//******************
	//**???????**
	//*?? 1100012915**
	//******11.29*******
	//******************

	public static int Main()
	{
	String start = new String(new char[200]); //????????
	String result = new String(new char[200]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p = null; //????
	int i = 0;
	int j;
	start = new Scanner(System.in).nextLine(); //??????
	for (p = start; * p != '\0'; p++)
	{
		if ((*p != ' ') || (*(p + 1) != ' ')) //????????????????????????
		{
			System.out.print(p);
		}
	}
	return 0;
	}
}
