import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int number;
		String str = new String(new char[100000]);
		char t;
		int[] array = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			str = new Scanner(System.in).nextLine();
			for (j = 0;j < 100000;j++)
			{
				array[j] = 0;
			}
			for (j = 0;str.charAt(j + 1) != '\0';j++)
			{
				if (array[j] == 0)
				{
					for (k = j + 1;str.charAt(k) != '\0';k++)
					{
						if (str.charAt(k) == str.charAt(j))
						{
							array[k] = 1;
							array[j] = 1;
						}
					}
				}
			}
			number = 0;
			for (j = 0;str.charAt(j) != '\0';j++)
			{
				if (array[j] == 0)
				{
					System.out.print(str.charAt(j));
					System.out.print("\n");
					number++;
					break;
				}
			}
			if (number == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

