package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		char d;
		int i;
		int j;
		int[] len = new int[300];
		i = 0;
		j = 0;
		d = '\0';
		while ((c = System.in.read()) != '\n')
		{
			if (c != ' ')
			{
				j++;
			}
			else
			{
				if (d != ' ')
				{
					len[i] = j;
					i++;
					j = 0;
				}
			}
			d = c;
		}
		len[i] = j;
		System.out.printf("%d",len[0]);
		for (j = 1;j <= i;j++)
		{
			System.out.printf(",%d",len[j]);
		}
		System.out.print("\n");
	}
}
