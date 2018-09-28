package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[6];
		int[] b = new int[6];
		int m;
		int reserve = int num;
		for (m = 0;m < 6;m++)
		{
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a[m] = Integer.parseInt(tempVar);
		 }
		 b[m] = reserve(a[m]);
		 System.out.printf("%d\n",b[m]);
		}
		 System.in.read();
		 System.in.read();
	}
	public static int reserve(int num)
	{
	  if (num == 0)
	  {
		return (0);
	  }
	  else
	  {
		int[] c = new int[200];
		int i;
		int j;
		int k;
		int s;
		for (i = 0;num != 0;i++)
		{
		 c[i] = num % 10;
		 num = num / 10;
		}
		s = 0;
		for (j = 0;j < i;j++)
		{
			for (k = 1;k < i - j;k++)
			{
				c[j] = c[j] * 10;
			}
			s = s + c[j];
		}
		 return (s);
	  }
	}
}

