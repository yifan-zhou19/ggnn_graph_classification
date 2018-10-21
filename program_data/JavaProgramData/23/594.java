package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int i = 0;
	char[][] a = new char[100][100]; //??????????
	for (;;)
	{
		String c = new String(new char[100]); //???????
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int j = 0;j < 100;j++)
		{
			a[i][j] = c.charAt(j); //??
		}
		i++;
		if (System.in.read() == '\n') //????break
		{
			break;
		}
	}
	for (int j = i - 1;j > 0;j--)
	{
		System.out.print(a[j]);
		System.out.print(" ");
	}
	System.out.print(a[0]);
	return 0;
	}




}

