package <missing>;

public class GlobalMembers
{
	// greedy.cpp : Defines the entry point for the console application.
	//

	public static int compare(Object a, Object b)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *x=(int *)a;
		int x = (int)a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *y=(int *)b;
		int y = (int)b;
		return (y) - x;

	}
	public static int Main()
	{

		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		int[] king = new int[1000];
		int[] tianji = new int[1000];
		int win = 0;
		int lose = 0;
		int equal = 0;
		int game = 0;
		int count = 0;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				tianji[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				king[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(tianji, n, (Integer.SIZE / Byte.SIZE),compare);
			qsort(king, n, (Integer.SIZE / Byte.SIZE), compare); //?????
		//	int game=0;//game= ????????, game ?? ??????? n???????
		//	int count=0;//
		//	int ans=0;
			j = 0;
			i = 0;
			while (j < game && tianji[j] < king[i])
			{
					i++;
			}
			int max = -1000000;
			for (k = i;k < n;k++)
			{
				game = -200 * k;
				count = 0;
				for (j = k;j < n;j++)
				{
					if (tianji[count] < king[j])
					{
						game += -200;
					}
					else
					{
						if (tianji[count] == king[j])
						{
							game += 0;
						}
						else
						{
							game += 200;
						}
					}
						count++;

				}
				if (game > max)
				{
					max = game;
				}
				//cout<<"game"<<game<<endl;
			}
			System.out.print(max);
			System.out.print("\n");

		}
		return 0;
	}
}

