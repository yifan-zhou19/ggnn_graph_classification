package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[6000]);
		int[] a = new int[300];
		int i;
		int j;
		int num;
		str = new Scanner(System.in).nextLine();
		for (j = 0,i = 1,num = 1;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) != ' ')
			{
				if (str.charAt(i - 1) == ' ')
				{
					a[j] = num;
					num = 1;
					j++;
				}
				else
				{
					num++;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",num);
		return 0;
	}
}
