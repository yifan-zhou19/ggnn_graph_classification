package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s;
		int i;
		int n;
		int j;
		int k;
		int m = 0;
		int p;
		int[][] x;
		int y = 0;
		int z = 0;
		int min;
		int q;
		int a;
		x = new int[100];
		for (y = 0;y < 100;y++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			*(x + y) = (int)malloc(3 * (Integer.SIZE / Byte.SIZE));
		}
		y = 0;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc(500 * (Character.SIZE / Byte.SIZE));
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n;i++)
		{
			m = 1;
			for (j = i + 1;j < n;j++)
			{
				if (*(s.Substring(i)) == *(s.Substring(j)))
				{
				m = 0;
				for (k = i + 1;k <= j - 1;k++)
				{
					if (*(s.Substring(k)) == *(s.Substring(j) - k + i))
					{
						m = 0;
					}
					else
					{
						m = 1;
					}
				}
				if (m == 0)
				{
					*(*(x + y)) = i;
					*(*(x + y) + 1) = j;
					*(*(x + y) + 2) = j - i;
					y++;
				}
				}
			}
		}
	for (a = 0;a < y;a++)
	{
		min = 501;
		for (z = 0;z < y;z++)
		{
	if (*(*(x + z) + 2) < min)
	{
		min = (*(x + z) + 2);
		q = z;
	}
		}
	for (p = (*(x + q) + 0);p <= *(*(x + q) + 1);p++)
	{
	System.out.printf("%c",*(s.Substring(p)));
	}
	System.out.print("\n");
	*(*(x + q) + 2) = 501;
	}


	}
}
