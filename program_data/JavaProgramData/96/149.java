package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String num = new String(new char[101]);
		  int i;
		  int first;
		  int lenth;
		  int mod;
		  int cache;
		  num = new Scanner(System.in).nextLine();
		  lenth = num.length();
		  int[] bit = new int[lenth];
		  for (i = 0;i < lenth;i++)
		  {
		  bit[i] = num.charAt(i) - '0';
		  }
		  if (lenth == 1)
		  {
		  System.out.printf("0\n%d",bit[0]);
		  }
		  else if (lenth == 2 && bit[0] * 10 + bit[1] < 13)
		  {
		  System.out.printf("0\n%d",bit[0] * 10 + bit[1]);
		  }
		  else
		  {
				first = bit[0] * 10 + bit[1];
				if (first / 13 != 0)
				{
				System.out.printf("%d",first / 13);
				}
				mod = first % 13;
				for (i = 2;i < lenth;i++)
				{
						 cache = mod * 10 + bit[i];
						 System.out.printf("%d",cache / 13);
						 mod = cache % 13;
				}
				System.out.printf("\n%d",mod);
		  }
		  System.in.read();
		  System.in.read();
	}

}
