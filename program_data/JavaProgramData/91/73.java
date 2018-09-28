package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
	int i;
	int[] b = new int[1000];
	int cout;
	cout = 0;
	a = new Scanner(System.in).nextLine();
	for (i = 0;;i++)
	{
		if (a.charAt(i) == '\0')
		{
			break;
		}
		else
		{
			cout++;
		}

	}

	for (i = 0;i <= cout - 2;i++)
	{
		b[i] = (int)a.charAt(i) + (int)a.charAt(i + 1);
	}
	b[cout - 1] = (int)a.charAt(cout - 1) + (int)a.charAt(0);
	for (i = 0;i <= cout - 1;i++)
	{
		System.out.printf("%c",b[i]);
	}


	return 0;

	}
}
