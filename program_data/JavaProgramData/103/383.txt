import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1001]);
		str = new Scanner(System.in).nextLine();
		int len;
		len = str.length();
		int i;
		int num = 1;
		char cur = str.charAt(0);
		char p;
		if (len == 1)
		{
			if (cur <= 'z' && cur >= 'a')
			{
				p = cur + 'A' - 'a';
				System.out.print("(");
				System.out.print(p);
				System.out.print(",");
				System.out.print(num);
				System.out.print(")");
			}
			else
			{
				System.out.print("(");
				System.out.print(cur);
				System.out.print(",");
				System.out.print(num);
				System.out.print(")");
			}
		}
		for (i = 1; str.charAt(i) != '\0'; i++)
		{
			if (cur == str.charAt(i) || str.charAt(i) == cur + 'A' - 'a' || str.charAt(i) == cur + 'a' - 'A')
			{
				num++;
				if (i == len - 1)
				{
					if (cur <= 'z' && cur >= 'a')
					{
						p = cur + 'A' - 'a';
						System.out.print("(");
						System.out.print(p);
						System.out.print(",");
						System.out.print(num);
						System.out.print(")");
					}
					else
					{
						System.out.print("(");
						System.out.print(cur);
						System.out.print(",");
						System.out.print(num);
						System.out.print(")");
					}
				}
			}
			else
			{
				if (cur <= 'z' && cur >= 'a')
				{
					p = cur + 'A' - 'a';
					System.out.print("(");
					System.out.print(p);
					System.out.print(",");
					System.out.print(num);
					System.out.print(")");
				}
				else
				{
					System.out.print("(");
					System.out.print(cur);
					System.out.print(",");
					System.out.print(num);
					System.out.print(")");
				}
				num = 1;
				cur = str.charAt(i);
				if (i == len - 1)
				{
					if (cur <= 'z' && cur >= 'a')
					{
						p = cur + 'A' - 'a';
						System.out.print("(");
						System.out.print(p);
						System.out.print(",");
						System.out.print(num);
						System.out.print(")");
					}
					else
					{
						System.out.print("(");
						System.out.print(cur);
						System.out.print(",");
						System.out.print(num);
						System.out.print(")");
					}
				}

			}
		}




		return 0;
	}



}
