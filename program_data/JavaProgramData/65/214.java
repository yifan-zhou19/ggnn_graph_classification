package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a;
		int b;
		int c;
		int A;
		int B;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0,b = 0,c = 0,i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				B = Integer.parseInt(tempVar3);
			}
			if ((A == 0) && (B == 1))
			{
				a++;
			}
			else if ((A == 1) && (B == 2))
			{
				a++;
			}
			else if ((A == 2) && (B == 0))
			{
				a++;
			}
			else if ((A == 1) && (B == 0))
			{
				b++;
			}
			else if ((A == 2) && (B == 1))
			{
				b++;
			}
			else if ((A == 0) && (B == 2))
			{
				b++;
			}
			else if ((B == 0) && (A == 0))
			{
				c++;
			}
			else if ((B == 1) && (A == 1))
			{
				c++;
			}
			else if ((B == 2) && (A == 2))
			{
				c++;
			}
			//printf("%d-%d ",a,b);
		}
		//printf("%d %d",a,b);
		if (a > b)
		{
			System.out.print("A");
		}
		else if (a == b)
		{
			System.out.print("Tie");
		}
		else if (a < b)
		{
			System.out.print("B");
		}
		return 0;
	}

}

