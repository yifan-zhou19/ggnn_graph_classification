package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int ta = 0;
		int tb = 0;
		int i;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == b)
			{
				continue;
			}
			if (a == 1)
			{
			  if (b == 2)
			  {
				  ta++;
			  }
			  else
			  {
				  tb++;
			  }
			}
			else if (a == 2)
			{
			  if (b == 1)
			  {
				  tb++;
			  }
			  else
			  {
				  ta++;
			  }
			}
			else if (a == 0)
			{
			  if (b == 1)
			  {
				  ta++;
			  }
			  else
			  {
				  tb++;
			  }
			}
		}
		if (ta > tb)
		{
			System.out.print("A\n");
		}
		else if (ta < tb)
		{
			System.out.print("B\n");
		}
		else
		{
			System.out.print("Tie\n");
		}
	}
}

