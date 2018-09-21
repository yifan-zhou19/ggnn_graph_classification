import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input = new String(new char[100]);
		char[][] output = new char[100][100];
		int i = 0;
		int count = 0;
		int n = 0;
		input = new Scanner(System.in).nextLine();
		while (input.charAt(i) != 0)
		{
			 if (input.charAt(i) != ' ')
			 {
				   output[count][n] = input.charAt(i);
				   n++;
			 }
			 else
			 {
					 output[count][n] = 0;
					 count++;
					 n = 0;
			 }
			 i++;
		}

		for (i = count;i > 0;i--)
		{
			System.out.print(output[i]);
			System.out.print(" ");
		}
		System.out.print(output[0]);

		return 0;
	}
}
