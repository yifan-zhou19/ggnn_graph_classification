public class String
{
	public int number;
	public int sequence;
	public int flag;
}

package <missing>;

public class GlobalMembers
{
	public static String[] b = new String[26]; //???
	public static String[] c = new String[26];

	public static int Main()
	{
		int t;
		int i;
		int count = 0;
		int x;
		String string = new String(new char[100]);
	//	char *p;
	//	p=string;
		int flag = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (count < t)
		{
			for (i = 0;i < 26;i++)
			{
				b[i].number = 0;
				b[i].sequence = 0;
				b[i].flag = 1;
			} //??t????????
			for (i = 0;i < 26;i++)
			{
				c[i].number = 0;
				c[i].sequence = 0;
				c[i].flag = 1;
			} //??t????????
			String = new Scanner(System.in).nextLine();
	//		puts(string);
			i = 0;
			while (String[i] != '\0')
			{
				x = string.charAt(i) - 97;
				b[x].number++;
				if (b[x].flag == 1)
				{
					b[x].sequence = i;
					b[x].flag = 0;
				}
				i++;
			} //??????????
			int j = 0;
			int min_number;
			for (i = 0;i < 26;i++)
			{
				if (b[i].number == 1)
				{
					flag = 0;
					break;
				}
				else
				{
					flag = 1;
				}
			} //???1??
			if (flag == 0) //????
			{
				for (i = 0,j = 0;i < 26;i++)
				{
					if (b[i].number == 1)
					{
						c[j].number = i;
						c[j].sequence = b[i].sequence;
						j++;
					} //???c??
				}
				for (i = 0;i < j;i++)
				{
					int min = c[0].sequence;
					min_number = c[0].number;
					if (c[i].sequence < min)
					{
						min = c[i].sequence;
						min_number = c[i].number;
					}
				}
				System.out.printf("%c\n",min_number + 97);
			}
			else if (flag == 1) //????????
			{
				System.out.print("no\n");
			}
			count++;
		}
		return 0;
	}
}

