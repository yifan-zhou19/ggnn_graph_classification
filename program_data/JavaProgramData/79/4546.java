package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int m;
	  int count;
	  int number;
	  int del;
	  int i;
	  int j;
	  int[] monkeys = new int[302];
	  int[] result = new int[100];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  j = 0;
	  while (m > 0 && n > 0)
	  {
		j++;
		for (i = 1;i <= n;i++)
		{
		  monkeys[i] = 1;
		}
		number = 0;
		count = 0;
		del = 0;
		while (del < n - 1)
		{
		  number++;
		  if (number > n)
		  {
			number = 1;
		  }
		  if (monkeys[number] == 1)
		  {
			count++;
		  }
		  if (count == m)
		  {
			monkeys[number] = 0;
			del++;
			count = 0;
		  }
		}
		number = 1;
		while (true)
		{
		  if (monkeys[number] == 1)
		  {
			break;
		  }
		  number++;
		}
		result[j] = number;
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  n = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  m = Integer.parseInt(tempVar4);
	  }
	  }
	  for (i = 1;i <= j;i++)
	  {
		System.out.printf("%d\n",result[i]);
	  }
	  return 0;
	}
}

