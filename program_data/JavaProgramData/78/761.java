package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int zhao;
		int qian;
		int sun;
		int li;
		for (zhao = 1; zhao <= 5; zhao++)
		{
			for (qian = 0; qian <= 5; qian++)
			{
				for (sun = 1; sun <= 5; sun++)
				{
					li = zhao + qian - sun;
					if (li <= 5 && li > 0)
					{
					if ((zhao + li > sun + qian) && (zhao + sun < qian))
					{
					if (zhao != qian && zhao != sun && zhao != li)
					{
					if (qian != sun && qian != li)
					{
					if (sun != li)
					{
					for (int i = 5; i >= 1; i--)
					{
						if (zhao == i)
						{
							System.out.print("z ");
							System.out.print(zhao * 10);
							System.out.print("\n");
						}
						if (qian == i)
						{
							System.out.print("q ");
							System.out.print(qian * 10);
							System.out.print("\n");
						}
						if (sun == i)
						{
							System.out.print("s ");
							System.out.print(sun * 10);
							System.out.print("\n");
						}
						if (li == i)
						{
							System.out.print("l ");
							System.out.print(li * 10);
							System.out.print("\n");
						}
					}
					}
					}
					}
					}
					}
				}
			}
		}
		return 0;
	}
}
