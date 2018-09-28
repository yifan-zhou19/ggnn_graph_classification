import java.util.*;

package <missing>;

public class GlobalMembers
{
	//???  1000010334
	public static String n = new String(new char[10]); //cin.getline the z
	public static void type0()
	{
		System.out.print(0);
		System.out.print("\n");
	}
	public static void typefu()
	{
		int len = 0;
		int i = 0;
		len = n.length();
		for (;len >= 1;len--)
		{
			if (n.charAt(len - 1) != '0')
			{
				break;
			}
		}
		System.out.print(n.charAt(0));
		for (i = len - 1;i >= 1;i--)
		{
			System.out.print(n.charAt(i));
		}
		System.out.print("\n");
	}
	public static void typezh()
	{
		int len = 0;
		int i = 0;
		len = n.length();
		for (;len >= 1;len--)
		{
			if (n.charAt(len - 1) != '0')
			{
				break;
			}
		}
		for (i = len - 1;i >= 0;i--)
		{
			System.out.print(n.charAt(i));
		}
		System.out.print("\n");
	}
	public static int Main()
	{
		int i = 0; //circulate
		int j = 0;

		for (i = 0;i < 6;i++) //6?
		{
			for (j = 0;j < 10;j++)
			{
				n = tangible.StringFunctions.changeCharacter(n, j, '\0');
			}
			n = new Scanner(System.in).nextLine(); //??
			if (n.charAt(0) == '0' || (n.charAt(1) == '0' && n.charAt(0) == '-'))
			{
				type0();
			}
			else if (n.charAt(0) == '-')
			{
				typefu();
			}
			else
			{
				typezh();
			}
		}
		return 0;
	}
}

