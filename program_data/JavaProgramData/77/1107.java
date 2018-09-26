package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int std;
		int a = 0;
		int i = 0;
		int flag = 1;
		int[] boy = new int[100];
		while ((c = System.in.read()) != '\n')
		{
			if (flag == 1)
			{
			std = c;
			flag = 0;
			}
		if (c == std)
		{
			boy[i] = a;
			i++;
		}
		else
		{
			System.out.printf("%d %d\n",boy[--i],a);
		}
		a++;
		}
		return 0;
	}

}
