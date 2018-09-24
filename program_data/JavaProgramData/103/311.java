import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int flag = 1;
		int j;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long len;
		int len;
		String am = new String(new char[100]);
		am = new Scanner(System.in).nextLine();
		len = am.length();
		for (i = 0; i < len; i++)
		{
			if (am.charAt(i) >= 'a')
			{
				am = tangible.StringFunctions.changeCharacter(am, i, am.charAt(i) - 32);
			}
		}
		for (i = 0; i < len; i++)
		{
			for (j = i + 1; j < len; j++)
			{
				if (am.charAt(j) == am.charAt(i) || Math.abs(am.charAt(j) - am.charAt(i)) == 32)
				{
					flag++;
				}
				else
				{
					break;
				}
			}

			System.out.print("(");
			System.out.print(am.charAt(i));
			System.out.print(",");
			System.out.print(flag);
			System.out.print(")");
			flag = 1;
			i = j - 1;

		}



		return 0;
	}
}

