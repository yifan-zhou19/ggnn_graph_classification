import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String st = new String(new char[1000]);
		st = new Scanner(System.in).nextLine();
	char a = st.charAt(0);
		int count = 0;
		int[] z = new int[1000];
		for (int i = 1;i <= st.length();i++)
		{
			if (st.charAt(i - 1) == a)
			{
			count++;
			z[count] = i;
			}
			else
			{
				System.out.print(z[count] - 1);
				System.out.print(' ');
				System.out.print(i - 1);
				System.out.print("\n");
				z[count] = 0;
				count--;
			}
		}

		return 0;
	}

}
