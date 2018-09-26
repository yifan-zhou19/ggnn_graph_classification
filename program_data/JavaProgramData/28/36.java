package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] l = new int[500];
		int i;
		int max;
		int k;
		int zero = 1;
		char temp;
		max = 1;
		temp = System.in.read();
		while (temp != '\n')
		{
			if (temp != ' ')
			{
				l[max]++;
				zero = 1;
			}
			else
			{
				if (zero == 1)
				{
					max++;
				}
				zero = 0;
			}
			temp = System.in.read();
	//		printf("%c",temp);
	//		printf("%d\n",max);
		}
		for (i = 1;i <= max;i++)
		{
			if (i != 1)
			{
				System.out.print(",");
			}
			System.out.printf("%d",l[i]);
		}
	}

}
