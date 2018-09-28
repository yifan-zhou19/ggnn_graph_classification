package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][20]; //????
		String p = a; //??????????a
		int count = 0; //?????
		char temp = '\0';
		while (temp != '\n') //?????????
		{
			*(p.Substring(count)) = ConsoleInput.readToWhiteSpace(true);
			temp = System.in.read(); //???????
			count++;
		}
		for (p = a;p < (a + count - 1);p++) //??
		{
			System.out.print(p);
			System.out.print(" ");
		}
		System.out.print(p);
		System.out.print("\n");
		return 0;
	}

}

