package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int num;
	  int i;
	  int num2 = 0;
	  int b;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  num = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= 6;i++)
	  {
		b = num % 10;
		num = num / 10;
		if (b != 0)
		{
			num2 = num2 * 10 + b;
		}
	  }
	System.out.printf("%d",num2);
	}

}

