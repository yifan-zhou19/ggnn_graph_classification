package <missing>;

public class GlobalMembers
{
	public static char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	public static char p1;
	public static char p2;
	public static int[] p = new int[100];
	public static int i;
	public static int j;
	public static int len;
	public static int n1;
	public static int n2;
	public static int n = 0;
	public static void rank()
	{
		for (i = 0;i < len;i++)
		{
			if (p[i] == 2)
			{
				n1 = i;
				p[i] = 3;
				break;
			}
		}
				for (j = n1 - 1;j >= 0;j--)
				{
					if ((p[j] != 2) && (p[j] != 3))
					{
						break;
					}
				}
						n2 = j;
						p[n2] = 3;


		System.out.print(n2);
		System.out.print(" ");
		System.out.print(n1);
		System.out.print("\n");
		n++;
		if (n < len / 2)
		{
			rank();
		}
	}
	public static int Main()
	{
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		p1 = str[0];
		for (i = 0;i < len;i++)
		{
			if (str[i] != p1)
			{
			break;
			}
		}
		p2 = str[i];
		for (i = 0;i < len;i++)
		{
			if (str[i] == p1)
			{
				p[i] = 1;
			}
			else
			{
				p[i] = 2;
			}
		}
		rank();
		return 0;
	}


}

