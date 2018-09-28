import java.util.*;

package <missing>;

public class GlobalMembers
{
	// ??
	// ????wayne
	// ?????12.30


	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		int[] a1 = new int[250];
		int[] b1 = new int[250];
		int[] c = new int[250];
		int i;
		int j;
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (k = 0;k < n;k++)
		{
		for (i = 0;i < 250;i++)
		{
			a1[i] = 0;
			b1[i] = 0;
			c[i] = 0;
		}
		System.in.read();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = a.length() - 1,j = 0;i >= 0;i--,j++)
		{
			a1[j] = a.charAt(i) - '0';
		}
		for (i = b.length() - 1,j = 0;i >= 0;i--,j++)
		{
			b1[j] = b.charAt(i) - '0';
		}
		if (a.length() > b.length())
		{
			for (i = 0;i < a.length();i++)
			{
				c[i] += a1[i] - b1[i];
				if (c[i] < 0)
				{
					c[i] = 10 + c[i];
					c[i + 1]--;
				}
			}
			while (c[i] == 0 && i > 0)
			{
				i--;
			}
			for (;i >= 0;i--)
			{
				System.out.print(c[i]);
			}
			System.out.print("\n");
		}
		else if (a.length() < b.length())
		{
			for (i = 0;i < b.length();i++)
			{
				c[i] += b1[i] - a1[i];
				if (c[i] < 0)
				{
					c[i] = 10 + c[i];
					c[i + 1]--;
				}
			}
			while (c[i] == 0 && i > 0)
			{
				i--;
			}
			for (;i >= 0;i--)
			{
				System.out.print(c[i]);
			}
			System.out.print("\n");
		}
		else
		{
			for (i = a.length() - 1;i >= 0;i--)
			{
				if (a1[i] == b1[i])
				{
					continue;
				}
				else if (a1[i] > b1[i])
				{
					for (i = 0;i < a.length();i++)
					{
						c[i] += a1[i] - b1[i];
						if (c[i] < 0)
						{
							c[i] = 10 + c[i];
							c[i + 1]--;
						}
					}
					while (c[i] == 0 && i > 0)
					{
						i--;
					}
					for (;i >= 0;i--)
					{
						System.out.print(c[i]);
					}
					System.out.print("\n");
					break;
				}
				else
				{
					for (i = 0;i < b.length();i++)
					{
						c[i] += b1[i] - a1[i];
						if (c[i] < 0)
						{
							c[i] = 10 + c[i];
							c[i + 1]--;
						}
					}
					while (c[i] == 0 && i > 0)
					{
						i--;
					}
					for (;i >= 0;i--)
					{
						System.out.print(c[i]);
					}
					System.out.print("\n");
					break;
				}
			if (i == 0)
			{
				System.out.print("0");
				System.out.print("\n");
			}
			}
		}
		}
		return 0;
	}


}

