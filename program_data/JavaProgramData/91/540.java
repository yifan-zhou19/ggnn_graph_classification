import java.util.*;

package <missing>;

public class GlobalMembers
{
	//??????????
	//??????
	//???2010.12.15

	public static int Main()
	{
		String a = new String(new char[101]); //??a????????
		String b = new String(new char[101]); //??b?????????
		int i = 0;
		int length = 0;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Character.SIZE / Byte.SIZE));

		a = new Scanner(System.in).nextLine();

		length = a.length(); //????????
		for (i = 0; i <= length - 2; i++) //??????????
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
		}
		b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(0)); //??????????????

		for (i = 0; i < length; i++)
		{
			System.out.print(b.charAt(i));
		}

		return 0;
	}
}

