package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int word = 1;
		int i;
		int k = 0;
		int[] a = new int[301];
		String str = new String(new char[10000]);
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == ' ' && word == 1)
			{
				word = 0;
				k = k + 1;
			}
			if (str.charAt(i) != ' ')
			{
				a[k] = a[k] + 1;
				word = 1;
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i <= k;i++)
		{
			System.out.printf(",%d",a[i]);
		}
	}
}
