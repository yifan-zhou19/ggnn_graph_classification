package <missing>;

public class GlobalMembers
{
	public static int reverse(int a)
	{
	  int[] s = new int[100];
	  int i = 10;
	  int j;
	  int b = 0;
	  if (a < 0)
	  {
		 a = a * (-1);
		 for (j = 1; ;j++)
		 {
			 s[j] = a % i;
			 b = s[j] + b * 10;
			 a = a / i;
			 if (a == 0)
			 {
			 break;
			 }
		 }
		 return -b;
	  }
	  else
	  {
		 for (j = 1; ;j++)
		 {
			 s[j] = a % i;
			 b = s[j] + b * 10;
			 a = a / i;
			 if (a == 0)
			 {
			 break;
			 }
		 }
	  }
	  return b;
	}
	public static int Main()
	{
		int[] a = new int[6];
		int i;
		for (i = 0;i <= 5;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		}
		for (i = 0;i <= 5;i++)


		{
				System.out.printf("%d\n",reverse(a[i]));
		}

	System.in.read();
	System.in.read();
	System.in.read();
	}


}

