import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[27];
		int n;
		int i;
		int j;
		int temp;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long len;
		int len;
		String author = new String(new char[27]);
		char temp2;
		final String book = "";
		String str = new String(new char[4]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			System.in.read();
			author = new Scanner(System.in).nextLine();
			len = author.length(); //???unsigned long ?????????????
			for (j = 0; j < len; j++)
			{
				num[author.charAt(j) - 'A']++;
				strncat(book.charAt(author.charAt(j) - 'A'), str, 3); //??????????????????
			}
		}
		temp = 0;
		for (j = 0; j < 26; j++)
		{
			if (num[j] > temp)
			{
				temp = num[j];
				temp2 = j + 'A';
			}
		}
		System.out.print(temp2);
		System.out.print("\n");
		System.out.print(temp);
		System.out.print("\n");
		for (j = 0; j < temp; j++)
		{
			for (i = 0; i < 3; i++)
			{
				System.out.print(book.charAt(temp2 - 'A')[j * 3 + i]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

