package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		char[][] str = new char[100][100];
		while (scanf("%s",str[i]) != EOF) //EOF?????
		{
			i++;
		}
		i--; //??????????,?????
			for (;i > 0;i--)
			{
			System.out.printf("%s ",str[i]);
			}
		System.out.printf("%s",str[0]);
	}

}
