import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] sen = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int j = 0;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			j = 0;
			sen = new Scanner(System.in).nextLine();
			while (sen[j] == '_' || (sen[j] >= 'A' && sen[j] <= 'Z') || (sen[j] >= 'a' && sen[j] <= 'z') || (sen[j] >= '0' && sen[j] <= '9'))
			{
				if ((sen[0] >= '0' && sen[0] <= '9'))
				{
					break;
				}
				j++;
			}
			if (j == sen.length())
			{
				System.out.print(1);
				System.out.print("\n");
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

