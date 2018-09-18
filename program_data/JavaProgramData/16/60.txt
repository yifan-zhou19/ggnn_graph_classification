package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int in; //m??????????321?????????1
		int k;
		int m;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			in = Integer.parseInt(tempVar);
		}
		if (in == 100)
		{
			System.out.print("001");
		}
		else
		{
			k = in;
			 for (;k > 0;)
			 {
				m = k % 10;
				k = k / 10;
				sum = sum * 10 + m;
			 }
			 System.out.printf("%d",sum);
		}
			 return 0;
	}





}

