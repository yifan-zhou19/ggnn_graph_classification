package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int y;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				b = Integer.parseInt(tempVar4);
			}
			int[] t = new int[15];
			if (y % 100 == 0)
			{
					if (y % 400 == 0) //runnian
					{
						t[1] = 1;
						t[2] = t[1] + 31;
						t[3] = t[2] + 29;
						t[4] = t[3] + 31;
						t[5] = t[4] + 30;
						t[6] = t[5] + 31;
						t[7] = t[6] + 30;
						t[8] = t[7] + 31;
						t[9] = t[8] + 31;
						t[10] = t[9] + 30;
						t[11] = t[10] + 31;
						t[12] = t[11] + 30;
					//if(   (t[a]-t[b]>0&&(t[a]-t[b])%7==0)    ||  (t[a]-t[b]<0&&(t[b]-t[a])%7==0)  )
				   // printf("YES");
					}
					else
					{
						t[1] = 1;
						t[2] = t[1] + 31;
						t[3] = t[2] + 28;
						t[4] = t[3] + 31;
						t[5] = t[4] + 30;
						t[6] = t[5] + 31;
						t[7] = t[6] + 30;
						t[8] = t[7] + 31;
						t[9] = t[8] + 31;
						t[10] = t[9] + 30;
						t[11] = t[10] + 31;
						t[12] = t[11] + 30;
					}
			}
			else if (y % 4 == 0)
			{
						t[1] = 1;
						t[2] = t[1] + 31;
						t[3] = t[2] + 29;
						t[4] = t[3] + 31;
						t[5] = t[4] + 30;
						t[6] = t[5] + 31;
						t[7] = t[6] + 30;
						t[8] = t[7] + 31;
						t[9] = t[8] + 31;
						t[10] = t[9] + 30;
						t[11] = t[10] + 31;
						t[12] = t[11] + 30;
			}
			else
			{
				t[1] = 1;
						t[2] = t[1] + 31;
						t[3] = t[2] + 28;
						t[4] = t[3] + 31;
						t[5] = t[4] + 30;
						t[6] = t[5] + 31;
						t[7] = t[6] + 30;
						t[8] = t[7] + 31;
						t[9] = t[8] + 31;
						t[10] = t[9] + 30;
						t[11] = t[10] + 31;
						t[12] = t[11] + 30;
			}


			if ((t[a] - t[b] > 0 && (t[a] - t[b]) % 7 == 0) || (t[a] - t[b] < 0 && (t[b] - t[a]) % 7 == 0))
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}

	}

}

