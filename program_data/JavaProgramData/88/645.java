import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 *???: seek numbers.cpp
	 *??????
	 *????: 2012-12-10
	 *??: ????
	 */


	public static int Main()
	{
		String data = new String(new char[31]);
		char[][] result = new char[31][31];
		//result???????????,data????????
		int counter = 0;
		//counter??????
		data = new Scanner(System.in).nextLine();
		for (int i = 0; i < data.length(); i++)
		{
			if (*(data.Substring(i)) >= '0' && *(data.Substring(i)) <= '9')
			{
				for (int j = 0; ; j++)
				{
					*(*(result + counter) + j) = *(data.Substring(i) + j);
					if (*(data.Substring(i) + j + 1) < '0' || *(data.Substring(i) + j + 1) > '9' || i + j == 29)
					{
						*(*(result + counter) + j + 1) = '\0';
						counter++;
						i += j;
						break;
					}
				}
			}
		}
		for (int i = 0; i < counter; i++)
		{
			System.out.print((result + i));
			System.out.print("\n");
		}
		return 0;
	}
}
