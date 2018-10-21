package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String w = new String(new char[1000]);
		char[][] ws =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i;
		int len;
		int j = 0;
		int k = 0;
		int mi = 0;
		int ma = 0;
		w = new Scanner(System.in).nextLine();
		len = w.length();
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
		for (i = 1;i <= j;i++)
		{
			if (min > String.valueOf(ws[i]).length())
			{
				min = String.valueOf(ws[i]).length();
				mi = i;
			}
			if (max < String.valueOf(ws[i]).length())
			{
				max = String.valueOf(ws[i]).length();
				ma = i;
			}
		}
		System.out.printf("%s\n",ws[ma]);
		System.out.printf("%s\n",ws[mi]);
		return 0;
	}
}
