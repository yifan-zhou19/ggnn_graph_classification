package <missing>;

public class GlobalMembers
{
	public static int com(Object ele1, Object ele2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		p1 = (int)ele1;
		p2 = (int)ele2;
		return p2 - p1;
	}


	public static int Main(String[] args)
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int num;
		int win = 0;
		int shu = 0;
		int i;
		while (true)
		{

			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num == 0)
			{
				break;
			}
			win = 0;
			int tt = num - 1;
			int tq = num - 1;
			int ht = 0;
			int hq = 0;
			shu = 0;
			for (i = 0;i < num;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < num;i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(a,num,(Integer.SIZE / Byte.SIZE),com);
			qsort(b,num,(Integer.SIZE / Byte.SIZE),com);
			while (ht <= tt)
			{
				if (b[tq] > a[tt])
				{
					hq++;
					tt--;
					shu++;
				}
				else if (b[tq] < a[tt])
				{
					win++;
					tt--;
					tq--;
				}
				else
				{
					if (a[ht] > b[hq])
					{
						win++;
						ht++;
						hq++;
					}
					else
					{
						if (a[tt] < b[hq])
						{
							shu++;
						}
						hq++;
						tt--;
					}

				}
			}
			System.out.print(200 * (win - shu));
			System.out.print("\n");
		}
		return EXIT_SUCCESS;
	}
}

