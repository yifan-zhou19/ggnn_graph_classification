package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][100];
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		int i = 0;
		int len = 0;
		for (i = 0 ; i <= 99 ; i++)
		{
		a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len++;
		if (System.in.read() == '\n')
		{
		break;
		}
		}
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0 ; i <= len - 1 ; i++)
		{
			 if (strcmp(a[i], b) == 0)
			 {
				 a[i] = c;
			 }
			 if (i >= 1)
			 {
				 System.out.print(" ");
			 }
			 System.out.print(a[i]);
		}
	return 0;
	}
}

