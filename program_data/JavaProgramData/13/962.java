import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int i;
		int j;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			String b = new String(new char[20000]);
			int[] a = new int[20000]; //????
			for (i = 0;i < n;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			b = new Scanner(System.in).nextLine(); //?????????????????��?????????????????��//
			System.out.print(a[0]);
			for (i = 1;i < n;i++)
			{
				for (j = 0;j < i;j++) //????????????
				{
					if (a[i] == a[j])
					{
						break; //????????????
					}
				}
				if (j == i)
				{
					System.out.print(" ");
					System.out.print(a[i]);
				}
			}
			System.out.print("\n");

		}
		return 0;
	}
}

