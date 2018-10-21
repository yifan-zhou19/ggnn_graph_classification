package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String w = new String(new char[1000]);
		char[][] ws =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i;
		int j = 0;
		int k = 0;
		w = new Scanner(System.in).nextLine();
		int len = w.length();
		for (i = 0;i < len;i++)
		{
			if (w.charAt(i) != ' ')
			{
				ws[j][k] = w.charAt(i);
				k++;
			}
			else if (w.charAt(i) == ' ')
			{
				j++;
				k = 0;
			}
		}
		int min = String.valueOf(ws[0]).length();
		int max = String.valueOf(ws[0]).length();
		int minw = 0;
		int maxw = 0;
		for (i = 1;i <= j;i++)
		{
			if (min > String.valueOf(ws[i]).length())
			{
				min = String.valueOf(ws[i]).length();
				minw = i;
			}
			if (max < String.valueOf(ws[i]).length())
			{
				max = String.valueOf(ws[i]).length();
				maxw = i;
			}
		}
		System.out.printf("%s\n",ws[maxw]);
		System.out.printf("%s\n",ws[minw]);
	}
}
