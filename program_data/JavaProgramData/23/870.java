package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
		int[] b = new int[101];
		int i;
		int chang;
		int j = 1;
		a = new Scanner(System.in).nextLine();
		b[0] = 0;
		chang = a.length();
		for (i = 0;i < chang;i++)
		{
			if (a.charAt(i) == ' ')
			{
				b[j] = i;
				j++;
			}
		}
		b[j] = chang;
		for (;j > 1;j--)
		{
			 for (i = b[j - 1] + 1;i < b[j];i++)
			 {
				 System.out.printf("%c",a.charAt(i));
			 }
			 System.out.print(" ");
		}
		for (i = 0;i < b[1];i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
	}
}
