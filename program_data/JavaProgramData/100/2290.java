package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int flag = 0;
		String a = new String(new char[300]);
		int[] b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				j = a.charAt(i) - 'A';
				b[j]++;
				flag = 1;
			}
			else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				j = a.charAt(i) - 'a';
				c[j]++;
				flag = 1;
			}

		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		else
		{
		for (i = 0;i < 26;i++)
		{
			if (b[i] == 0)
			{

			}
			else
			{
				System.out.printf("%c=%d\n",i + 'A',b[i]);
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (c[i] == 0)
			{

			}
			else
			{
				System.out.printf("%c=%d\n",i + 'a',c[i]);
			}
		}
		}

	}
}

