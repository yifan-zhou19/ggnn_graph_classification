package <missing>;

public class GlobalMembers
{
	public static void everydouble(int[] a)
	{
		 int i;
		 for (i = 0;i <= 99;i++)
		 {
			 a[i] *= 2;
		 }
	}

	public static void moveahead(int[] a)
	{
		 int i;
		 for (i = 0;i <= 99;i++)
		 {
			 if (a[i] >= 10)
			 {
				 a[i] -= 10;
				 a[i + 1]++;
			 }
		 }
	}

	public static void print(int[] a)
	{
		 int flag = 0;
		 int i;
		 for (i = 0;i <= 99;i++)
		 {
			 if (a[i] != 0)
			 {
				flag = i;
			 }
		 }
		 for (i = flag;i >= 0;i--)
		 {
		 System.out.printf("%d",a[i]);
		 }
	}

	public static void Main(String[] args)
	{
	  int n;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] a = new int[100];
	  a[0] = 1;
	  for (i = 1;i <= 99;i++)
	  {
		  a[i] = 0;
	  }
	  for (i = 0;i <= n - 1;i++)
	  {
		  everydouble(a);
		  moveahead(a);
	  }
	  print(a);
	}

}

