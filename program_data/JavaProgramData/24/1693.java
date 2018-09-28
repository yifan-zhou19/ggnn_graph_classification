package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[5000]);
	char[][] t =
	{
		{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	};
	int i;
	int j;
	int k;
	int index;
	int max;
	int min;
	s = new Scanner(System.in).nextLine();
		index = 0;
		for (i = 0;;i++)
		{
			for (k = 0;;)
			{
				if (s.charAt(index) != ' ' && s.charAt(index) != 0)
				{
					t[i][k] = s.charAt(index);
					index++;
					k++;
				}
				else
				{
					index++;
					break;
				}
			}
			if (s.charAt(index - 1) == 0)
			{
				break;
			}
		}
		max = min = 0;
		for (j = 1; j <= i; j++)
		{
			if (String.valueOf(t[j]).length() < String.valueOf(t[min]).length())
			{
				min = j;
			}
			if (String.valueOf(t[j]).length() > String.valueOf(t[max]).length())
			{
				max = j;
			}
		}
		System.out.println(t[max]);
		System.out.println(t[min]);
		return 0;
	}

}
