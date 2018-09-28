import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int check(char n)
	{
		int c = 0;
		if ((n == '_') || ((n >= 'A') && (n <= 'Z')) || ((n >= 'a') && (n <= 'z')) || ((n <= '9') && (n >= '0')))
		{
		c = 1;
		}
		return c;
	}
	public static int Main()
	{
		int i = 0;
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			int j = 0;
			int k = 0;
			int flag = 0;
			char[] shuru = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			shuru = new Scanner(System.in).nextLine();
			if ((shuru[0] == '_') || ((shuru[0] >= 'A') && (shuru[0] <= 'Z')) || ((shuru[0] >= 'a') && (shuru[0] <= 'z')))
			{
				 for (k = 1;shuru[k] != '\0';k++)
				 {
					 if (check(shuru[k]) == 0)
					 {
						 flag = 1;
						 System.out.print("0");
						 System.out.print("\n");
						 break;
					 }
				 }
				 if (flag == 0)
				 {
				 System.out.print("1");
				 System.out.print("\n");
				 }
			}
			else
			{
			System.out.print("0");
			System.out.print("\n");
			}
		}
		return 0;
	}

}

