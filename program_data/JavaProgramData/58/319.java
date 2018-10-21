import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[81]); //???????
		int n; //????n
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //?????
		for (int i = 0;i < n;i++) //????????
		{
			s = new Scanner(System.in).nextLine();
			int ok = 0; //??????
			if (s.charAt(0) == '_')
			{
				ok = 1;
			}
			if ((s.charAt(0) <= 'z') && (s.charAt(0) >= 'a'))
			{
				ok = 1;
			}
			if ((s.charAt(0) <= 'Z') && (s.charAt(0) >= 'A'))
			{
				ok = 1;
			}
			if (ok != 0) //???????????
			{
				for (int j = 1;s.charAt(j);j++)
				{
					if ((s.charAt(j) >= '0') && (s.charAt(j) <= '9'))
					{
						ok = 1;
					}
					else if ((s.charAt(j) <= 'z') && (s.charAt(j) >= 'a'))
					{
						ok = 1;
					}
					else if ((s.charAt(j) <= 'Z') && (s.charAt(j) >= 'A'))
					{
						ok = 1;
					}
					else if (s.charAt(j) == '_')
					{
						ok = 1;
					}
					else
					{
						ok = 0;
						break;
					}
				}





			}

			System.out.print(ok);
			System.out.print("\n");


		}

		return 0;


	}

}

