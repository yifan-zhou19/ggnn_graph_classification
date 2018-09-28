package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[3000]);
		c = new Scanner(System.in).nextLine();
		int i;
		int j;
		int len;
		int temp;
		len = c.length();
		c = tangible.StringFunctions.changeCharacter(c, len, ' ');
		int[] a = new int[100];
		j = 1;
		for (i = 0;i <= len;i++)
		{
			if (c.charAt(i) == ' ')
			{
				a[j] = i;
				j++;
			}
		}
		System.out.printf("%d",a[1]);
		for (i = 2;i < j;i++)
		{
			temp = a[i] - a[i - 1] - 1;
			if (temp != 0)
			{
				System.out.printf(",%d",temp);
			}
		}
	}





}

