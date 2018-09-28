package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] su = new int[5200];
		int i;
		int j;
		int k;
		int n;
		int flag;
		int[][] shu = new int[100000][2];
		su[0] = 3;
		su[1] = 5;
		su[2] = 7;
		su[3] = 11;
		su[4] = 13;
		su[5] = 17;
		su[6] = 19;
		su[7] = 23;
		su[8] = 29;
		su[9] = 31;
		su[10] = 37;
		su[11] = 41;
		su[12] = 43;
		su[13] = 47;
		k = 14;
		for (i = 53;i < 50000;i = i + 2)
		{
			flag = 1;
		   if (i % 3 == 0)
		   {
			   continue;
		   }
		   if (i % 5 == 0)
		   {
			   continue;
		   }
		   if (i % 7 == 0)
		   {
			   continue;
		   }
		   if (i % 11 == 0)
		   {
			   continue;
		   }
		   if (i % 13 == 0)
		   {
			   continue;
		   }
		   if (i % 17 == 0)
		   {
			   continue;
		   }
		   if (i % 19 == 0)
		   {
			   continue;
		   }
		   if (i % 23 == 0)
		   {
			   continue;
		   }
		   if (i % 29 == 0)
		   {
			   continue;
		   }
		   if (i % 31 == 0)
		   {
			   continue;
		   }
		   if (i % 37 == 0)
		   {
			   continue;
		   }
		   if (i % 41 == 0)
		   {
			   continue;
		   }
		   if (i % 43 == 0)
		   {
			   continue;
		   }
		   if (i % 47 == 0)
		   {
			   continue;
		   }
		   for (j = 53;j <= Math.pow(1.0 * i,0.5);j = j + 2)
		   {
			   if (i % j == 0)
			   {
			   flag = 0;
			   break;
			   }
		   }
			   if (flag != 0)
			   {
		   su[k] = i;
		   k++;
			   }
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j <= i;j++)
			{
				shu[su[i] + su[j]][0] = su[i];
				shu[su[i] + su[j]][1] = su[j];
			}
		}
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6;i <= n;i = i + 2)
		{
			System.out.print(i);
			System.out.print("=");
			System.out.print(shu[i][1]);
			System.out.print("+");
			System.out.print(shu[i][0]);
			System.out.print("\n");
		}
		return 0;
	}
}

