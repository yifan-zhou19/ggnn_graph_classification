import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void zhaodui(String str)
	{
		String nan = new String(new char[2]);
		String nv = new String(new char[2]);
		String str1 = new String(new char[100]);
		int i;
		int j;
		str1 = str;
		nan = tangible.StringFunctions.changeCharacter(nan, 0, str[0]);
		for (i = 0;i < 99;i++)
		{
			if (!str[i].equals(str[0]))
			{
				nv = tangible.StringFunctions.changeCharacter(nv, 0, str[i]);
				break;
			}
		}
		for (j = 0;j < 99;j++)
		{
			for (i = 1;i < 98;i = i + 2)
			{
				if (str[j].equals(nv.charAt(0)) && str[j - i].equals(nan.charAt(0)))
				{
					System.out.print(j - i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
					str[j] = '\0';
					str[j - i] = '\0';
				}
			}
		}
	}
	public static int Main()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		zhaodui(str);
		return 0;
	}

}

