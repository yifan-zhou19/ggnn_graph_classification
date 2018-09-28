package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int len;
		int num = 0;
		int n = 0;
		int i;
		int j;
		String s = new String(new char[30000]);
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) != ' ')
			{
				n++;
				if (i == len - 1)
				{
					a[num] = n;
				}
			}
			else if ((s.charAt(i) == ' ') && (s.charAt(i - 1) != ' '))
			{
				num++;
				a[num - 1] = n;
				n = 0;
			}
		}
		System.out.printf("%d",a[0]);
		if (num > 1)
		{
			for (j = 1;j <= num;j++)
			{
				System.out.printf(",%d",a[j]);
			}
		}
		return 0;
	}
}
