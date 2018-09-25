import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] numl = new int[51];
		int pl = 0;
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		for (int i = 0;i < len;i++)
		{

			if (str.charAt(i) == str.charAt(0))
			{
				numl[pl] = i;
				pl++;
			}
			else if (str.charAt(i) != str.charAt(0))
			{
				System.out.print(numl[pl - 1]);
				System.out.print(" ");
				System.out.print(i);
	System.out.print("\n");
				pl--;
			}
		}

		return 0;
	}


}
