import java.util.*;

package <missing>;

public class GlobalMembers
{
	// ?????.cpp : ??????????????
	//
	public static int Main()
	{
		int n;
		int j;
		int len;
		int len2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			String A = new String(new char[101]);
			String B = new String(new char[101]);
			String C = new String(new char[101]);
			String D = new String(new char[101]);
			D = new Scanner(System.in).nextLine();
			A = new Scanner(System.in).nextLine();
			B = new Scanner(System.in).nextLine();
			len = A.length();
	for (j = 0;2 * j < len;j++)
	{
				char k;
				k = A.charAt(j);
				A = tangible.StringFunctions.changeCharacter(A, j, A.charAt(len - j - 1));
				A = tangible.StringFunctions.changeCharacter(A, len - j - 1, k);
	}
			len2 = B.length();
			for (j = 0;2 * j < len2;j++)
			{
				char k;
				k = B.charAt(j);
				B = tangible.StringFunctions.changeCharacter(B, j, B.charAt(len2 - j - 1));
				B = tangible.StringFunctions.changeCharacter(B, len2 - j - 1, k);
			}
			for (j = len2;j < len;j++)
			{
				B = tangible.StringFunctions.changeCharacter(B, j, '0');
			}
			B = B.substring(0, j);
			for (j = 0;j < len;j++)
			{
				C = tangible.StringFunctions.changeCharacter(C, j, (int)A.charAt(j) + '0' - (int)B.charAt(j));
				if (C.charAt(j) < '0')
				{
				A.charAt(j + 1)--;
				C.charAt(j) += 10;
				}
			}
			for (j = len - 1;j > 0 && C.charAt(j) == '0';j--)
			{
				;
			}
			for (;j >= 0;j--)
			{
				System.out.print(C.charAt(j));
			}
			System.out.print("\n");
		}
		return 0;
	}


}

