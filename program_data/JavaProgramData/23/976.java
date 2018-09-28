package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		char[][] str = new char[100][100];
		String p = new String(new char[100]);
		p = str;
		while (scanf("%s",p.Substring(i)) != EOF) //EOF?????
		{
			i++;
		}
		i--; //??????????,?????
			for (;i > 0;i--)
			{
			System.out.printf("%s ",p.Substring(i));
			}
		System.out.printf("%s",p);
	}
}
