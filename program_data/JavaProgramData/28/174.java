package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		String b = new String(new char[800]);
		int k = 0;
		int i;
		int space = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 800;i++)
		{
			b = b.substring(0, i);
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != ' ')
			{
				b.charAt(k)++;
				space = 0;
			}
			else
			{
				space++;
				if (space == 1)
				{
					k++;
				}
			}
		}
		for (i = 0;i <= k;i++)
		{
			System.out.printf("%d",b.charAt(i));
			if (i < k)
			{
				System.out.print(",");
			}
		}
	}


}
