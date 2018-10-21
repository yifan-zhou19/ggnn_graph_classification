package <missing>;

public class GlobalMembers
{
	public static int num;
	public static int i;
	public static int c;
	public static int[] a = new int[5];
	public static void Main()
	{
	 void move(int j,int k);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
	  if (num >= 10000)
	  {
		  c = 4;
		  move(num, c);
	  }
	  else if (num >= 1000 && num < 10000)
	  {
		  c = 3;
		  move(num, c);
	  }
	  else if (num >= 100 && num < 1000)
	  {
		  c = 2;
		  move(num, c);
	  }
	  else if (num >= 10 && num < 100)
	  {
		  c = 1;
		  move(num, c);
	  }
	  else
	  {
		  c = 0;
		  move(num, c);
	  }
	 for (i = 0;i <= c;i++)
	 {
	  System.out.printf("%d",a[i]);
	 }
	}
	public static void move(int j,int k)
	{
	 if (k > 0)
	 {
	 a[k] = (int)(j / (int)Math.pow(10,k));
	 int o = (int)(j % (int)Math.pow(10,k));
		move(o, k - 1);
	 }
	 else if (k == 0)
	 {
		 a[k] = j;
	 }
	}
}

