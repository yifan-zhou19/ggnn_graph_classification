package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{ //?????
		int n = 0; //???????
		String[] a = {"\0"}; //??????
		int[] b = new int[100];
		int i = 0;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //?????????
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine(); //????????
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][0] == '_' || a[i][0] >= 'a' && a[i][0] <= 'z' || a[i][0] >= 'A' && a[i][0] <= 'Z')
			{
				for (j = 0;a[i][j] != '\0';j++)
				{
					if (a[i][j] >= '0' && a[i][j] <= '9' || a[i][j] >= 'A' && a[i][j] <= 'Z' || a[i][j] >= 'a' && a[i][j] <= 'z' || a[i][j] == '_')
					{
						b[i] = 1;
					}
					else
					{
						b[i] = 0;
						break;
					}
				}
			}
			else
			{
				b[i] = 0;
				continue;
			}
		} //????????????
		for (i = 0;i < n;i++)
		{
			System.out.print(b[i]);
			System.out.print("\n");
		} //?????1????0????
		return 0;
	} //?????
}

