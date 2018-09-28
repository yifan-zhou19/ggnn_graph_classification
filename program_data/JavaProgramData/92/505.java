package <missing>;

public class GlobalMembers
{
		public static int[] T = new int[1005];
		public static int[] Q = new int[1005];
		public static int[][] Save = new int[1005][1005];
	public static int Main()
	{

		int Num = 0;
		int i = 0;
		int Temp1 = 0;
		int Temp2 = 0;

		int j = 0;
		int Ans = -1000000;

		while ((Num != 0 && Num != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			Ans = -2000000;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(Save,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(T,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(Q,0,(Integer.SIZE / Byte.SIZE));

		for (i = 1;i <= Num;i++)
		{
			T[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= Num;i++)
		{
			Q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		sort(T + 1,T + Num + 1);
		sort(Q + 1,Q + Num + 1);

		reverse(T + 1,T + Num + 1);
		reverse(Q + 1,Q + Num + 1);


		for (i = 1;i <= Num;i++)
		{
			j = 0;
			Temp1 = Save[i - 1][j];

			if (T[Num - (i - 1 - j)] - Q[i] < 0)
			{
				Temp1 -= 200;
			}
			if (T[Num - (i - 1 - j)] - Q[i] > 0)
			{
				Temp1 += 200;
			}

				Save[i][j] = Temp1;


		//	cout<<"("<<i<<","<<j<<")-"<<Save[i][j]<<endl;
			for (j = 1;j <= i;j++)
			{
				Temp1 = Save[i - 1][j];
				Temp2 = Save[i - 1][j - 1];
				if (T[Num - (i - 1 - j)] - Q[i] < 0)
				{
					Temp1 -= 200;
				}
				if (T[Num - (i - 1 - j)] - Q[i] > 0)
				{
					Temp1 += 200;
				}
				if (T[j] - Q[i] < 0)
				{
					Temp2 -= 200;
				}
				if (T[j] - Q[i] > 0)
				{
					Temp2 += 200;
				}

				if (i <= j)
				{
					Temp1 = -2000000;
				}
				if (Temp1 > Temp2)
				{
					Save[i][j] = Temp1;
				}
				else
				{
					Save[i][j] = Temp2;
				}
			//			cout<<"("<<i<<","<<j<<")-"<<Save[i][j]<<endl;
			}
		}

		for (i = 1;i <= Num;i++)
		{
			if (Save[Num][i] > Ans)
			{
				Ans = Save[Num][i];
			}
		}

		System.out.print(Ans);
		System.out.print("\n");
		}
		return 0;
	}
}

