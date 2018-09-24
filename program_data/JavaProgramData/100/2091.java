package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[300]);
		int i;
		int j;
		int len;
		int s = 0;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		int[] count = new int[200];



		for (i = 65;i <= 90;i++)
		{
			count[i] = 0;
			for (j = 0;j < len;j++)
			{
				if (str.charAt(j) == i)
				{
					count[i] += 1;
				}
			}
			if (count[i] != 0)
			{
				System.out.printf("%c=%d\n",i,count[i]);
			}
		}

		for (i = 97;i <= 122;i++)
		{
			count[i] = 0;
			for (j = 0;j < len;j++)
			{
				if (str.charAt(j) == i)
				{
					count[i] += 1;
				}
			}
			if (count[i] != 0)
			{
				System.out.printf("%c=%d\n",i,count[i]);
			}
		}

		for (i = 65;i <= 90;i++)
		{
			s += count[i];
		}
		for (i = 97;i <= 122;i++)
		{
			s += count[i];
		}

		if (s == 0)
		{
			System.out.print("No");
		}
	}




}
