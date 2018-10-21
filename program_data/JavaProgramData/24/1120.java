package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[NUM * LEN]);
		char[][] b = new char[NUM][LEN];
		int i;
		int k;
		int index;
		int max;
		int min;
		a = new Scanner(System.in).nextLine();
		index = 0;
		for (i = 0;;i++)
		{
			for (k = 0;;)
			{
				if (a.charAt(index) != ' ' && a.charAt(index) != 0)
				{
					b[i][k] = a.charAt(index);
					index++;
					k++;
				}
				else
				{
					b[i][k] = 0;
					index++;
					k++;
					break;
				}
			}
			if (a.charAt(index - 1) == 0)
			{
				break;
			}
		}
		max = 0;
		min = 0;
		for (k = 1;k <= i;k++)
		{
			if (String.valueOf(b[k]).length() > String.valueOf(b[max]).length())
			{
				max = k;
			}
			if (String.valueOf(b[k]).length() < String.valueOf(b[min]).length())
			{
				min = k;
			}
		}
		System.out.printf("%s\n",b[max]);
		System.out.printf("%s\n",b[min]);
		return 0;
	}
}
