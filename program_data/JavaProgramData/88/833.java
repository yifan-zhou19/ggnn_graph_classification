package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[300]);
		int[] a = new int[300];
		str = new Scanner(System.in).nextLine();
		int i;
		for (i = 0;i < str.length();i++)
		{
			a[i] = str.charAt(i);

		}
				for (i = 0;i < str.length();i++)
				{
			   if (a[i] >= 48 && a[i] <= 57)
			   {

			System.out.printf("%c",str.charAt(i));

			if (1 - (a[i + 1] <= 57 && a[i + 1] >= 48))
			{
				System.out.print("\n");
			}
			   }
				}

	}
}
