package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int a;
	int ss = 0;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= a;i++)
	{
		   if (i % 7 == 0)
		   {
			   ss = ss;
		   }
		else if (i >= 70 && i < 80)
		{
			ss = ss;
		}
		else if (i % 10 == 7)
		{
			ss = ss;
		}
		else
		{
			ss = ss + i * i;
		}
	}
	System.out.printf("%d\n",ss);
	}

}

