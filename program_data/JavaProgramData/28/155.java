package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[1000]);
		char[][] w =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int[] l = new int[300];
		int word = 0;
		int i;
		int j = -1;
		int k = 0;
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) != ' ')
			{
				if (word == 0)
				{
					j++;
					w[j][k] = str.charAt(i);
					k++;
				}
				else
				{
					w[j][k] = str.charAt(i);
					k++;
				}
				word = 1;
			}
			else
			{
				k = 0;
				word = 0;
			}
		}
		for (i = 0;i < j + 1;i++)
		{
			l[i] = String.valueOf(w[i]).length();
		}
		System.out.printf("%d",l[0]);
		for (i = 1;i < j + 1;i++)
		{
			System.out.printf(",%d",l[i]);
		}
	}








}
