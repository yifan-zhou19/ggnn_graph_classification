public class mounth
{
	public int week;
	public int days;
}

package <missing>;

public class GlobalMembers
{
	public static mounth[] M =
	{
		new mounth(1, 31),
		new mounth(2, 28),
		new mounth(3, 31),
		new mounth(4, 30),
		new mounth(5, 31),
		new mounth(6, 30),
		new mounth(7, 31),
		new mounth(8, 31),
		new mounth(9, 30),
		new mounth(10, 31),
		new mounth(11, 30),
		new mounth(12, 31)
	};
	public static void Main()
	{
		int w;
		int i;
		int total = 12;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		if ((w + total) % 7 == 5)
		{
			System.out.print("1\n");
		}
		for (i = 0;i < 11;i++)
		{
			total = total + M[i].days;
			if ((w + total) % 7 == 5)
			{
				System.out.printf("%d\n",i + 2);
			}
		}
	}
}

