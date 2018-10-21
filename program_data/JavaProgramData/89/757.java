package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] num1 = new int[10000];
		int[] num2 = new int[10000];
		int[] order = new int[10000];
		int a;
		int b;
		for (i = 0;i < n;i++)
		{
		  num1[i] = 0;
		  num2[i] = 0;
		  order[i] = i;
		}
		while (true)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		  if (a == 0 && b == 0)
		  {
			break;
		  }
		  num2[a] = num2[a] + 1;
		  num1[b] = num1[b] + 1;
		}
		for (int k = 1;k < n;k++)
		{
		  for (i = 0;i < n - k;i++)
		  {
			if (num1[i] >= num1[i + 1])
			{
			  int e1 = num1[i + 1];
			  num1[i + 1] = num1[i];
			  num1[i] = e1;
			  int e2 = order[i + 1];
			  order[i + 1] = order[i];
			  order[i] = e2;
			  int f = num2[i + 1];
			  num2[i + 1] = num2[i];
			  num2[i] = f;
			}
		  }
		}
		int max = num1[n - 1];
		int num = 1;
		for (i = n - 1;max == num1[i];i--)
		{
		  num++;
		}
		if (max != n - 1)
		{
		  System.out.print("NOT FOUND");
		}
		if (max == n - 1)
		{
		  for (i = n - 1;num1[i] == n - 1;i--)
		  {
			if (num == 1)
			{
			  if (num2[i] == 0)
			  {
				System.out.printf("%d",order[i]);
				break;
			  }
			  if (num2[i] != 0)
			  {
				System.out.print("NOT FOUND");
				break;
			  }
			}
			if (num > 1)
			{
			  if (num2[i] == 0)
			  {
				System.out.printf("%d\n",order[i]);
			  }
			}
			  num--;
		  }
		}
		return 0;
	}
}

