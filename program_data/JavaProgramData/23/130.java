package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[101]);
	int[] num = new int[100];
	str = new Scanner(System.in).nextLine();
	 int i;
	 int j;
	 int n = 0;
	 int m;
	 for (i = 0;str.charAt(i) != '\0';i++)
	 {
		 if (str.charAt(i) == 32)
		 {
			 n++;
		 }
	 }
	 if (n == 0)
	 {
		 System.out.println(str);
	 }
	 else
	 {
		 n = str.length();
			for (i = n - 1;i >= 0;i--)
			{
				if (str.charAt(i) == 32)
				{
					m = i;
					for (j = i + 1;str.charAt(j) != 32 && str.charAt(j) != '\0';j++)
					{
						System.out.printf("%c",str.charAt(j));
					}
					System.out.print(" ");
				}
			}
		for (i = 0;str.charAt(i) != 32;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
	 }
	}
}
