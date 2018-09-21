package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int[] num = new int[100];
		int i;
		int j = 0;
		int k;
		str = new Scanner(System.in).nextLine();
		num[0] = 0;
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == ' ' && str.charAt(i - i) != ' ')
			{
				j++;
			}
			else if (str.charAt(i) != ' ' && str.charAt(i - 1) == ' ')
			{
				num[j] = i;
			}
		}
		for (k = j;k > 0;k--)
		{
			for (i = 0;;i++)
			{
				if (str.charAt(num[k] + i) == ' ' || str.charAt(num[k] + i) == '\0')
				{
					System.out.print(" ");
					break;
				}
				else
				{
					System.out.printf("%c",str.charAt(num[k] + i));
				}
			}
		}
		for (i = 0;;i++)
		{
				if (str.charAt(num[0] + i) == ' ' || str.charAt(num[0] + i) == '\0')
				{
					System.out.print("\n");
					break;
				}
				else
				{
					System.out.printf("%c",str.charAt(num[0] + i));
				}
		}
		return 0;
	}
}
