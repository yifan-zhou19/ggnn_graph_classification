package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String yj = new String(new char[5000]);
		yj = new Scanner(System.in).nextLine();

		String a = new String(new char[20]);
		String max = new String(new char[20]);
		String min = new String(new char[20]);
		int i;
		int k;
		int first = 0;
		int dx = yj.length();
		for (i = 0;i < dx + 1;i++)
		{
			if (i == 0)
			{
				first = 1;
			}
			else
			{
				first = 0;
			}
			for (k = i;;k++)
			{

				if ((yj.charAt(k) != ',') && (yj.charAt(k) != ' ') && (yj.charAt(k) != '\0'))
				{
					a = tangible.StringFunctions.changeCharacter(a, k - i, yj.charAt(k));
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, k - i, '\0');
					i = k;
					break;
				}
			}
			if (first == 1)
			{
						max = a;
						min = a;
			}
			else
			{
				if (a.length() > max.length())
				{
							max = a;
				}
				if (a.length() < min.length() && a.length() != 0)
				{
							min = a;
				}
			}


		}
		System.out.printf("%s\n%s",max,min);
		return 0;
	}

}

