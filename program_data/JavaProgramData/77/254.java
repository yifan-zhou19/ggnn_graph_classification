package <missing>;

public class GlobalMembers
{
	public static int qianshou(String children, int[] sign, int num, int time)
	{
		int i = 1;
		int j;
		int k;
		for (;i < num;i++)
		{
			if (time == num / 2 - 1)
			{
				System.out.printf("0 %d",num - 1);
				return 0;
			}
			if (sign[i] == 1)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				loop:
			continue;
			}
			for (k = i + 1;;k++)
			{
				if (children[i].equals(children[k]) && sign[k] != 1)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
				else if (!children[k].equals(children[i]) && sign[k] != 1)
				{
					break;
				}
			}
			sign[i] = 1;
			for (j = i;j < num;j++)
			{
				if (!children[j].equals(children[i]) && sign[j] == 0)
				{
					sign[j] = 1;
					break;
				}
			}
			System.out.printf("%d %d\n",i,j);
			time++;
			break;
		}
		qianshou(children, sign, num, time);
	}
	public static int Main()
	{
		int num;
		int i;
		int time = 0;
		String children = new String(new char[SIZE]);
		children = new Scanner(System.in).nextLine();
		num = children.length();
		int[] sign = new int[num];
		for (i = 0;i < num;i++)
		{
			sign[i] = 0;
		}
		qianshou(children, sign, num, time);

		return 0;
	}

}
