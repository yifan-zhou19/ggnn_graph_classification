package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] p = new int[50];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(p,0,200); //????
		p[0] = 1;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 50;j++)
			{
			p[j] = p[j] * 2;
			} //?????
			for (j = 0;j < 50;j++)
			{
				if (p[j] >= 10)
				{
					p[j] = p[j] % 10;
					p[j + 1] = p[j + 1] + 1;
				} //?????2????????1
			}
		}
		for (i = 49;i >= 0;i--)
		{
			if (p[i] == 0 && k == 1)
			{
				continue;
			} //??????0
			if (p[i] != 0)
			{
				k = 0;
			}
			System.out.print(p[i]);
		} //??????p
		return 0;
	} //?????

}

