import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sentence = new String(new char[110]);
		String first = new String(new char[110]);
		String second = new String(new char[110]);
		int i;
		int j;
		int flag;
		int lens;
		int len1;
		int len2;
		sentence = new Scanner(System.in).nextLine();
		first = new Scanner(System.in).nextLine();
		second = new Scanner(System.in).nextLine();
		lens = sentence.length();
		len1 = first.length();
		for (i = 0;i < lens - len1 + 1;i++)
		{
			flag = 0;
			if ((i == 0 && sentence.charAt(i + len1) == ' ') || (sentence.charAt(i - 1) == ' ' && sentence.charAt(i + len1) == ' ') || (i == lens - len1 && sentence.charAt(i - 1) == ' '))
			{
			for (j = 0;j < len1;j++)
			{
				if (sentence.charAt(i + j) == first.charAt(j))
				{
					flag++;
				}
			}
			}
			if (flag == len1)
			{
				i = i + len1 - 1;
				System.out.print(second);
			}
			else
			{
				System.out.print(sentence.charAt(i));
			}
		}
		if (flag != len1)
		{
			for (i = lens - len1 + 1;i < lens;i++)
			{
				System.out.print(sentence.charAt(i));
			}
		}
		return 0;
	}
}
