import java.util.*;

package <missing>;

public class GlobalMembers
{
	//**************************************
	//**?????????
	//**?????  1100017658
	//**???2011.11.27
	//*************************************
	public static int Main() // ?????
	{
		String sen = new String(new char[1000]); // ?????
		String p = null;
		p = sen;
		int[] s = new int[1000]; // ????????
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q = null;
		int q = null;
		q = s;
		sen = new Scanner(System.in).nextLine(); // ?????
		int l = sen.length(); // ????
		for (int i = 0; i < l; i++) // ????
		{
			if (*(p.Substring(i)) == ' ')
			{
				if (*(p.Substring(i) + 1) == ' ')
				{
					*(q + i + 1) = 1; // ??
				}
			}
		}
		for (int j = 0; j < l; j++) // ????
		{
			if (*(q + j) == 0)
			{
				System.out.print((p.Substring(j)));
			}
		}
		return 0;
	} // ?????
}
