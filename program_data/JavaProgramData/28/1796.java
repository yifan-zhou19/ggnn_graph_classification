package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		int cout;
		int j;
		String b = new String(new char[10000]);
		b = new Scanner(System.in).nextLine();
		len = b.length();
		for (i = 0;i < len;i++)
		{
			cout = 0;
			while ((b.charAt(i) != ' ') && (i < len))
			{
				cout++;
				i++;
			}
			System.out.printf("%d",cout);
				break;
		}
		for (j = i + 1;j < len;j++)
		{
			cout = 0;
			if (b.charAt(j) == ' ')
			{
				continue;
			}
			while ((b.charAt(j) != ' ') && (j < len))
			{
				cout++;
				j++;
			}
			System.out.printf(",%d",cout);
		}
		return 0;
	}

}
