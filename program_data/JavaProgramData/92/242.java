package <missing>;

public class GlobalMembers
{
	public static int[] num1 = new int[1001];
	public static int[] num2 = new int[1001];
	public static int num;
	public static int compare(Object p1, Object p2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * q1,* q2;
		int q1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * q2;
		int q2;
		q1 = (int) p1;
		q2 = (int) p2;
		return q1 - q2;
	}
	public static int Main()
	{
		while (true)
		{

			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num == 0)
			{
				break;
			}
			for (int i = 1;i <= num;i++)
			{
				num1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 1;i <= num;i++)
			{
				num2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort((num1[1]), num, (Integer.SIZE / Byte.SIZE), compare);
			qsort((num2[1]), num, (Integer.SIZE / Byte.SIZE), compare);
			int p1;
			int p2;
			int p3;
			int p4;
			p1 = 1;
			p2 = num;
			p3 = 1;
			p4 = num;
			int money = 0;
			while (true)
			{
				if (p1 == p2)
				{
					if (num1[p1] > num2[p3])
					{
						money++;
					}
					if (num1[p1] < num2[p3])
					{
						money--;
					}
					break;
				}
				else
				{
					if (num1[p1] > num2[p3])
					{
						money++;
						p1++;
						p3++;
						continue;
					}
					if (num1[p2] > num2[p4])
					{
						money++;
						p2--;
						p4--;
						continue;
					}
					if (num1[p1] < num2[p4])
					{
						money--;
					}
					if (num1[p1] > num2[p4])
					{
						money++;
					}
					p1++;
					p4--;
				}
			}
			System.out.print(money * 200);
			System.out.print("\n");
		}
		return 0;
	}
}

