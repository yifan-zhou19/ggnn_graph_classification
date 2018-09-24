package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
	 int t = 1;
	 int b = 0;
	 int x = 0;
	 int i;
	 int j;
	 int[] k = new int[10];
	 int[] h = new int[10];
	// scanf("%d",&num);
	 for (i = 0;num != 0;i++)
	 {
			k[i] = num % 10;
	  b = b + 1;
		 num = (num - num % 10) / 10;
	  t = t * 10;
	 }
	 t = t / 10;
		for (i = 0;i < b;i++)
		{
		 if (k[i] != 0)
		 {
			 break;
		 }
	  else
	  {
		  t = t / 10;
	  }
		}
	 for (j = 0;j < b - i;j++)
	 {
	  h[j] = k[i + j];
	 }
	 for (j = 0;j < b - i;j++)
	 {
		 x = x + h[j] * t;
		 t = t / 10;
	 }
	 return (x);
	}

	public static void Main()
	{
	 int[] a = new int[6];
	 int i;
	 for (i = 0;i < 6;i++)
	 {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a[i] = Integer.parseInt(tempVar);
	  }
	 }

	 for (i = 0;i < 6;i++)
	 {
	  System.out.printf("%d\n",reverse(a[i]));
	 }
	}
}

