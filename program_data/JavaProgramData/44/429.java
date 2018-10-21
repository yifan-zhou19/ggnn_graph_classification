package <missing>;

public class GlobalMembers
{
	// ??10.3.cpp : ??????????????
	//


	public static int reverse(int num)
	{
	  int x = num / 10;
	  int i = 0;
	  int total = 0;
	  while (x != 0)
	  {
		i++;
		x = x / 10;
	  }
	  total = i;
	  for (i = total;i >= 0;i--)
	  {
		x = x + (num % 10);
		num = num / 10;
		if (num == 0)
		{
		  break;
		}
		x = x * 10;
	  }
	  return x;
	}
	public static int Main()
	{
		int j = 0;
		int a = 0;
		int z = 0;
		for (j = 0;j < 6;j++)
		{
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  z = reverse(a);
		  System.out.printf("%d\n",z);
		}
		return 0;
	}


}

