package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String words = new String(new char[2000]);
		int i;
		int j;
		int max;
		int min;
		int indexmax;
		int indexmin;
		int temp;
		int dis;
		int len;
		words = new Scanner(System.in).nextLine();
		len = words.length();
		max = -1;
		min = 5000;

		for (i = 0; i < len; i++)
		{
			while (words.charAt(i) == ' ')
			{
				i++; // ???????????
			}
			temp = i; // ????????
			while (words.charAt(i) != '\0' && words.charAt(i) != ' ')
			{
				i++; // ??????
			}
			dis = i - temp;
			if (dis > max)
			{
				max = dis;
				indexmax = temp;
			}
			if (dis < min)
			{
				min = dis;
				indexmin = temp;
			}
		}

		// ???????for??????
		while (words.charAt(indexmax) != '\0' && words.charAt(indexmax) != ' ')
		{
			System.out.printf("%c", words.charAt(indexmax++));
		}
		System.out.print("\n");
		while (words.charAt(indexmin) != '\0' && words.charAt(indexmin) != ' ')
		{
			System.out.printf("%c", words.charAt(indexmin++));
		}
		System.out.print("\n");
		return 0;
	}
}
