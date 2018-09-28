package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int J;
		char c;
		int[] l = new int[300];
		c = System.in.read();
		while (c != '\n')
		{
			for (i = 0;c != ' ';)
			{
				i++;
				c = System.in.read();
				if (c == '\n')
				{
					break;
				}
			}
			l[j] = i;
			if (l[j] == 0)
			{
				j--;
			}
			if (c == '\n')
			{
				break;
			}
			else
			{
				j++;
		  c = System.in.read();
			}
		}
		J = j;
		System.out.printf("%d",l[0]);
		for (j = 1;j <= J;j++)
		{
			System.out.printf(",%d",l[j]);
		}


	}
}
