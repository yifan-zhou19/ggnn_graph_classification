import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String input = new String(new char[81]);
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (k > 0)
		{
			input = new Scanner(System.in).nextLine();
			int i = 1;
			int leg = 0;
			if (input.charAt(0) == '_' || (input.charAt(0) >= 'a' && input.charAt(0) <= 'z') || (input.charAt(0) >= 'A' && input.charAt(0) <= 'Z'))
			{
			  leg = 1;
			}
			while (input.charAt(i) != 0)
			{
			  if (leg == 0)
			  {
				  break;
			  }
			  else if ((input.charAt(i) >= 'a' && input.charAt(i) <= 'z') || (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') || (input.charAt(i) >= '0' && input.charAt(i) <= '9') || input.charAt(i) == '_')
			  {
					leg = 1;
			  }
			  else
			  {
				  leg = 0;
			  }
			  i++;
			}
			System.out.print(leg);
			System.out.print("\n");
			k--;
		}

		return 0;
	}

}

