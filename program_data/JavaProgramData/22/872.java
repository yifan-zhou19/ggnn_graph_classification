package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b;
		int c = 0;
		char d;
		do
		{
					  String tempVar = ConsoleInput.scanfRead();
					  if (tempVar != null)
					  {
						  b = Integer.parseInt(tempVar);
					  }
					  String tempVar2 = ConsoleInput.scanfRead(null, 1);
					  if (tempVar2 != null)
					  {
						  d = tempVar2.charAt(0);
					  }
					  if (a > b)
					  {
							 if (b > c)
							 {
							 c = b;
							 }
					  }
					  if (a < b)
					  {
						  if (a > c)
						  {
						  c = a;
						  }
						  a = b;
					  }

		}while (d == ',');
		if (a == c || c == 0)
		{
		System.out.print("No");
		}
		else
		{
		System.out.printf("%d",c);
		}
		return 0;
	}

}

