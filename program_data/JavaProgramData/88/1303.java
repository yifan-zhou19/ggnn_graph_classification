import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String hello = new String(new char[33]);
		int count;
		int i = 0;

		hello = new Scanner(System.in).nextLine();


		while (hello.charAt(i) != '\0')
		{

			if (hello.charAt(i) >= '0' && hello.charAt(i) <= '9')
			{
					System.out.print(hello.charAt(i));
					count = 0;
			}
			else
			{
				if (count == 0)
				{
						System.out.print("\n");
						count++;
				}

			}
			i++;
		}
		System.out.print("\n");
		return 0;
	}


}
