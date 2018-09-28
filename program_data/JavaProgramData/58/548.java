import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int flag1;
		int flag2;
		int i;
		int j;
		int n;
		int lena;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			flag1 = 0;
			flag2 = 1;
			a = new Scanner(System.in).nextLine();
			lena = a.length();
			if (lena == 1)
			{
				if (a.charAt(0) <= 57 && a.charAt(0) >= 48 || a.charAt(0) <= 90 && a.charAt(0) >= 65 || a.charAt(0) >= 97 && a.charAt(0) <= 122 || a.charAt(0) == '_')
				{
					System.out.print("1");
					System.out.print("\n");
				}
				else
				{
					System.out.print("0");
					System.out.print("\n");
				}

			}
			if (lena > 1)
			{
				if (a.charAt(0) <= 90 && a.charAt(0) >= 65 || a.charAt(0) >= 97 && a.charAt(0) <= 122 || a.charAt(0) == '_')
				{
					flag1 = 1;
				}
				for (j = 1;j < lena;j++)
				{
					if ((a.charAt(j) >= 97 && a.charAt(j) <= 122) + (a.charAt(j) <= 90 && a.charAt(j) >= 65) + (a.charAt(j) == '_') + (a.charAt(j) >= 48 && a.charAt(j) <= 57) == 0)
					{
						flag2 = 0;
						break;
					}
				}

				if (flag1 + flag2 >= 2)
				{
					System.out.print("1");
					System.out.print("\n");
				}
				if (flag1 + flag2 < 2)
				{
					System.out.print("0");
					System.out.print("\n");
				}
			}

		}
		return 0;
	}

}

