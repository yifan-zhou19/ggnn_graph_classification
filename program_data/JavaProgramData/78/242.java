package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[] name = {'z', 'q', 's', 'l'};
		int[] w = new int[4];
		int i;
		int j;
		int p = 1;
		int r = 0;

		for (w[0] = 10;w[0] <= 50;w[0] += 10)
		{
			for (w[1] = 10;w[1] <= 50;w[1] += 10)
			{
				for (w[2] = 10;w[2] <= 50;w[2] += 10)
				{
					for (w[3] = 10;w[3] <= 50;w[3] += 10)
					{
					if (!(w[0] == w[1] || w[0] == w[2] || w[0] == w[3] || w[1] == w[2] || w[1] == w[3] || w[2] == w[3]) && (w[0] + w[1] == w[2] + w[3]) && (w[0] + w[3] > w[2] + w[1]) && (w[0] + w[2] < w[1]))
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto end;
					}
					}
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	;
		while (r < 4)
		{
			for (i = 0;i < 4;i++)
			{
				for (j = 0;j < 4;j++)
				{
					if (w[i] == w[j])
					{
						continue;
					}
					if (w[i] < w[j])
					{
						p = 0;
						break;
					}
				}
				if (p == 1)
				{
					System.out.printf("%c %d\n",name[i],w[i]);
					w[i] = 0;
					r++;
					break;
				}
				else
				{
					p = 1;
				}
			}
		}

	}
}
