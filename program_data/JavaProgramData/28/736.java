package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100000]);
		String p;
		p = s;
		p = new Scanner(System.in).nextLine();
		int[] num = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int i;
		int j = 0;
		int k = 0;
		int m = 0;
		q = num;
		for (i = 0; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i)) != ' ')
			{
				*(q + k) = *(q + k) + 1;
				j = 1;
			}
			else if (*(p.Substring(i)) == ' ' && j == 1)
			{
				k = k + 1;
				j = 0;
				m = k;
			}
		}
		if (m == 0)
		{
			System.out.printf("%d", q);
		}
		else
		{
			for (i = 0;i < m;i++)
			{
				System.out.printf("%d,",*(q + i));
			}
			System.out.printf("%d",*(q + m));
		}
	return 0;
	}
}
