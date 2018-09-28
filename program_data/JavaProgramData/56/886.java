package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[5]);
		String b = new String(new char[5]);
		int i;
		int num;
		for (num = 0,i = 0;(a[i] = System.in.read()) != '\n';i++)
		{
			num++;
		}
		for (i = 0;i < num;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(num - i - 1));
		}
		for (i = 0;i < num;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}
	}
}

