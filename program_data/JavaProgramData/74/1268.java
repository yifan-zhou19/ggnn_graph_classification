package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
	 int[] t = new int[100];

	 int i;
	 int j = 0;
	 int ifhw = int num;
	 int ifs = int num;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 for (i = m;i <= n;i++)
	 {
		 if (ifhw(i) != 0)
		 {
		 if (ifs(i) != 0)
		 {
			  t[j] = i;
		  j++;
		 }
		 }
	 }

	 j--;
	 if (t[0] == 0)
	 {
	  System.out.print("no");
	 }
	  else
	  {
		  for (i = 0;i < j;i++)
		  {
	   System.out.printf("%d,",t[i]);
		  }
	   System.out.printf("%d\n",t[j]);
	  }
	}


	public static int ifhw(int num)
	{
		int[] digit = new int[10];
	 int i = 0;
	 int n;
	 while (num > 0)
	 {
		  digit[i] = num - num / 10 * 10;
	   i++;
	   num = num / 10;
	 }
	   n = i;
	 for (i = 0;i < n / 2;i++)
	 {
		  if (digit[i] != digit[n - i - 1])
		  {
			return (0);
		break;
		  }
	 }
	}

	public static int ifs(int num)
	{
		int i;
	 for (i = 2;i < num;i++)
	 {
		 if (num % i == 0)
		 {
		  return (0);
	  break;
		 }
	 }
	}
}

