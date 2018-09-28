package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int count = 0;
		final String a = "";
		char c = System.in.read();
		while (c != '\n')
		{
			if (c == ' ')
			{
				if (count != 0)
				{
					c = System.in.read();
					continue;
				}
				else if (count == 0)
				{
					i++;
					j = 0;
					count++;
				}
			}
			else
			{
				a.charAt(i)[j++] = c;
				count = 0;
			}
			c = System.in.read();
		} //??????????????????????????????????????????
		count = i;
		for (i = 0;i < count;i++)
		{
			for (j = 0;a.charAt(i)[j] != '\0';j++)
			{
				System.out.print(a.charAt(i)[j]);
			}
			System.out.print(" ");
		}
		for (i = 0;a.charAt(count)[i] != '\0';i++)
		{
			System.out.print(a.charAt(count)[i]);
		}
		return 0;
	}
}
