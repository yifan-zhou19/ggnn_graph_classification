package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[5000]);
		int i;
		int[] num = new int[300];
		int b = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != 0;i++)
		{
			if (a.charAt(i) != ' ')
			{
				num[b]++;
			}
			else
			{
				b++;
			}


		}
		for (i = 0;i <= b;i++)
		{
			if (num[i] != 0)
			{
				System.out.printf("%d",num[i]);
				if (i != b)
				{
				System.out.print(",");
				}
			}
		}

	return 0;
	}

}
