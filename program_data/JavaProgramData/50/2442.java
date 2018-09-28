package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int t;
	int day;
	int q;
	int[] i = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	t = 0;
	q = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	for (day = 1;day <= 365;day++)
	{
					  if (a > 7)
					  {
							 a = a - 7;
					  }
					  if (q > i[t])
					  {
								 q = q - i[t];
								 t = t + 1;
					  }
					  if (q == 13)
					  {
						  if (a == 5)
						  {
						  System.out.printf("%d\n",t + 1);
						  }
					  }
					  a = a + 1;
					  q = q + 1;
	}

	}

}

