package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int[] count = new int[100];
		int i;
		int k = 1;
		int j;
		int m;
		count[0] = 0;
		for (i = 1;i < a.length();i++)
		{
			if (a.charAt(i - 1) == 32 && a.charAt(i) != 32)
			{
				count[k] = i;
				k++;
			}
		}
		for (m = count[k - 1];m < a.length();m++)
		{
		System.out.printf("%c",a.charAt(m));
		}
		for (j = k - 2;j >= 0;j--)
		{
			System.out.print(" ");
			for (m = count[j];m < count[j + 1] - 1;m++)
			{
				System.out.printf("%c",a.charAt(m));
			}
		}
		return 0;
	}
}
