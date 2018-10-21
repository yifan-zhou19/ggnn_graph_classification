package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	 int input;
	 int ret;
	 int num;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 input = Integer.parseInt(tempVar);
	 }

	for (;;)
	{
		if (input < 10)
		{
		System.out.printf("%d\n",input);
	break;
		}
	   num = input % 10;
	  input = input / 10;

	  System.out.printf("%d",num);

	}

	}


}

