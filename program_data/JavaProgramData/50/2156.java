package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int w;
		  int k = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  w = Integer.parseInt(tempVar);
		  }
		  if (((w = w + 12) % 7) == 5)
		  {
			  k++,System.out.print("1\n");
		  }
		  if (((w = w + 31) % 7) == 5)
		  {
			  k++,System.out.print("2\n");
		  }
		  if (((w = w + 28) % 7) == 5)
		  {
			  k++,System.out.print("3\n");
		  }
		  if (((w = w + 31) % 7) == 5)
		  {
			  k++,System.out.print("4\n");
		  }
		  if (((w = w + 30) % 7) == 5)
		  {
			  k++,System.out.print("5\n");
		  }
		  if (((w = w + 31) % 7) == 5)
		  {
			  k++,System.out.print("6\n");
		  }
		  if (((w = w + 30) % 7) == 5)
		  {
			  k++,System.out.print("7\n");
		  }
		  if (((w = w + 31) % 7) == 5)
		  {
			  k++,System.out.print("8\n");
		  }
		  if (((w = w + 31) % 7) == 5)
		  {
			  k++,System.out.print("9\n");
		  }
		  if (((w = w + 30) % 7) == 5)
		  {
			  k++,System.out.print("10\n");
		  }
		  if (((w = w + 31) % 7) == 5)
		  {
			  k++,System.out.print("11\n");
		  }
		  if (((w = w + 30) % 7) == 5)
		  {
			  k++,System.out.print("12\n");
		  }
		  if (k == 0)
		  {
			  System.out.print("Not found");
		  }

	}
}

