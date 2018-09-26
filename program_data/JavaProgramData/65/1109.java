package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int ac = 0;
	  int bc = 0;
	  int a;
	  int b;
	  int i;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0; i < n; i++)
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
		if ((a + 1) % 3 == b)
		{
		  ac++;
		}
		else if ((b + 1) % 3 == a)
		{
		  bc++;
		}
	  }
	  if (ac > bc)
	  {
		System.out.print("A");
	  }
	  else if (bc > ac)
	  {
		System.out.print("B");
	  }
	  else
	  {
		System.out.print("Tie");
	  }
	  return 0;
	}
}

