import java.util.*;

package <missing>;

public class GlobalMembers
{
	//???? 
	public static int Main()
	{
		int n = 0; //??????
		int i = 0; //????
		int j = 0;
		int pan = 0; //????????
		String str = new String(new char[90]); //?????
		for (i = 0;i < 90;i++)
		{
			str = str.substring(0, i);
		}

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			str = new Scanner(System.in).nextLine();

				if (str.charAt(0) == '_' || (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') || (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'))
				{
					for (j = 0;str.charAt(j) != 0;j++)
					{
						if ((str.charAt(j) == '_' || (str.charAt(j) >= 'a' && str.charAt(j) <= 'z') || (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') || (str.charAt(j) >= '0' && str.charAt(j) <= '9')))
						{
							pan = 0;
						}
						else
						{
							pan = 1;
							break;
						}
					}
					if (pan == 1)
					{
						System.out.print(0);
						System.out.print("\n");
					}
					else
					{
						System.out.print(1);
						System.out.print("\n");
					}
				}
				else
				{
					System.out.print(0);
					System.out.print("\n");
				}
		}
		return 0;
	}
}

