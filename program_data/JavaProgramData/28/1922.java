package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len = 0;
		int m = 0;
		int i = 0;
		String sentence = new String(new char[6000]);
		sentence = new Scanner(System.in).nextLine();
		len = sentence.length();
		for (i = 0;i <= len;i++)
		{
			if (sentence.charAt(i) != ' ' && sentence.charAt(i) != 0)
			{
				m++;
			}
			else
			{
				System.out.printf("%d",m);
				m = 0;
				break;
			}
		}
		for (i = i + 1;i <= len;i++)
		{
			if (sentence.charAt(i - 1) == ' ' && sentence.charAt(i) != ' ')
			{
				m = 1;
			}
			else if (sentence.charAt(i - 1) != ' ' && (sentence.charAt(i) != ' ' && sentence.charAt(i) != 0))
			{
				m++;
			}
			else if (sentence.charAt(i - 1) != ' ' && (sentence.charAt(i) == ' ' || sentence.charAt(i) == '\0'))
			{
				System.out.printf(",%d",m);
			}
		}
		return 0;
	}
}
