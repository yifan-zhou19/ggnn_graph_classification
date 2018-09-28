import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
		   int[] num = new int[26];
		   int j = 0;
		   int flag = 0;
		   char[] shuru = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		   shuru = new Scanner(System.in).nextLine();
		   for (j = 0;shuru[j] != '\0';j++)
		   {
		   num[(int)shuru[j] - 97] = num[(int)shuru[j] - 97] + 1;
		   }
		   for (j = 0;shuru[j] != '\0';j++)
		   {
			   if (num[(int)shuru[j] - 97] == 1)
			   {
				   System.out.print(shuru[j]);
				   System.out.print("\n");
				   flag = 1;
				   break;
			   }
		   }
		   if (flag == 0)
		   {
		   System.out.print("no");
		   System.out.print("\n");
		   }
		}
		return 0;
	}
}

