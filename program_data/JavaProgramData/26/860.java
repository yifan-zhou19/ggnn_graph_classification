import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String test = new String(new char[MAX_LENGTH]);
		test = new Scanner(System.in).nextLine();
		for (int i = 0;test.charAt(i) != 0;i++)
		{

			if (test.charAt(i) == ' ')
			{
				while (true)
				{
					i++;
					if (test.charAt(i) != ' ') //????,???????
					{
						System.out.print(' ');
						break; //????
					}
				}
			}
			System.out.print(test.charAt(i));
		}


		return 0;
	}

}
