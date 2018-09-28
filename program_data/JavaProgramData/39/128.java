package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] name = new char[1000][1000];
		char leader;
		char west;
		String tem = new String(new char[1000]);
		int n;
		int i;
		int all = 0;
		int j;
		int a;
		int b;
		int t;
		int[] money = new int[5];
		int[] sum = new int[1000];
		int paper;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  name[i] = tempVar2.charAt(0);
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
			  String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			  if (tempVar5 != null)
			  {
				  leader = tempVar5.charAt(0);
			  }
			  String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			  if (tempVar6 != null)
			  {
				  west = tempVar6.charAt(0);
			  }
			  String tempVar7 = ConsoleInput.scanfRead(" ");
			  if (tempVar7 != null)
			  {
				  paper = Integer.parseInt(tempVar7);
			  }
			  if (a > 80 && paper > 0)
			  {
				  money[0] = 8000;
			  }
			  else
			  {
				  money[0] = 0;
			  }
			  if (a > 85 && b > 80)
			  {
				  money[1] = 4000;
			  }
			  else
			  {
				  money[1] = 0;
			  }
			  if (a > 90)
			  {
				  money[2] = 2000;
			  }
			  else
			  {
				  money[2] = 0;
			  }
			  if (a > 85 && west == 'Y')
			  {
				  money[3] = 1000;
			  }
			  else
			  {
				  money[3] = 0;
			  }
			  if (b > 80 && leader == 'Y')
			  {
				  money[4] = 850;
			  }
			  else
			  {
				  money[4] = 0;
			  }
			  sum[i] = money[0] + money[1] + money[2] + money[3] + money[4];
		  }
		  for (i = 0;i < n;i++)
		  {
			  all += sum[i];
		  }
		  for (j = 0;j < n - 1;j++)
		  {
			  for (i = 0;i < n - 1 - j;i++)
			  {
				  if (sum[i] < sum[i + 1])
				  {
					   t = sum[i];
					   sum[i] = sum[i + 1];
					   sum[i + 1] = t;
					   tem = name[i];
					   name[i] = name[i + 1];
					   name[i + 1] = tem;
				  }
			  }
		  }
				  System.out.printf("%s\n%d\n%d",name[0],sum[0],all);


				return 0;

	}

}

