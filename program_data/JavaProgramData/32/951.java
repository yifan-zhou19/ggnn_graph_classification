package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  char[][] miner = new char[20][101];
	  char[][] minee = new char[20][101];
	  int i;
	  int sp;
	  int k;
	  int pr;
	  int lr;
	  int le;
		 for (i = 1;i <= n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 miner[i] = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 minee[i] = tempVar3.charAt(0);
			 }
			 lr = String.valueOf(miner[i]).length();
			 le = String.valueOf(minee[i]).length();
			 while (le >= 1)
			 {
				 if (miner[i][lr - 1] >= minee[i][le-1])
				 {
					 miner[i][lr - 1] = miner[i][lr - 1] - minee[i][le-1] + '0';
				 }
				  else
				  {
					  sp = lr - 2;
				  while (miner[i][sp] == '0')
				  {
					  miner[i][sp] = '9';
					  sp--;
				  }
				  miner[i][sp] = miner[i][sp] - 1;
				  miner[i][lr - 1] = miner[i][lr - 1] - minee[i][le-1] + '0' + 10;
				  }

			 le--;
			 lr--;
			 }
			k = 0;
			lr = String.valueOf(miner[i]).length();
			while (true)
			{
				if (miner[i][k] == '0')
				{
					k++;
				}
				else
				{
					break;
				}
			}
			for (pr = k;pr <= lr - 1;pr++)
			{
				System.out.printf("%c",miner[i][pr]);
			}
			System.out.print("\n");
		 }

	}


}

